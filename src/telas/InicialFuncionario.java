/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Honórios
 */
public class InicialFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form InicialVendedor
     */
    public InicialFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimg = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        lblfuncionario = new javax.swing.JLabel();
        btncadastro = new javax.swing.JButton();
        btnaluguel = new javax.swing.JButton();
        btnAreaDoFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Vendedor");

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agreement-303221_640-Photoroom.png"))); // NOI18N

        lbltitle.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        lbltitle.setText("LocCarros");

        lblfuncionario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblfuncionario.setText("Funcionário");

        btncadastro.setBackground(new java.awt.Color(51, 102, 255));
        btncadastro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btncadastro.setText("Cadasto de cliente");
        btncadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastroActionPerformed(evt);
            }
        });

        btnaluguel.setBackground(new java.awt.Color(51, 102, 255));
        btnaluguel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnaluguel.setText("Aluguel de carros");
        btnaluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaluguelActionPerformed(evt);
            }
        });

        btnAreaDoFuncionario.setBackground(new java.awt.Color(51, 102, 255));
        btnAreaDoFuncionario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnAreaDoFuncionario.setText("Área Do funcionário");
        btnAreaDoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaDoFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblimg)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbltitle)
                        .addGap(360, 360, 360))))
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(lblfuncionario)
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btncadastro)
                .addGap(53, 53, 53)
                .addComponent(btnaluguel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAreaDoFuncionario)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfuncionario)
                .addGap(54, 54, 54)
                .addComponent(lblimg)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAreaDoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaluguelActionPerformed
        new TelaAluguel().setVisible(true);
    }//GEN-LAST:event_btnaluguelActionPerformed

    private void btncadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastroActionPerformed
        new CRUDClientes().setVisible(true);
    }//GEN-LAST:event_btncadastroActionPerformed

    private void btnAreaDoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaDoFuncionarioActionPerformed
        new AreaDoFuncionario().setVisible(true);
    }//GEN-LAST:event_btnAreaDoFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaDoFuncionario;
    private javax.swing.JButton btnaluguel;
    private javax.swing.JButton btncadastro;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}
