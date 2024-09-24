
package telas;

import classes.Funcionario;
import classes.SessaoUsuario;
import classes.BancoDeDados;
import classes.Verificador;
import javax.swing.JOptionPane;


public class AreaDoFuncionario extends javax.swing.JFrame {
    
    static BancoDeDados bancoDeDados;
    Verificador verificador;

    public AreaDoFuncionario() {
        initComponents();
        bancoDeDados = Inicial.bancoDeDados;
        carregarDadosDoUsuario();
        verificador = new Verificador();
    }

    private void carregarDadosDoUsuario() {
        Funcionario usuarioLogado = SessaoUsuario.getInstancia().getUsuarioLogado();
        labelComissao.setText(String.format("%.2f",usuarioLogado.getComissao()));
        labelSalario.setText(String.format("%.2f",usuarioLogado.getSalario()));
        txtFieldNome.setText(usuarioLogado.getNome());
        txtFieldEmail.setText(usuarioLogado.getEmail());
        txtFieldTelefone.setText(String.format("%08d",usuarioLogado.getTelefone()));
        txtFieldCep.setText(String.format("%08d",usuarioLogado.getCep()));
        txtFieldSenha.setText(String.valueOf(usuarioLogado.getSenha()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldNome = new javax.swing.JTextField();
        btnNome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFieldEmail = new javax.swing.JTextField();
        btnEmail = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldTelefone = new javax.swing.JTextField();
        btnTelefone = new javax.swing.JButton();
        txtFieldCep = new javax.swing.JTextField();
        btnCep = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelSalario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelComissao = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnSenha = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFieldSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Área do Funcionário");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        txtFieldNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldNome.setText(" Josezinho da SIlva de Amorin Nogueira Junior Neto");

        btnNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        txtFieldEmail.setText("josezinho@gmail.com");
        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });

        btnEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("CEP:");

        txtFieldTelefone.setText("josezinho@gmail.com");

        btnTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btnTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefoneActionPerformed(evt);
            }
        });

        txtFieldCep.setText("0000-000");
        txtFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCepActionPerformed(evt);
            }
        });

        btnCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btnCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCepActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("SALÁRIO:");

        labelSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSalario.setText("R$00,00");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("COMISSÃO:");

        labelComissao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelComissao.setText("se ta aparecendo ta errado");

        btnVoltar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btnSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setText("Senha:");

        txtFieldSenha.setText("senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(txtFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(txtFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(txtFieldCep, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(txtFieldSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCep, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSalario)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelComissao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel10)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCep, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldSenha)
                    .addComponent(btnSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSalario)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(labelComissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCepActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new InicialFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeActionPerformed
        Funcionario usuarioLogado = SessaoUsuario.getInstancia().getUsuarioLogado();
        String nome = txtFieldNome.getText();
        if (!verificador.isNome(nome)){
            JOptionPane.showMessageDialog(null, "Nome não pode ser nulo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            usuarioLogado.setNome(nome);
            bancoDeDados.editar(usuarioLogado);
        }        
    }//GEN-LAST:event_btnNomeActionPerformed

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        
    }//GEN-LAST:event_txtFieldEmailActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
       Funcionario usuarioLogado = SessaoUsuario.getInstancia().getUsuarioLogado();
       String email = txtFieldEmail.getText();
       if (!verificador.isEmail(email)){
           JOptionPane.showMessageDialog(null, "Email inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       else{
           usuarioLogado.setEmail(email);
           bancoDeDados.editar(usuarioLogado);
       }
    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefoneActionPerformed
        Funcionario usuarioLogado = SessaoUsuario.getInstancia().getUsuarioLogado();
        String telefone = txtFieldTelefone.getText();
        if (!verificador.isTelefone(telefone)){
           JOptionPane.showMessageDialog(null, "Telefone deve conter no mínimo 8 dígitos, todos numéricos.", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       else{
           usuarioLogado.setTelefone(Long.parseLong(telefone));
           bancoDeDados.editar(usuarioLogado);
       }
    }//GEN-LAST:event_btnTelefoneActionPerformed

    private void btnCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCepActionPerformed
        Funcionario usuarioLogado = SessaoUsuario.getInstancia().getUsuarioLogado();
        String cep = txtFieldCep.getText();
        if (!verificador.isCep(cep)){
           JOptionPane.showMessageDialog(null, "CEP deve conter 8 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       else{
           usuarioLogado.setCep(Long.parseLong(cep));
           bancoDeDados.editar(usuarioLogado);
       }
    }//GEN-LAST:event_btnCepActionPerformed

    private void btnSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaActionPerformed
        Funcionario usuarioLogado = SessaoUsuario.getInstancia().getUsuarioLogado();
        String senha = txtFieldSenha.getText();
        if (!verificador.isSenha(senha)){
            JOptionPane.showMessageDialog(null, "Senha não pode ser nula.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            usuarioLogado.setSenha(senha);
            bancoDeDados.editar(usuarioLogado);
        }
    }//GEN-LAST:event_btnSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaDoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaDoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCep;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnNome;
    private javax.swing.JButton btnSenha;
    private javax.swing.JButton btnTelefone;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelComissao;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JTextField txtFieldCep;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldSenha;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
