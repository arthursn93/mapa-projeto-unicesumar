package mapaprojeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Controla a fila única de senhas e a chamada de cada caixa.
 *
 * Regras de prioridade do banco:
 * - Caixa 1: atende Preferencial (P); sem P, atende o próximo da fila.
 * - Caixas 2 e 3: atendem Rápido (R); sem R, atendem o próximo da fila.
 * - Caixa 4: atende Comum (C); sem C, atende o próximo da fila.
 */
public class ControleAtendimento {

    public static final String PREFERENCIAL = "P";
    public static final String RAPIDO = "R";
    public static final String COMUM = "C";

    private final List<Senha> fila = new ArrayList<>();
    private int numero = 0;

    /**
     * Gera uma nova senha do tipo informado e a coloca no fim da fila.
     * A numeração é sequencial e compartilhada entre todos os tipos.
     */
    public Senha gerarSenha(String tipo) {
        numero++;
        Senha senha = new Senha(tipo, numero);
        fila.add(senha);
        return senha;
    }

    /**
     * Busca a próxima senha para o caixa, retira da fila e a devolve.
     * Retorna vazio se a fila estiver vazia.
     */
    public Optional<Senha> chamarProxima(int caixa) {
        String tipoPrioritario = tipoPrioritario(caixa);

        // Senhas do tipo prioritário do caixa vêm primeiro; o desempate é a
        // ordem de chegada (número sequencial).
        Optional<Senha> proxima = fila.stream()
                .min(Comparator.comparing((Senha s) -> !s.getSenha().equals(tipoPrioritario))
                        .thenComparing(Senha::getNumero));

        proxima.ifPresent(fila::remove);
        return proxima;
    }

    /** Tipo de senha que cada caixa atende primeiro. */
    static String tipoPrioritario(int caixa) {
        switch (caixa) {
            case 1:
                return PREFERENCIAL;
            case 2:
            case 3:
                return RAPIDO;
            case 4:
                return COMUM;
            default:
                throw new IllegalArgumentException("Caixa inexistente: " + caixa);
        }
    }

    /** Visão somente leitura da fila atual. */
    public List<Senha> getFila() {
        return Collections.unmodifiableList(fila);
    }
}
