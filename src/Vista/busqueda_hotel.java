/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Categoria;
import Modelo.Hotel;
import Modelo.Huesped;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexis
 */
public class busqueda_hotel extends javax.swing.JDialog {

    /**
     * Creates new form busqueda_hotel
     */
    DefaultTableModel m = null;
    Controlador.Operaciones_hoteles oph = new Controlador.Operaciones_hoteles();
    ArrayList<Hotel> hoteleslista = new ArrayList<Hotel>();
    Hotel retornarh = null;

    

    public busqueda_hotel(admin_hoteles parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargar_en_tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtablehoteles = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtablehoteles.setModel(new javax.swing.table.DefaultTableModel(
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
        jtablehoteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablehotelesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablehoteles);

        jLabel1.setText("Haz click sobre un elemente para eliminarlo");

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario de Busqueda de Huesped");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(420, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtablehotelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablehotelesMouseClicked
        retornarh = hoteleslista.get(jtablehoteles.getSelectedRow());
        dispose();
    }//GEN-LAST:event_jtablehotelesMouseClicked

    private void cargar_en_tabla() {

        Iterator<Hotel> iter = oph.todosHoteles();
        String[] col = new String[]{"Nombre", "Ciudad", "Categroia"};
        m = new DefaultTableModel(null, col);
        String[] lineas = new String[col.length];

        while (iter.hasNext()) {
            Hotel hotel = (Hotel) iter.next();
            this.hoteleslista.add(hotel);
            lineas[0] = hotel.getNombre();
            lineas[1] = hotel.getCiudad();
            Categoria c =oph.buscarCategoria(hotel.getCategoria().getIdcategoria());
            lineas[2] =c.getIdcategoria()+"    -    "+c.getDescripcion();
            m.addRow(lineas);

        }

        jtablehoteles.setModel(m);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablehoteles;
    // End of variables declaration//GEN-END:variables
}