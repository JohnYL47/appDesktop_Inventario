/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

/**
 *
 * @author JAMES
 */
public class JfRegistro extends javax.swing.JFrame {

    
    public JfRegistro() {
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

        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Jframes.PanelRound();
        panelRound1 = new Jframes.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        UsuarioRegistro_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JButtonRegistrar_Reg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PasswdRegistro_txt = new javax.swing.JPasswordField();
        JButtonCancelar_Reg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(102, 255, 102));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        panelRound1.add(UsuarioRegistro_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        JButtonRegistrar_Reg.setBackground(new java.awt.Color(204, 204, 204));
        JButtonRegistrar_Reg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButtonRegistrar_Reg.setText("Registrar");
        panelRound1.add(JButtonRegistrar_Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Usuario");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        panelRound1.add(PasswdRegistro_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, -1));

        JButtonCancelar_Reg.setBackground(new java.awt.Color(204, 204, 204));
        JButtonCancelar_Reg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButtonCancelar_Reg.setText("Cancelar");
        JButtonCancelar_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelar_RegActionPerformed(evt);
            }
        });
        panelRound1.add(JButtonCancelar_Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        panelRound2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, 400));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAMES\\Documents\\NetBeansProjects\\Pruebas\\src\\main\\java\\Wallpapers_Background\\pexels-bich-tran-2481177.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonCancelar_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelar_RegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCancelar_RegActionPerformed

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
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JButtonCancelar_Reg;
    public javax.swing.JButton JButtonRegistrar_Reg;
    public javax.swing.JPasswordField PasswdRegistro_txt;
    public javax.swing.JTextField UsuarioRegistro_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private Jframes.PanelRound panelRound1;
    private Jframes.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
