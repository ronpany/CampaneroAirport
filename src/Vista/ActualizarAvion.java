/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author RONNY PANTOJA
 */
public class ActualizarAvion extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarAvion
     */
    public ActualizarAvion() {
        initComponents();
    }

    public JButton getBtn_ActualizarAvion() {
        return Btn_ActualizarAvion;
    }

    public void setBtn_ActualizarAvion(JButton Btn_ActualizarAvion) {
        this.Btn_ActualizarAvion = Btn_ActualizarAvion;
    }

    public JButton getBtn_Buscar() {
        return Btn_Buscar;
    }

    public void setBtn_Buscar(JButton Btn_Buscar) {
        this.Btn_Buscar = Btn_Buscar;
    }

    public JTextField getTxt_Alto() {
        return Txt_Alto;
    }

    public void setTxt_Alto(JTextField Txt_Alto) {
        this.Txt_Alto = Txt_Alto;
    }

    public JTextField getTxt_Ancho() {
        return Txt_Ancho;
    }

    public void setTxt_Ancho(JTextField Txt_Ancho) {
        this.Txt_Ancho = Txt_Ancho;
    }

    public JTextField getTxt_Cliente() {
        return Txt_Cliente;
    }

    public void setTxt_Cliente(JTextField Txt_Cliente) {
        this.Txt_Cliente = Txt_Cliente;
    }

    public JTextField getTxt_Estado() {
        return Txt_Estado;
    }

    public void setTxt_Estado(JTextField Txt_Estado) {
        this.Txt_Estado = Txt_Estado;
    }

    public JTextField getTxt_Largo() {
        return Txt_Largo;
    }

    public void setTxt_Largo(JTextField Txt_Largo) {
        this.Txt_Largo = Txt_Largo;
    }

    public JTextField getTxt_Matricula() {
        return Txt_Matricula;
    }

    public void setTxt_Matricula(JTextField Txt_Matricula) {
        this.Txt_Matricula = Txt_Matricula;
    }

    public JTextField getTxt_MatriculaEditar() {
        return Txt_MatriculaEditar;
    }

    public void setTxt_MatriculaEditar(JTextField Txt_MatriculaEditar) {
        this.Txt_MatriculaEditar = Txt_MatriculaEditar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Matricula = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Txt_MatriculaEditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Alto = new javax.swing.JTextField();
        Txt_Largo = new javax.swing.JTextField();
        Txt_Ancho = new javax.swing.JTextField();
        Txt_Estado = new javax.swing.JTextField();
        Txt_Cliente = new javax.swing.JTextField();
        Btn_ActualizarAvion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ACTUALIZAR AVION");

        jLabel2.setText("MATRICULA");

        Btn_Buscar.setText("Buscar");

        jLabel3.setText("Matricula");

        jLabel4.setText("Alto");

        jLabel5.setText("Largo");

        jLabel6.setText("Ancho");

        jLabel7.setText("Estado");

        jLabel8.setText("Cliente");

        Btn_ActualizarAvion.setText("ACTUALIZAR");
        Btn_ActualizarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarAvionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Btn_Buscar)))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(39, 39, 39)
                                    .addComponent(Txt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Largo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_Alto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_MatriculaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12))))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn_ActualizarAvion)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_Buscar)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_MatriculaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txt_Alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Btn_ActualizarAvion)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ActualizarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ActualizarAvionActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActualizarAvion;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JTextField Txt_Alto;
    private javax.swing.JTextField Txt_Ancho;
    private javax.swing.JTextField Txt_Cliente;
    private javax.swing.JTextField Txt_Estado;
    private javax.swing.JTextField Txt_Largo;
    private javax.swing.JTextField Txt_Matricula;
    private javax.swing.JTextField Txt_MatriculaEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
