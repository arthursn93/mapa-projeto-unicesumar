package mapaprojeto;

public class Senha {

    String senha;
    Integer numero;

    public Senha(){
        this.senha = "";
    }
    
    public Senha(String senha, Integer numero){
        this.senha = senha;
        this.numero = numero;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.senha + "-" + this.numero;
    }
    
    
    
}

