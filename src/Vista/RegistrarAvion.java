/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author RONNY PANTOJA
 */
public class RegistrarAvion extends javax.swing.JFrame {

    /**
     * Creates new form ResgistarAvion
     */
    public RegistrarAvion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        txt_propieetario = new javax.swing.JTextField();
        txt_largo = new javax.swing.JTextField();
        txt_ancho = new javax.swing.JTextField();
        txt_alto = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Cliente = new javax.swing.JTable();
        Btn_refrescarClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAR AVION");

        jLabel2.setText("MATRICULA");

        jLabel4.setText("PROPIETARIO");

        jLabel5.setText("LARGO");

        jLabel6.setText("ANCHO");

        jLabel7.setText("ALTO");

        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });
        txt_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_matriculaKeyTyped(evt);
            }
        });

        txt_propieetario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_propieetarioKeyTyped(evt);
            }
        });

        txt_largo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_largoActionPerformed(evt);
            }
        });
        txt_largo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_largoKeyTyped(evt);
            }
        });

        txt_ancho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anchoActionPerformed(evt);
            }
        });
        txt_ancho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anchoKeyTyped(evt);
            }
        });

        txt_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_altoActionPerformed(evt);
            }
        });
        txt_alto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_altoKeyTyped(evt);
            }
        });

        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        Tbl_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Nombre", "Email", "Direccion", "Telefono"
            }
        ));
        Tbl_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_ClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Cliente);

        Btn_refrescarClientes.setText("REFRESCAR");
        Btn_refrescarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_refrescarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(Btn_refrescarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_propieetario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_largo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_propieetario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(Btn_refrescarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void txt_largoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_largoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_largoActionPerformed

    private void txt_anchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anchoActionPerformed

    private void txt_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_altoActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_matriculaKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_matriculaKeyTyped

    private void txt_propieetarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_propieetarioKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_propieetarioKeyTyped

    private void txt_largoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_largoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_largoKeyTyped

    private void txt_anchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anchoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_anchoKeyTyped

    private void txt_altoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_altoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_altoKeyTyped

    private void Btn_refrescarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_refrescarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_refrescarClientesActionPerformed

    private void Tbl_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_ClienteMouseClicked
        
        String s = Tbl_Cliente.getValueAt(Tbl_Cliente.getSelectedRow(), 0).toString();
        txt_propieetario.setText(s);
        
    }//GEN-LAST:event_Tbl_ClienteMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAvion().setVisible(true);
            }
        });
    }

    public JButton getBtn_registrar() {
        return btn_registrar;
    }

    public void setBtn_registrar(JButton btn_registrar) {
        this.btn_registrar = btn_registrar;
    }


    public JTextField getTxt_aerolinea() {
        return txt_propieetario;
    }

    public void setTxt_aerolinea(JTextField txt_aerolinea) {
        this.txt_propieetario = txt_aerolinea;
    }

    public JTextField getTxt_alto() {
        return txt_alto;
    }

    public void setTxt_alto(JTextField txt_alto) {
        this.txt_alto = txt_alto;
    }

    public JTextField getTxt_ancho() {
        return txt_ancho;
    }

    public void setTxt_ancho(JTextField txt_ancho) {
        this.txt_ancho = txt_ancho;
    }

    public JTextField getTxt_largo() {
        return txt_largo;
    }

    public void setTxt_largo(JTextField txt_largo) {
        this.txt_largo = txt_largo;
    }

    public JTextField getTxt_matricula() {
        return txt_matricula;
    }

    public void setTxt_matricula(JTextField txt_matricula) {
        this.txt_matricula = txt_matricula;
    }

    public JTextField getTxt_propieetario() {
        return txt_propieetario;
    }

    public void setTxt_propieetario(JTextField txt_propieetario) {
        this.txt_propieetario = txt_propieetario;
    }

    public JTable getTbl_Cliente() {
        return Tbl_Cliente;
    }

    public void setTbl_Cliente(JTable Tbl_Cliente) {
        this.Tbl_Cliente = Tbl_Cliente;
    }

    public JButton getBtn_refrescarClientes() {
        return Btn_refrescarClientes;
    }

    public void setBtn_refrescarClientes(JButton Btn_refrescarClientes) {
        this.Btn_refrescarClientes = Btn_refrescarClientes;
    }

    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_refrescarClientes;
    private javax.swing.JTable Tbl_Cliente;
    private javax.swing.JButton btn_registrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_alto;
    private javax.swing.JTextField txt_ancho;
    private javax.swing.JTextField txt_largo;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_propieetario;
    // End of variables declaration//GEN-END:variables
}
