
package mapaprojeto;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * UNICESUMAR - Análise e Desenvolvimento de Sistemas
 * MAPA - ADS - PROGRAMAÇÃO II
 * Nome: Arthur da Silva Nunes
 * RA: 20049591-5
 * 
 */

public class Principal extends javax.swing.JFrame {
    
    List<Senha> listaDeSenhas;
    int numero;    
    

    public Principal() {
        initComponents();
        
        numero = 0;
        listaDeSenhas = new ArrayList<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAtendimento = new javax.swing.JLabel();
        bComum = new javax.swing.JButton();
        bRapido = new javax.swing.JButton();
        bPrioritario = new javax.swing.JButton();
        lblInformaSenha = new javax.swing.JLabel();
        txtInformaSenha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bCaixa1 = new javax.swing.JButton();
        bCaixa3 = new javax.swing.JButton();
        bCaixa2 = new javax.swing.JButton();
        bCaixa4 = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        lblCaixa = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblMostraCaixa = new javax.swing.JLabel();
        lblMostraSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 217, 223));

        lblAtendimento.setText("Escolha o seu tipo de atendimento:");

        bComum.setText("Comum");
        bComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComumActionPerformed(evt);
            }
        });

        bRapido.setText("Rápido");
        bRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRapidoActionPerformed(evt);
            }
        });

        bPrioritario.setText("Prioritário");
        bPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrioritarioActionPerformed(evt);
            }
        });

        lblInformaSenha.setText("Sua senha é:");

        txtInformaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformaSenhaActionPerformed(evt);
            }
        });
        txtInformaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInformaSenhaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bComum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRapido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPrioritario))
                    .addComponent(lblAtendimento)
                    .addComponent(lblInformaSenha)
                    .addComponent(txtInformaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bComum)
                    .addComponent(bRapido)
                    .addComponent(bPrioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblInformaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInformaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(214, 217, 223));

        bCaixa1.setText("Caixa 1");
        bCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCaixa1ActionPerformed(evt);
            }
        });

        bCaixa3.setText("Caixa 3");
        bCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCaixa3ActionPerformed(evt);
            }
        });

        bCaixa2.setText("Caixa 2");
        bCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCaixa2ActionPerformed(evt);
            }
        });

        bCaixa4.setText("Caixa 4");
        bCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCaixa1)
                    .addComponent(bCaixa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCaixa4)
                    .addComponent(bCaixa3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCaixa1)
                    .addComponent(bCaixa3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCaixa4)
                    .addComponent(bCaixa2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCliente.setText("Para clientes:");

        lblCaixa.setText("Para caixas:");

        lblMostraCaixa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMostraCaixa.setText("CAIXA");

        lblMostraSenha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMostraSenha.setText("SENHA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostraCaixa)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMostraSenha))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblMostraCaixa, lblMostraSenha});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMostraCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCaixa)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaixa)
                    .addComponent(lblCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComumActionPerformed
        numero++;
        Senha senha = new Senha("C", numero);
        listaDeSenhas.add(senha);
        lblMostraSenha.setText(String.valueOf(senha.getSenha() + "-" + senha.getNumero()));
        txtInformaSenha.setText(String.valueOf(senha.getSenha() + "-" + senha.getNumero()));
    }//GEN-LAST:event_bComumActionPerformed

    private void bRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRapidoActionPerformed
        numero++;
        Senha senha = new Senha("R", numero);
        listaDeSenhas.add(senha);
        lblMostraSenha.setText(String.valueOf(senha.getSenha() + "-" + senha.getNumero()));
        txtInformaSenha.setText(String.valueOf(senha.getSenha() + "-" + senha.getNumero()));
    }//GEN-LAST:event_bRapidoActionPerformed

    private void bCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCaixa1ActionPerformed
        Iterator<Senha> itr = listaDeSenhas.iterator();        
        Iterator<Senha> itr2 = listaDeSenhas.iterator();
        
        while(itr.hasNext()){
        Senha se = itr.next();
        
            if(se.getSenha().startsWith("P")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 1");
                System.out.println("lista: "+listaDeSenhas.toString());
                                    
                itr.remove();
                return;

            }     
        } 
        while(itr2.hasNext()){
        Senha se = itr2.next();
        
        if(se.getSenha().endsWith("C") || se.getSenha().endsWith("R")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 1");
                System.out.println("lista: "+listaDeSenhas.toString());                                        

                itr2.remove();
                break;
            }
        }    
    }//GEN-LAST:event_bCaixa1ActionPerformed

    private void txtInformaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformaSenhaActionPerformed
    }//GEN-LAST:event_txtInformaSenhaActionPerformed

    private void bPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrioritarioActionPerformed
        numero++;
        Senha senha = new Senha("P", numero);
        listaDeSenhas.add(senha);
        lblMostraSenha.setText(String.valueOf(senha.getSenha() + "-" + senha.getNumero()));
        txtInformaSenha.setText(String.valueOf(senha.getSenha() + "-" + senha.getNumero()));          
    }//GEN-LAST:event_bPrioritarioActionPerformed

    private void bCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCaixa2ActionPerformed
        Iterator<Senha> itr = listaDeSenhas.iterator();        
        Iterator<Senha> itr2 = listaDeSenhas.iterator();
        
        while(itr.hasNext()){
        Senha se = itr.next();
        
            if(se.getSenha().startsWith("R")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 2");
                System.out.println("lista: "+listaDeSenhas.toString());
                                    
                itr.remove();
                return;

            }     
        } 
        while(itr2.hasNext()){
        Senha se = itr2.next();
        
        if(se.getSenha().endsWith("C") || se.getSenha().endsWith("P")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 2");
                System.out.println("lista: "+listaDeSenhas.toString());                                        

                itr2.remove();
                break;
            }
        } 
    }//GEN-LAST:event_bCaixa2ActionPerformed

    private void bCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCaixa3ActionPerformed
        Iterator<Senha> itr = listaDeSenhas.iterator();        
        Iterator<Senha> itr2 = listaDeSenhas.iterator();
        
        while(itr.hasNext()){
        Senha se = itr.next();
        
            if(se.getSenha().startsWith("R")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 3");
                System.out.println("lista: "+listaDeSenhas.toString());
                                    
                itr.remove();
                return;

            }     
        } 
        while(itr2.hasNext()){
        Senha se = itr2.next();
        
        if(se.getSenha().endsWith("C") || se.getSenha().endsWith("P")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 3");
                System.out.println("lista: "+listaDeSenhas.toString());                                        

                itr2.remove();
                break;
            }
        } 
    }//GEN-LAST:event_bCaixa3ActionPerformed

    private void bCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCaixa4ActionPerformed
        Iterator<Senha> itr = listaDeSenhas.iterator();        
        Iterator<Senha> itr2 = listaDeSenhas.iterator();
        
        while(itr.hasNext()){
        Senha se = itr.next();
        
            if(se.getSenha().startsWith("C")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 4");
                System.out.println("lista: "+listaDeSenhas.toString());
                                    
                itr.remove();
                return;
            }     
        } 
        while(itr2.hasNext()){
        Senha se = itr2.next();
        
        if(se.getSenha().endsWith("R") || se.getSenha().endsWith("P")){
                lblMostraCaixa.setText(se.getSenha() + "-" + se.getNumero() + " Caixa 4");
                System.out.println("lista: "+listaDeSenhas.toString());                                        

                itr2.remove();
                break;
            }
        } 
    }//GEN-LAST:event_bCaixa4ActionPerformed

    private void txtInformaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInformaSenhaKeyReleased
  
    }//GEN-LAST:event_txtInformaSenhaKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCaixa1;
    private javax.swing.JButton bCaixa2;
    private javax.swing.JButton bCaixa3;
    private javax.swing.JButton bCaixa4;
    private javax.swing.JButton bComum;
    private javax.swing.JButton bPrioritario;
    private javax.swing.JButton bRapido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAtendimento;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblInformaSenha;
    private javax.swing.JLabel lblMostraCaixa;
    private javax.swing.JLabel lblMostraSenha;
    private javax.swing.JTextField txtInformaSenha;
    // End of variables declaration//GEN-END:variables

}
