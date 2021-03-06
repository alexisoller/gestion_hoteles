/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Categoria;
import Modelo.Hotel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class admin_hoteles extends javax.swing.JDialog {

    /**
     * Creates new form admin_hoteles
     */
    String modo;
    int indicehotel = 0;
    DefaultListModel hoteles;
    Controlador.Operaciones_hoteles oph = new Controlador.Operaciones_hoteles();
    Vista.busqueda_hotel buscaH;

    public admin_hoteles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hoteles = oph.mostrarHoteles();
        cargarcombo();
        redimensionar();
        botoneraNavegacionActivada(true);
        activarjtxt(false);
        cargarencampos();
        ponercontadores();
        jbejecutaraccion.setEnabled(false);
        jbborrar.setEnabled(false);
        jbmodificar.setEnabled(false);
        jbcancelar.setEnabled(false);
        janadirhabitacion.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgmodo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbmodo = new javax.swing.JLabel();
        rbalta = new javax.swing.JRadioButton();
        rbbaja = new javax.swing.JRadioButton();
        rbmodificacion = new javax.swing.JRadioButton();
        rbbusqueda = new javax.swing.JRadioButton();
        jlnombre = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        lbciudad = new javax.swing.JLabel();
        jtciudad = new javax.swing.JTextField();
        lbcategoria = new javax.swing.JLabel();
        cbcategorias = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jbborrar = new javax.swing.JButton();
        jbmodificar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jbejecutaraccion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnPrime3 = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        btnUltim = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        lblTot = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        lbrgactual = new javax.swing.JLabel();
        lbtotal = new javax.swing.JLabel();
        janadirhabitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Hoteles");
        jLabel1.setOpaque(true);

        lbmodo.setText("Modo");

        bgmodo.add(rbalta);
        rbalta.setText("Alta");
        rbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaltaActionPerformed(evt);
            }
        });

        bgmodo.add(rbbaja);
        rbbaja.setText("Baja");
        rbbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbajaActionPerformed(evt);
            }
        });

        bgmodo.add(rbmodificacion);
        rbmodificacion.setText("Modificacion");
        rbmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodificacionActionPerformed(evt);
            }
        });

        bgmodo.add(rbbusqueda);
        rbbusqueda.setText("Busqueda");
        rbbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbbaja)
                                    .addComponent(rbalta)
                                    .addComponent(rbmodificacion))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbmodo)
                                .addGap(100, 100, 100))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbbusqueda)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbmodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbalta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbbaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbmodificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbbusqueda)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jlnombre.setText("Nombre");

        lbciudad.setText("Ciudad");

        jtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtciudadActionPerformed(evt);
            }
        });

        lbcategoria.setText("Categoria");

        jbborrar.setText("Borrar");
        jbborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbborrarActionPerformed(evt);
            }
        });

        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jbcancelar.setText("Cancelar");
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbborrar)
                .addGap(18, 18, 18)
                .addComponent(jbmodificar)
                .addGap(18, 18, 18)
                .addComponent(jbcancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbborrar)
                    .addComponent(jbmodificar)
                    .addComponent(jbcancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbejecutaraccion.setText("Ejecutar Accion");
        jbejecutaraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbejecutaraccionActionPerformed(evt);
            }
        });

        btnPrime3.setText("|<");
        btnPrime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrime3ActionPerformed(evt);
            }
        });

        btnAnt.setText("<<");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        btnUltim.setText(">|");
        btnUltim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimActionPerformed(evt);
            }
        });

        btnSig.setText(">>");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        lblTot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTot.setText("Tot. registros");
        lblTot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReg.setText("Reg. actual");
        lblReg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbrgactual.setText("0");

        lbtotal.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrime3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTot, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(lblReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbrgactual)
                    .addComponent(lbtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUltim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrime3)
                    .addComponent(btnAnt)
                    .addComponent(btnUltim)
                    .addComponent(btnSig)
                    .addComponent(lblReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbrgactual))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtotal))
                .addContainerGap())
        );

        janadirhabitacion.setText("Habitaciones");
        janadirhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janadirhabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(janadirhabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbcategoria)
                        .addGap(18, 18, 18)
                        .addComponent(cbcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(jbejecutaraccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlnombre)
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbciudad)
                            .addComponent(jtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbcategoria)
                            .addComponent(cbcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(janadirhabitacion))
                .addGap(71, 71, 71)
                .addComponent(jbejecutaraccion)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaltaActionPerformed
        janadirhabitacion.setEnabled(false);
        indicehotel = 0;
        modo = "Alta";
        jbejecutaraccion.setEnabled(true);
        botoneraNavegacionActivada(false);
        limpiarform();
        activarjtxt(true);
        lbrgactual.setText("-");
        lbtotal.setText("-");

        jbborrar.setEnabled(false);
        jbmodificar.setEnabled(false);
        jbcancelar.setEnabled(false);
    }//GEN-LAST:event_rbaltaActionPerformed

    private void rbbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbajaActionPerformed
        janadirhabitacion.setEnabled(false);
        cargarencampos();
        botoneraNavegacionActivada(true);
        modo = "Baja";
        ponercontadores();
        activarjtxt(false);
        jbejecutaraccion.setEnabled(true);
        jbborrar.setEnabled(false);
        jbmodificar.setEnabled(false);
        jbcancelar.setEnabled(false);
    }//GEN-LAST:event_rbbajaActionPerformed

    private void rbmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodificacionActionPerformed
        janadirhabitacion.setEnabled(true);
        cargarencampos();
        botoneraNavegacionActivada(true);
        modo = "Modi";
        ponercontadores();
        activarjtxt(true);

        jbejecutaraccion.setEnabled(true);
        jbborrar.setEnabled(false);
        jbmodificar.setEnabled(false);
        jbcancelar.setEnabled(false);
    }//GEN-LAST:event_rbmodificacionActionPerformed

    private void rbbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedaActionPerformed
        janadirhabitacion.setEnabled(false);
        jbejecutaraccion.setEnabled(false);
        buscaH = new Vista.busqueda_hotel(this, true);
        buscaH.setVisible(true);
        botoneraNavegacionActivada(false);
        lbrgactual.setText("-");
        lbtotal.setText("-");
        activarjtxt(true);

        if (buscaH.retornarh != null) {
            cargarencampos(buscaH.retornarh);
            jbborrar.setEnabled(true);
            jbmodificar.setEnabled(true);
            jbcancelar.setEnabled(true);
            rbalta.setEnabled(false);
            rbbaja.setEnabled(false);
            rbmodificacion.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido cargar el Hotel", "ERROR", JOptionPane.ERROR_MESSAGE);
            rbaltaActionPerformed(null);
            rbalta.setSelected(true);
        }
    }//GEN-LAST:event_rbbusquedaActionPerformed

    private void jtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtciudadActionPerformed

    private void jbborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbborrarActionPerformed
        oph.bajaHotel(buscaH.retornarh.getIdhotel());//boorraaaaaaarrrrrr
        hoteles = oph.mostrarHoteles();
        indicehotel = 0;
        cargarencampos();
        rbbajaActionPerformed(null);
        rbbaja.setSelected(true);
        activarjtxt(false);
        rbalta.setEnabled(true);
        rbbaja.setEnabled(true);
        rbmodificacion.setEnabled(true);
    }//GEN-LAST:event_jbborrarActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed

        if (!comprobarDatos()) {
            Hotel hotel1 = (Hotel) hoteles.get(indicehotel);
            hotel1.setNombre(jtnombre.getText());
            hotel1.setCiudad(jtciudad.getText());
            String[] categoria = String.valueOf(cbcategorias.getSelectedItem()).split("-");
            Categoria cat = oph.buscarCategoria(Integer.parseInt(categoria[0]));
            hotel1.setCategoria(cat);
            oph.ModiHotel(hotel1);
            hoteles = oph.mostrarHoteles();
            indicehotel = 0;
            cargarencampos();
            rbmodificacionActionPerformed(null);
            rbmodificacion.setSelected(true);
            rbalta.setEnabled(true);
            rbbaja.setEnabled(true);
            rbmodificacion.setEnabled(true);
        }

    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        rbalta.setEnabled(true);
        rbbaja.setEnabled(true);
        rbmodificacion.setEnabled(true);
        rbalta.setSelected(true);
        rbaltaActionPerformed(null);

    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jbejecutaraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbejecutaraccionActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "Estas seguro de ejecutar la accion?");
        if (ax == JOptionPane.YES_OPTION) {

            switch (modo) {
                case "Alta":
                    if (!comprobarDatos()) {
                        String[] categoria = String.valueOf(cbcategorias.getSelectedItem()).split("-");
                        Categoria cat = oph.buscarCategoria(Integer.parseInt(categoria[0]));
                        Hotel hotel = new Hotel(cat, jtnombre.getText(), jtciudad.getText(), null);
                        oph.altaHotel(hotel);
                        hoteles = oph.mostrarHoteles();
                    }
                    limpiarform();

                    break;
                case "Baja":

                    Hotel hotel = (Hotel) hoteles.get(indicehotel);

                    oph.bajaHotel(hotel.getIdhotel());
                    hoteles = oph.mostrarHoteles();
                    indicehotel = 0;
                    cargarencampos();
                    ponercontadores();
                    botoneraNavegacionActivada(true);

                    break;
                case "Modi":

                    if (!comprobarDatos()) {
                        Hotel hotel1 = (Hotel) hoteles.get(indicehotel);

                        hotel1.setNombre(jtnombre.getText());
                        hotel1.setCiudad(jtciudad.getText());

                        String[] categoria = String.valueOf(cbcategorias.getSelectedItem()).split("-");
                        Categoria cat = oph.buscarCategoria(Integer.parseInt(categoria[0]));
                        hotel1.setCategoria(cat);
                        oph.ModiHotel(hotel1);
                        hoteles = oph.mostrarHoteles();

                    }

                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se han realizado cambios en la base de datos");
        }
    }//GEN-LAST:event_jbejecutaraccionActionPerformed

    private void btnPrime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrime3ActionPerformed
        indicehotel = 0;
        btnPrime3.setEnabled(false);
        btnAnt.setEnabled(false);
        btnSig.setEnabled(true);
        btnUltim.setEnabled(true);
        cargarencampos();
        ponercontadores();
    }//GEN-LAST:event_btnPrime3ActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        indicehotel--;
        if (indicehotel < 0) {
            btnPrime3.setEnabled(false);
            btnAnt.setEnabled(false);
            btnSig.setEnabled(true);
            btnUltim.setEnabled(true);
            indicehotel = 0;

        } else {
            btnPrime3.setEnabled(true);
            btnAnt.setEnabled(true);
            btnSig.setEnabled(true);
            btnUltim.setEnabled(true);
            cargarencampos();

        }
        ponercontadores();
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnUltimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimActionPerformed
        indicehotel = hoteles.size() - 1;
        btnPrime3.setEnabled(true);
        btnAnt.setEnabled(true);
        btnSig.setEnabled(false);
        btnUltim.setEnabled(false);
        cargarencampos();
        ponercontadores();
    }//GEN-LAST:event_btnUltimActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed

        indicehotel++;
        if (indicehotel > hoteles.size() - 1) {
            btnPrime3.setEnabled(true);
            btnAnt.setEnabled(true);
            btnSig.setEnabled(false);
            btnUltim.setEnabled(false);
            indicehotel = hoteles.size() - 1;

        } else {
            btnPrime3.setEnabled(true);
            btnAnt.setEnabled(true);
            btnSig.setEnabled(true);
            btnUltim.setEnabled(true);
            cargarencampos();

        }

        ponercontadores();
    }//GEN-LAST:event_btnSigActionPerformed

    private void janadirhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janadirhabitacionActionPerformed
        Hotel hotel = (Hotel) hoteles.get(indicehotel);
        Vista.admin_habitacion Huesped = new Vista.admin_habitacion(this, true, hotel);
        Huesped.setVisible(true);


    }//GEN-LAST:event_janadirhabitacionActionPerformed

    /**
     * @param args the command line arguments
     */
    private void activarjtxt(Boolean estado) {
        jtciudad.setEnabled(estado);
        jtnombre.setEnabled(estado);
        cbcategorias.setEnabled(estado);
    }

    private void cargarencampos() {
        if (hoteles.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay datos en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            dispose();
        } else {
            Hotel hotel = (Hotel) hoteles.get(indicehotel);
            jtciudad.setText(hotel.getCiudad());
            jtnombre.setText(hotel.getNombre());
            cargarencombo(hotel);
        }
    }

    private void ponercontadores() {
        lbrgactual.setText(String.valueOf(indicehotel + 1));
        lbtotal.setText(String.valueOf(hoteles.size()));
    }

    private void limpiarform() {

        jtciudad.setText("");
        jtnombre.setText("");
        cbcategorias.setSelectedIndex(0);
    }

    private void cargarencampos(Hotel h) {
        jtciudad.setText(h.getCiudad());
        jtnombre.setText(h.getNombre());
        cargarencombo(h);
    }

    private boolean comprobarDatos() {
        boolean comprobacion = false;
        String error = "Hay errores en : \n";
        if (jtnombre.getText().length() == 0) {
            error = error + "error en el campo nombre \n";
            comprobacion = true;
        }
        if (jtciudad.getText().length() == 0) {
            error = error + "error en el campo ciudad \n";
            comprobacion = true;
        }

        return comprobacion;

    }

    private void botoneraNavegacionActivada(boolean estado) {
        btnPrime3.setEnabled(estado);
        btnAnt.setEnabled(estado);
        btnSig.setEnabled(estado);
        btnUltim.setEnabled(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgmodo;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnPrime3;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnUltim;
    private javax.swing.JComboBox cbcategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton janadirhabitacion;
    private javax.swing.JButton jbborrar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbejecutaraccion;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JTextField jtciudad;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JLabel lbcategoria;
    private javax.swing.JLabel lbciudad;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblTot;
    private javax.swing.JLabel lbmodo;
    private javax.swing.JLabel lbrgactual;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JRadioButton rbalta;
    private javax.swing.JRadioButton rbbaja;
    private javax.swing.JRadioButton rbbusqueda;
    private javax.swing.JRadioButton rbmodificacion;
    // End of variables declaration//GEN-END:variables

    private void cargarencombo(Hotel hotel) {

        for (int i = 0; i < cbcategorias.getItemCount(); i++) {
            cbcategorias.setSelectedIndex(i);
            String[] combosplit = String.valueOf(cbcategorias.getSelectedItem()).split("-");
            Categoria c = oph.buscarCategoria(hotel.getCategoria().getIdcategoria());
            if (combosplit[0].equals(String.valueOf(c.getIdcategoria()))) {
                break;
            }
        }

    }

    private void redimensionar() {

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = 2 * d.width / 3;
        int alto = d.height / 2;
        this.setLocationRelativeTo(this);
        d = Toolkit.getDefaultToolkit().getScreenSize();
        ancho = 2 * d.width / 6;
        alto = d.height / 4;
        this.setMaximumSize(new Dimension(ancho, alto));
        this.setMinimumSize(new Dimension(ancho, alto));
        this.pack();
    }

    private void cargarcombo() {
        Iterator<Categoria> iter = oph.cargarcombocategoria();
        ArrayList<String> ven = new ArrayList<String>();
        while (iter.hasNext()) {
            Categoria cat = (Categoria) iter.next();
            String lan = String.valueOf(cat.getIdcategoria()) + "-" + cat.getDescripcion();
            ven.add(lan);
        }

        cbcategorias.setModel(new DefaultComboBoxModel(ven.toArray()));

    }
}
