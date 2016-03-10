/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Huesped;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vesprada
 */
public class busqueda_huesped extends javax.swing.JDialog {

    DefaultTableModel m = null;
    String dnionombre = "";
    ArrayList<Huesped> huespedlista = new ArrayList<Huesped>();

    Huesped retornarh = null;
    Controlador.Operaciones_huesped oph = new Controlador.Operaciones_huesped();

    busqueda_huesped(admin_huesped parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jthuepedesfiltrados.setModel(new DefaultTableModel());

        jtdni.setEnabled(false);
        jtnombre.setEnabled(false);
        jtapellidos.setEnabled(false);
        jbbuscar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbdni = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jtdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbbuscar = new javax.swing.JButton();
        jtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtapellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jthuepedesfiltrados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(rbdni);
        rbdni.setText("Busqueda por DNI");
        rbdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdniActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Busqueda de Huesped");
        jLabel1.setOpaque(true);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Busqueda por nombre y apellidos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        jthuepedesfiltrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jthuepedesfiltrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jthuepedesfiltradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jthuepedesfiltrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                            .addComponent(jbbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbdni)
                                    .addComponent(jRadioButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rbdni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jbbuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        cargar_en_tabla();
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void rbdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdniActionPerformed
        dnionombre = "dni";
        jthuepedesfiltrados.setModel(new DefaultTableModel());
        jtdni.setEnabled(true);
        jtdni.setText("");
        jtnombre.setText("");
        jtapellidos.setText("");
        jtnombre.setEnabled(false);
        jtapellidos.setEnabled(false);
        jbbuscar.setEnabled(true);

    }//GEN-LAST:event_rbdniActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        dnionombre = "nombre";
        jthuepedesfiltrados.setModel(new DefaultTableModel());
        jtdni.setEnabled(false);
        jtdni.setText("");
        jtnombre.setText("");
        jtapellidos.setText("");
        jtnombre.setEnabled(true);
        jtapellidos.setEnabled(true);
        jbbuscar.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jthuepedesfiltradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jthuepedesfiltradosMouseClicked
        retornarh = huespedlista.get(jthuepedesfiltrados.getSelectedRow());
        dispose();
    }//GEN-LAST:event_jthuepedesfiltradosMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JTextField jtapellidos;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTable jthuepedesfiltrados;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JRadioButton rbdni;
    // End of variables declaration//GEN-END:variables
/*
     public Huesped getHretornar() {
     return hretornar;
     }

     public void setHretornar(Huesped hretornar) {
     this.hretornar = hretornar;
     }*/

    private void cargar_en_tabla() {

        Iterator<Huesped> iter = oph.todosHuespedes();
        String[] col = new String[]{"Dni", "Nombre", "Apellidos", "Direccion", "Fecha_De_Nacimiento", "Poblacion", "Habitacion", "Individual"};
        m = new DefaultTableModel(null, col);
        String[] lineas = new String[col.length];

        if (dnionombre.equals("dni")) {
            while (iter.hasNext()) {
                Huesped huesped = (Huesped) iter.next();
                if (huesped.getDni().contains(jtdni.getText())) {
                    this.huespedlista.add(huesped);
                    lineas[0] = huesped.getDni();
                    lineas[1] = huesped.getNombre();
                    lineas[2] = huesped.getApellidos();
                    lineas[3] = huesped.getDireccion();
                    lineas[4] = huesped.getFechaNac().toString();
                    lineas[5] = huesped.getPoblacion();
                    if (huesped.getHabitacion() == null) {
                        lineas[6] = "";
                    } else {
                        lineas[6] = huesped.getHabitacion().toString();
                    }
                    lineas[7] = huesped.getIndividual().toString();
                    m.addRow(lineas);
                }
            }
        } else {
            while (iter.hasNext()) {
                Huesped huesped = (Huesped) iter.next();
                if (huesped.getNombre().contains(jtnombre.getText()) || huesped.getApellidos().contains(jtapellidos.getText())) {
                    this.huespedlista.add(huesped);
                    lineas[0] = huesped.getDni();
                    lineas[1] = huesped.getNombre();
                    lineas[2] = huesped.getApellidos();
                    lineas[3] = huesped.getDireccion();
                    lineas[4] = huesped.getFechaNac().toString();
                    lineas[5] = huesped.getPoblacion();
                    if (huesped.getHabitacion() == null) {
                        lineas[6] = "";
                    } else {
                        lineas[6] = huesped.getHabitacion().toString();
                    }
                    lineas[7] = huesped.getIndividual().toString();
                    m.addRow(lineas);
                }
            }
        }

        jthuepedesfiltrados.setModel(m);

    }
}
