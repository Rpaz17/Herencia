/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package herencia_progralab2;

/**
 *
 * @author pcast
 */
public class agregarPlan extends javax.swing.JFrame {
private Tigo tigo;
    /**
     * Creates new form agregarPlan
     */
    public agregarPlan() {
        initComponents();
        
    }
    Tigo tg= new Tigo();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        sam = new javax.swing.JButton();
        iphone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIJA SU TIPO DE PLAN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menu.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        menu.setText("Regresar");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/herencia_progralab2/imagenes/pago_amigo_plan.png"))); // NOI18N

        sam.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sam.setText("PLAN SAMSUNG");
        sam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                samMouseClicked(evt);
            }
        });

        iphone.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        iphone.setText("PLAN IPHONE");
        iphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iphoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(409, 409, 409))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sam)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(iphone))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(menu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(sam)
                .addGap(64, 64, 64)
                .addComponent(iphone)
                .addGap(82, 82, 82)
                .addComponent(menu)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void samMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samMouseClicked
        samsung sam=new samsung();
        sam.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_samMouseClicked

    private void iphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iphoneMouseClicked
        iphone ip=new iphone();
        ip.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iphoneMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        menu rega=new menu();
        rega.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuMouseClicked

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
            java.util.logging.Logger.getLogger(agregarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton iphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu;
    private javax.swing.JButton sam;
    // End of variables declaration//GEN-END:variables
}
