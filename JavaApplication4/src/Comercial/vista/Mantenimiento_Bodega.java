/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.vista;

import Comercial.datos.BodegaDAO;
import Comercial.dominio.Bodega;
import java.net.UnknownHostException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diana
 */
public class Mantenimiento_Bodega extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento_Bodega
     */
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Bodega");
        modelo.addColumn("Nombre Bodega");
        modelo.addColumn("Estatus Bodega");
        BodegaDAO bodegaDAO = new BodegaDAO();

        List<Bodega> bodega = bodegaDAO.select();
        Tbl_tablabodega.setModel(modelo);
        String[] dato = new String[3];
        for (int i = 0; i < bodega.size(); i++) {
            dato[0] = Integer.toString(bodega.get(i).getPKcodigoBodega());
            dato[1] = bodega.get(i).getNombreBodega();
            dato[2] = bodega.get(i).getEstatusBodega();

            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscar() {
        Bodega bodegaAConsultar = new Bodega();
        BodegaDAO bodegaDAO = new BodegaDAO();
        bodegaAConsultar.setPKcodigoBodega(Integer.parseInt(Txt_id.getText()));
        bodegaAConsultar = bodegaDAO.query(bodegaAConsultar);
        Txt_nombre.setText(bodegaAConsultar.getNombreBodega());
        Txt_estatus.setText(String.valueOf(bodegaAConsultar.getEstatusBodega()));
//        cbx_bodega.setSelectedItem(String.valueOf(0));
    }

    public void limpiar() {
        Txt_id.setText("");
        Txt_nombre.setText("");
        Txt_estatus.setText("");
//        cbx_bodega.setSelectedIndex(0);
    }

    public Mantenimiento_Bodega() {
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
        jLabel2 = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();
        Btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();
        Txt_estatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Btn_guardar = new javax.swing.JButton();
        Btn_modificar = new javax.swing.JButton();
        Btn_eliminar = new javax.swing.JButton();
        Btn_reporte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_tablabodega = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("ID ");

        Txt_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Btn_buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_buscar.setText("Buscar");
        Btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre Bodega");

        Txt_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Txt_estatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Estado Bodega");

        Btn_guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_guardar.setText("Guardar");
        Btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_guardarActionPerformed(evt);
            }
        });

        Btn_modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_modificar.setText("Modificar");
        Btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_modificarActionPerformed(evt);
            }
        });

        Btn_eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_eliminar.setText("Eliminar");
        Btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_eliminarActionPerformed(evt);
            }
        });

        Btn_reporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_reporte.setText("Reporte");
        Btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_reporte))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_id)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addContainerGap(484, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_guardar)
                    .addComponent(Btn_modificar)
                    .addComponent(Btn_eliminar)
                    .addComponent(Btn_reporte))
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        Tbl_tablabodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_tablabodega);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_buscarActionPerformed
        // TODO add your handling code here:
         buscar();
      

    }//GEN-LAST:event_Btn_buscarActionPerformed

    private void Btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_guardarActionPerformed
        // TODO add your handling code here:
//        MDI_Components mdi_Components = new MDI_Components();
        String id = "0";
        Mantenimiento_Bodega mntbodegaDAO = new Mantenimiento_Bodega();
        BodegaDAO bodegaDAO = new BodegaDAO();
        Bodega bodegaAInsertar = new Bodega();
        //String cbxbodega = cbx_bodega.getSelectedItem().toString();
        bodegaAInsertar.setPKcodigoBodega((int) Integer.parseInt(Txt_id.getText()));
        bodegaAInsertar.setNombreBodega(Txt_nombre.getText());
        bodegaAInsertar.setEstatusBodega(Txt_estatus.getText());
        bodegaDAO.insert(bodegaAInsertar);
        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_guardarActionPerformed

    private void Btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_modificarActionPerformed
        // TODO add your handling code here:
        BodegaDAO bodegaDAO = new BodegaDAO();
        Bodega bodegaAActualizar = new Bodega();
        bodegaAActualizar.setPKcodigoBodega(Integer.parseInt(Txt_id.getText()));
        bodegaAActualizar.setNombreBodega(Txt_nombre.getText());
        bodegaAActualizar.setEstatusBodega(Txt_estatus.getText());
        bodegaDAO.update(bodegaAActualizar);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa.");

        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_modificarActionPerformed

    private void Btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_eliminarActionPerformed
        // TODO add your handling code here:
        BodegaDAO bodegaDAO = new BodegaDAO();
        Bodega bodegaAEliminar = new Bodega();
        bodegaAEliminar.setPKcodigoBodega(Integer.parseInt(Txt_id.getText()));
        bodegaDAO.delete(bodegaAEliminar);
        JOptionPane.showMessageDialog(null, "Registro Eliminado.");

        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_eliminarActionPerformed

    private void Btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_reporteActionPerformed
        // TODO add your handling code here:
        //        Map p = new HashMap();
        //        JasperReport report;
        //        JasperPrint print;
        //
        //        try {
        //            connection = Conexion.getConnection();
        //            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
        //                    + "/src/main/java/Comercial/reportes/MantenimientoProducto.jrxml");
        //            print = JasperFillManager.fillReport(report, p, connection);
        //            JasperViewer view = new JasperViewer(print, false);
        //            view.setTitle("Reporte de Proceso Productos");
        //            view.setVisible(true);
        //
        //        } catch (Exception e) {
        //            e.printStackTrace();
        //        }
    }//GEN-LAST:event_Btn_reporteActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenimiento_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento_Bodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_buscar;
    private javax.swing.JButton Btn_eliminar;
    private javax.swing.JButton Btn_guardar;
    private javax.swing.JButton Btn_modificar;
    private javax.swing.JButton Btn_reporte;
    private javax.swing.JTable Tbl_tablabodega;
    private javax.swing.JTextField Txt_estatus;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
