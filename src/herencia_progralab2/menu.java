/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package herencia_progralab2;

import javax.swing.ImageIcon;

/**
 *
 * @author pcast
 */
public class menu extends javax.swing.JFrame {


    public menu() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarPlan = new javax.swing.JButton();
        pago = new javax.swing.JButton();
        agregarAmigo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregarPlan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        agregarPlan.setText("AGREGAR PLAN");
        agregarPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pago.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        pago.setText("PAGO DE PLAN");
        pago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        agregarAmigo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        agregarAmigo.setText("AGREGAR AMIGO");
        agregarAmigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        salir.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        salir.setText("SALIR");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        listar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        listar.setText("LISTAR");
        listar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/herencia_progralab2/imagenes/menu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir)
                    .addComponent(agregarAmigo)
                    .addComponent(listar)
                    .addComponent(pago)
                    .addComponent(agregarPlan))
                .addGap(0, 928, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(agregarAmigo)
                .addGap(18, 18, 18)
                .addComponent(agregarPlan)
                .addGap(18, 18, 18)
                .addComponent(pago)
                .addGap(18, 18, 18)
                .addComponent(listar)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAmigo;
    private javax.swing.JButton agregarPlan;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton listar;
    private javax.swing.JButton pago;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
