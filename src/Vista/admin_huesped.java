/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Huesped;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vesprada
 */
public class admin_huesped extends javax.swing.JDialog {

    /**
     * Creates new form admin_huesped
     */
    String modo;
    int indicehuesped = 0;
    DefaultListModel huespedes;
    Calendar c = GregorianCalendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Controlador.Operaciones_huesped oph = new Controlador.Operaciones_huesped();
    Vista.busqueda_huesped buscaH;

    public admin_huesped(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        huespedes = oph.mostrarHuespedes();
        redimensionar();
        botoneraNavegacionActivada(true);
        activarjtxt(false);
        cargarencampos();
        ponercontadores();
        jbejecutaraccion.setEnabled(false);
        jbborrar.setEnabled(false);
        jbmodificar.setEnabled(false);
        jbcancelar.setEnabled(false);

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
        jPanel5 = new javax.swing.JPanel();
        btnPrime3 = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        btnUltim = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        lblTot = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        lbrgactual = new javax.swing.JLabel();
        lbtotal = new javax.swing.JLabel();
        jbejecutaraccion = new javax.swing.JButton();
        jldni = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jlnombre = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jlapellidos = new javax.swing.JLabel();
        jtapellidos = new javax.swing.JTextField();
        jldireccion = new javax.swing.JLabel();
        jtdireccion = new javax.swing.JTextField();
        dccfecha = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        lbpoblacion = new javax.swing.JLabel();
        jtpoblacion = new javax.swing.JTextField();
        jcbindividual = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jbborrar = new javax.swing.JButton();
        jbmodificar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Huesped");
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

        jbejecutaraccion.setText("Ejecutar Accion");
        jbejecutaraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbejecutaraccionActionPerformed(evt);
            }
        });

        jldni.setText("DNI");

        jlnombre.setText("Nombre");

        jlapellidos.setText("Apellidos");

        jtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtapellidosActionPerformed(evt);
            }
        });

        jldireccion.setText("Direccion");

        jtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdireccionActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha");

        lbpoblacion.setText("Poblacion");

        jcbindividual.setText("Habitacion individual");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbejecutaraccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jldni)
                            .addComponent(jlnombre)
                            .addComponent(jlapellidos)
                            .addComponent(jldireccion)
                            .addComponent(jLabel2)
                            .addComponent(lbpoblacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtdni)
                                .addComponent(jtnombre)
                                .addComponent(jtapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jtdireccion)
                                .addComponent(jtpoblacion)
                                .addComponent(dccfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                            .addComponent(jcbindividual))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jldni)
                            .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlnombre)
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlapellidos)
                            .addComponent(jtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jldireccion)
                            .addComponent(jtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dccfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbpoblacion)
                            .addComponent(jtpoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcbindividual)
                .addGap(50, 50, 50)
                .addComponent(jbejecutaraccion)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaltaActionPerformed
        indicehuesped = 0;
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

        cargarencampos();
        botoneraNavegacionActivada(true);
        modo = "Modi";
        ponercontadores();
        activarjtxt(true);
        dccfecha.setEnabled(true);
        jbejecutaraccion.setEnabled(true);
        jbborrar.setEnabled(false);
        jbmodificar.setEnabled(false);
        jbcancelar.setEnabled(false);

    }//GEN-LAST:event_rbmodificacionActionPerformed

    private void btnPrime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrime3ActionPerformed
        indicehuesped = 0;
        btnPrime3.setEnabled(false);
        btnAnt.setEnabled(false);
        btnSig.setEnabled(true);
        btnUltim.setEnabled(true);
        cargarencampos();
        ponercontadores();
    }//GEN-LAST:event_btnPrime3ActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        indicehuesped--;
        if (indicehuesped < 0) {
            btnPrime3.setEnabled(false);
            btnAnt.setEnabled(false);
            btnSig.setEnabled(true);
            btnUltim.setEnabled(true);
            indicehuesped = 0;

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
        indicehuesped = huespedes.size() - 1;
        btnPrime3.setEnabled(true);
        btnAnt.setEnabled(true);
        btnSig.setEnabled(false);
        btnUltim.setEnabled(false);
        cargarencampos();
        ponercontadores();
    }//GEN-LAST:event_btnUltimActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed

        indicehuesped++;
        if (indicehuesped > huespedes.size() - 1) {
            btnPrime3.setEnabled(true);
            btnAnt.setEnabled(true);
            btnSig.setEnabled(false);
            btnUltim.setEnabled(false);
            indicehuesped = huespedes.size() - 1;

        } else {
            btnPrime3.setEnabled(true);
            btnAnt.setEnabled(true);
            btnSig.setEnabled(true);
            btnUltim.setEnabled(true);
            cargarencampos();

        }

        ponercontadores();
    }//GEN-LAST:event_btnSigActionPerformed

    private void jtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtapellidosActionPerformed

    private void jtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdireccionActionPerformed

    private void jbejecutaraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbejecutaraccionActionPerformed
        switch (modo) {
            case "Alta":
                if (!comprobarDatos()) {
                    Character c;
                    if (jcbindividual.isSelected()) {
                        c = 'S';
                    } else {
                        c = 'N';
                    }
                    Huesped hu = new Huesped(jtdni.getText(), null, jtnombre.getText(), jtapellidos.getText(), jtdireccion.getText(), dccfecha.getSelectedDate().getTime(), jtpoblacion.getText(), c);

                    oph.altaHuesped(hu);
                    huespedes = oph.mostrarHuespedes();
                }
                jtdni.setText("");
                jtnombre.setText("");
                jtapellidos.setText("");
                jtdireccion.setText("");
                dccfecha.getSelectedDate().getTime();
                jtpoblacion.setText("");

                break;
            case "Baja":
                Huesped hu = (Huesped) huespedes.get(indicehuesped);
                oph.bajaHuesped(hu.getDni());
                huespedes = oph.mostrarHuespedes();
                indicehuesped = 0;
                cargarencampos();
                ponercontadores();
                botoneraNavegacionActivada(true);

                break;
            case "Modi":

                if (!comprobarDatos()) {
                    Character c;
                    if (jcbindividual.isSelected()) {
                        c = 'S';
                    } else {
                        c = 'N';
                    }
                    Huesped hus = new Huesped(jtdni.getText(), null, jtnombre.getText(), jtapellidos.getText(), jtdireccion.getText(), dccfecha.getSelectedDate().getTime(), jtpoblacion.getText(), c);

                    oph.ModiHuesped(hus);
                    huespedes = oph.mostrarHuespedes();
                }

                break;
        }

    }//GEN-LAST:event_jbejecutaraccionActionPerformed

    private void rbbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedaActionPerformed
        jbejecutaraccion.setEnabled(false);
        buscaH = new Vista.busqueda_huesped(this, true);
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
            JOptionPane.showMessageDialog(this, "No se ha podido cargar el Huesped", "ERROR", JOptionPane.ERROR_MESSAGE);
            rbaltaActionPerformed(null);
            rbalta.setSelected(true);
        }
    }//GEN-LAST:event_rbbusquedaActionPerformed

    private void jbborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbborrarActionPerformed
        oph.bajaHuesped(buscaH.retornarh.getDni());
        huespedes = oph.mostrarHuespedes();
        indicehuesped = 0;
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
            Character c;
            if (jcbindividual.isSelected()) {
                c = 'S';
            } else {
                c = 'N';
            }
            Huesped hus = new Huesped(jtdni.getText(), null, jtnombre.getText(), jtapellidos.getText(), jtdireccion.getText(), dccfecha.getSelectedDate().getTime(), jtpoblacion.getText(), c);

            oph.ModiHuesped(hus);
            huespedes = oph.mostrarHuespedes();
            indicehuesped = 0;
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

    private void botoneraNavegacionActivada(boolean estado) {
        btnPrime3.setEnabled(estado);
        btnAnt.setEnabled(estado);
        btnSig.setEnabled(estado);
        btnUltim.setEnabled(estado);
    }

    private void activarjtxt(Boolean estado) {
        //poner todos los campos

        jtdni.setEnabled(estado);
        jtnombre.setEnabled(estado);
        jtapellidos.setEnabled(estado);
        jtdireccion.setEnabled(estado);
        dccfecha.setEnabled(estado);
        jtpoblacion.setEnabled(estado);

        jcbindividual.setEnabled(estado);

    }

    private void cargarencampos(Huesped h) {

        jtdni.setText(h.getDni());
        jtnombre.setText(h.getNombre());
        jtapellidos.setText(h.getApellidos());
        jtdireccion.setText(h.getDireccion());
        cargarfecha(String.valueOf(h.getFechaNac()));
        jtpoblacion.setText(h.getPoblacion());
        if (h.getIndividual().equals('S')) {
            jcbindividual.setSelected(true);
        } else {
            jcbindividual.setSelected(false);
        }

    }

    private void cargarencampos() {
        if (huespedes.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay datos en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            dispose();
        } else {
            Huesped huesped = (Huesped) huespedes.get(indicehuesped);
            jtdni.setText(huesped.getDni());
            jtnombre.setText(huesped.getNombre());
            jtapellidos.setText(huesped.getApellidos());
            jtdireccion.setText(huesped.getDireccion());
            cargarfecha(String.valueOf(huesped.getFechaNac()));
            jtpoblacion.setText(huesped.getPoblacion());
            if (huesped.getIndividual().equals('S')) {
                jcbindividual.setSelected(true);
            } else {
                jcbindividual.setSelected(false);
            }
        }
    }

    private void ponercontadores() {
        lbrgactual.setText(String.valueOf(indicehuesped + 1));
        lbtotal.setText(String.valueOf(huespedes.size()));
    }

    private void cargarfecha(String f) {
        try {
            dccfecha.setEnabled(true);
            Date fecha = null;
            fecha = sdf.parse(f);
            c.setTime(fecha);
            dccfecha.setSelectedDate(c);
            dccfecha.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(admin_huesped.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgmodo;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnPrime3;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnUltim;
    private datechooser.beans.DateChooserCombo dccfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbborrar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbejecutaraccion;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JCheckBox jcbindividual;
    private javax.swing.JLabel jlapellidos;
    private javax.swing.JLabel jldireccion;
    private javax.swing.JLabel jldni;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JTextField jtapellidos;
    private javax.swing.JTextField jtdireccion;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JTextField jtpoblacion;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblTot;
    private javax.swing.JLabel lbmodo;
    private javax.swing.JLabel lbpoblacion;
    private javax.swing.JLabel lbrgactual;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JRadioButton rbalta;
    private javax.swing.JRadioButton rbbaja;
    private javax.swing.JRadioButton rbbusqueda;
    private javax.swing.JRadioButton rbmodificacion;
    // End of variables declaration//GEN-END:variables

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

    private void limpiarform() {

        jtdni.setText("");
        jtnombre.setText("");
        jtapellidos.setText("");
        jtdireccion.setText("");
        cargarfecha("2000-01-01");
        jtpoblacion.setText("");
        jcbindividual.setSelected(false);

    }

    private boolean comprobarDatos() {
        boolean comprobacion = false;
        String error = "Hay errores en : \n";
        if (!isNifValido(jtdni.getText())) {
            comprobacion = true;
            error = error + "error en el dni \n";
        }
        if (jtnombre.getText().length() == 0) {
            error = error + "error en el nombre \n";
            comprobacion = true;
        }
        if (jtapellidos.getText().length() == 0) {
            error = error + "error en los apellidos \n";
            comprobacion = true;
        }
        if (jtdireccion.getText().length() == 0) {
            error = error + "error en la direccion \n";
            comprobacion = true;
        }
        if (dccfecha.getSelectedDate().getTime() == null) {
            error = error + "error en el fecha \n";
            comprobacion = true;
        }
        if (jtpoblacion.getText().length() == 0) {
            error = error + "error en el poblacion \n";
            comprobacion = true;
        }

        if (comprobacion) {
            JOptionPane.showMessageDialog(this, error, "Inane error", JOptionPane.ERROR_MESSAGE);
        }
        return comprobacion;

    }

    public boolean isNifValido(String nif) {

        boolean resultado = false;
        String LETRAS_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";

        try {
            String nif1 = nif.toUpperCase();
            if (nif1.matches("[0-9]{8}[" + LETRAS_NIF + "]")) {
                int dni = Integer.parseInt(nif1.substring(0, 8));
                char letraCalculada = LETRAS_NIF.charAt(dni % 23);
                if (letraCalculada == nif1.charAt(8)) {
                    resultado = true;
                }
            }
        } catch (Exception e) {
            resultado = false;
        }

        return resultado;
    }
}
