/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p4roce;

/**
 *
 * @author megaybte
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        dpcontenido = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Isuma = new javax.swing.JMenuItem();
        Iresta = new javax.swing.JMenuItem();
        Imultiplicacion = new javax.swing.JMenuItem();
        Idivision = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpcontenido.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout dpcontenidoLayout = new javax.swing.GroupLayout(dpcontenido);
        dpcontenido.setLayout(dpcontenidoLayout);
        dpcontenidoLayout.setHorizontalGroup(
            dpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
        dpcontenidoLayout.setVerticalGroup(
            dpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        Isuma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Isuma.setText("suma");
        Isuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsumaActionPerformed(evt);
            }
        });
        jMenu1.add(Isuma);

        Iresta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        Iresta.setText("Resta");
        Iresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrestaActionPerformed(evt);
            }
        });
        jMenu1.add(Iresta);

        Imultiplicacion.setText("Multiplicacion");
        Imultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImultiplicacionActionPerformed(evt);
            }
        });
        jMenu1.add(Imultiplicacion);

        Idivision.setText("Division");
        Idivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdivisionActionPerformed(evt);
            }
        });
        jMenu1.add(Idivision);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");

        jMenuItem3.setText("info");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpcontenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpcontenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrestaActionPerformed
        // TODO add your handling code here:
       frmResta Frmresta = new frmResta();
       Frmresta.setVisible(true);
       dpcontenido.add(Frmresta);
       
       
    }//GEN-LAST:event_IrestaActionPerformed

    private void IsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsumaActionPerformed
        // TODO add your handling code here:
        frmSuma Frmsuma = new frmSuma();
       Frmsuma.setVisible(true);
       dpcontenido.add(Frmsuma);
    }//GEN-LAST:event_IsumaActionPerformed

    private void ImultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImultiplicacionActionPerformed
        // TODO add your handling code here:
        frmMultiplicacion Frmmultiplicacion = new frmMultiplicacion();
       Frmmultiplicacion.setVisible(true);
       dpcontenido.add(Frmmultiplicacion);
    }//GEN-LAST:event_ImultiplicacionActionPerformed

    private void IdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdivisionActionPerformed
        // TODO add your handling code here:
        frmDivision Frmdivision = new frmDivision();
       Frmdivision.setVisible(true);
       dpcontenido.add(Frmdivision);
    }//GEN-LAST:event_IdivisionActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Idivision;
    private javax.swing.JMenuItem Imultiplicacion;
    private javax.swing.JMenuItem Iresta;
    private javax.swing.JMenuItem Isuma;
    private javax.swing.JDesktopPane dpcontenido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
