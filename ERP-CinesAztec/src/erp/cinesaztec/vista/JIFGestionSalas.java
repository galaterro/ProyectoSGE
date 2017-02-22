/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.vista;

import erp.cinesaztec.modelo.Sala;
import erp.cinesaztec.persistencia.SalaPersistencia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allen
 */
class JIFGestionSalas extends javax.swing.JInternalFrame {

    private SalaPersistencia sp = new SalaPersistencia();
    private ArrayList<Sala> alSala;
    private Sala sala;
    private Vector vSala = new Vector();
    private DefaultTableModel dtm = new DefaultTableModel(vSala, 0);
    /**
     * Creates new form JIFGestionSalas
     */
    public JIFGestionSalas() {
        initComponents();
//        Vector vSala = new Vector();
//        DefaultTableModel dtm = new DefaultTableModel(vSala, 0);
        vSala.add("ID Sala:");
        vSala.add("Nombre Sala:");
        vSala.add("Número de Butacas:");
        vSala.add("ID Cine:");
        jtaConsulta.setModel(dtm);
        this.setSize(990, 700);
        this.setResizable(false);
        this.setTitle("Gestión Salas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpFondo = new javax.swing.JTabbedPane();
        jtpConsulta = new javax.swing.JTabbedPane();
        jpConsulta = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jlCifConsulta = new javax.swing.JLabel();
        jtIdConsultaSala = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaConsulta = new javax.swing.JTable();
        jbAceptarConsulta = new javax.swing.JButton();
        jtpModificar = new javax.swing.JTabbedPane();
        jpModificar = new javax.swing.JPanel();
        jlNombreCine = new javax.swing.JLabel();
        jlCifCine = new javax.swing.JLabel();
        jlCIfBuscador = new javax.swing.JLabel();
        jlDireccionCine = new javax.swing.JLabel();
        jtfCifBuscador = new javax.swing.JTextField();
        jtfNombreSala = new javax.swing.JTextField();
        jtfNumeroButacas = new javax.swing.JTextField();
        jtfIDCine = new javax.swing.JTextField();
        jbtModificar = new javax.swing.JButton();
        jbtBuscarSalaModificar = new javax.swing.JButton();
        jlNombreActual = new javax.swing.JLabel();
        jlDireccionActual = new javax.swing.JLabel();
        jlPoblacionActual = new javax.swing.JLabel();
        jlNombreResultado = new javax.swing.JLabel();
        jlNumeroResultado = new javax.swing.JLabel();
        jlCineResultado = new javax.swing.JLabel();
        jtpAltaCine = new javax.swing.JTabbedPane();
        jpAltaCine = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtfNombreNuevo = new javax.swing.JTextField();
        jlCif = new javax.swing.JLabel();
        jtfNumeroButacasNuevo = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfIdCineNueva = new javax.swing.JTextField();
        jbAltaSala = new javax.swing.JButton();
        jtpEliminar = new javax.swing.JTabbedPane();
        jpFondoEleminar = new javax.swing.JPanel();
        jlCifCineEliminar = new javax.swing.JLabel();
        jtfCifCineEliminar = new javax.swing.JTextField();
        jlCineAEliminar = new javax.swing.JLabel();
        jbAceptarCifEleiminar = new javax.swing.JButton();
        jlIDSalaAEliminar = new javax.swing.JLabel();
        jlNombreSalaAEliminar = new javax.swing.JLabel();
        jlNumeroButacasAELiminar = new javax.swing.JLabel();
        jlIDCineAEliminar = new javax.swing.JLabel();
        jbComfirmarEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Ingrese el ID de la sala o pulse Aceptar para búsqueda completar:");

        jlCifConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCifConsulta.setText("ID:");

        jtaConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtaConsulta);

        jbAceptarConsulta.setText("Aceptar");
        jbAceptarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addComponent(jlCifConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtIdConsultaSala))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAceptarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCifConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdConsultaSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAceptarConsulta)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jtpConsulta.addTab("", jpConsulta);

        jtpFondo.addTab("Consulta", jtpConsulta);

        jlNombreCine.setText("Nombre:");

        jlCifCine.setText("Número de butacas:");

        jlCIfBuscador.setText("Ingrese el ID de la sala que desea modificar:");

        jlDireccionCine.setText("ID Cine");

        jbtModificar.setText("Modificar");

        jbtBuscarSalaModificar.setText("Buscar");
        jbtBuscarSalaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarSalaModificarActionPerformed(evt);
            }
        });

        jlNombreActual.setText("Nombre Actual:");

        jlDireccionActual.setText("Número de butacas Actual:");

        jlPoblacionActual.setText("Cine Actual:");

        javax.swing.GroupLayout jpModificarLayout = new javax.swing.GroupLayout(jpModificar);
        jpModificar.setLayout(jpModificarLayout);
        jpModificarLayout.setHorizontalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlNombreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jlDireccionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlNombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlNumeroResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCineResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCifCine, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfIDCine, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNumeroButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlCIfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtBuscarSalaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCIfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscarSalaModificar))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDireccionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCineResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jlNumeroResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlNombreResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumeroButacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCifCine, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jbtModificar)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jtpModificar.addTab("", jpModificar);

        jtpFondo.addTab("Modificar", jtpModificar);

        jlNombre.setText("Nombre:");

        jlCif.setText("Número de butacas:");

        jlDireccion.setText("ID Cine:");

        jbAltaSala.setText("Aceptar");
        jbAltaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAltaCineLayout = new javax.swing.GroupLayout(jpAltaCine);
        jpAltaCine.setLayout(jpAltaCineLayout);
        jpAltaCineLayout.setHorizontalGroup(
            jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaCineLayout.createSequentialGroup()
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAltaCineLayout.createSequentialGroup()
                            .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtfNombreNuevo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAltaCineLayout.createSequentialGroup()
                            .addComponent(jlCif, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtfNumeroButacasNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbAltaSala)
                        .addGroup(jpAltaCineLayout.createSequentialGroup()
                            .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtfIdCineNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jpAltaCineLayout.setVerticalGroup(
            jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaCineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCif, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumeroButacasNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdCineNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jbAltaSala)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jtpAltaCine.addTab("", jpAltaCine);

        jtpFondo.addTab("Alta", jtpAltaCine);

        jlCifCineEliminar.setText("Ingrese el ID de la sala que desee eliminar:");

        jlCineAEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCineAEliminar.setText("Va a eliminar la siguiente sala:");

        jbAceptarCifEleiminar.setText("Aceptar");
        jbAceptarCifEleiminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarCifEleiminarActionPerformed(evt);
            }
        });

        jbComfirmarEliminar.setText("Eliminar");
        jbComfirmarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComfirmarEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondoEleminarLayout = new javax.swing.GroupLayout(jpFondoEleminar);
        jpFondoEleminar.setLayout(jpFondoEleminarLayout);
        jpFondoEleminarLayout.setHorizontalGroup(
            jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                        .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                                .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbAceptarCifEleiminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                                .addComponent(jlIDSalaAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlNombreSalaAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlNumeroButacasAELiminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEleminarLayout.createSequentialGroup()
                        .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlIDCineAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbComfirmarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(197, 197, 197))))
        );
        jpFondoEleminarLayout.setVerticalGroup(
            jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbAceptarCifEleiminar)))
                .addGap(18, 18, 18)
                .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpFondoEleminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlIDSalaAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jlNombreSalaAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNumeroButacasAELiminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEleminarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlIDCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbComfirmarEliminar)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jtpEliminar.addTab("", jpFondoEleminar);

        jtpFondo.addTab("Eliminar", jtpEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpFondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarConsultaActionPerformed
        consultaSala();
    }//GEN-LAST:event_jbAceptarConsultaActionPerformed

    private void jbtBuscarSalaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarSalaModificarActionPerformed


    }//GEN-LAST:event_jbtBuscarSalaModificarActionPerformed

    private void jbAltaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAltaSalaActionPerformed

    private void jbAceptarCifEleiminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarCifEleiminarActionPerformed

    }//GEN-LAST:event_jbAceptarCifEleiminarActionPerformed

    private void jbComfirmarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComfirmarEliminarActionPerformed

    }//GEN-LAST:event_jbComfirmarEliminarActionPerformed

    public void consultaSala() {
        String idBuscador = jtIdConsultaSala.getText();

        if (idBuscador.equals("")) {
            /* Búsqueda general de cines. */
            try {
                //reiniciarCamposConsulta();
                alSala = sp.listarSalas();
                dtm.setRowCount(alSala.size());
                for (int i = 0; i < alSala.size(); i++) {
                    jtaConsulta.setValueAt(alSala.get(i).getId_sala(), i, 0);
                    jtaConsulta.setValueAt(alSala.get(i).getNombre_sala(), i, 1);
                    jtaConsulta.setValueAt(alSala.get(i).getNumero_butacas(), i, 2);
                    jtaConsulta.setValueAt(alSala.get(i).getId_cine(), i, 3);
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar ningún cine.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        } else {
            try {
                //reiniciarCamposConsulta();
                int id_buscador = Integer.parseInt(idBuscador);
                sala = sp.buscarSala(id_buscador);
                dtm.setRowCount(1);
                jtaConsulta.setValueAt(sala.getId_sala(), 0, 0);
                jtaConsulta.setValueAt(sala.getNombre_sala(), 0, 1);
                jtaConsulta.setValueAt(sala.getNumero_butacas(), 0, 2);
                jtaConsulta.setValueAt(sala.getId_cine(), 0, 3);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar el cine solicitado.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptarCifEleiminar;
    private javax.swing.JButton jbAceptarConsulta;
    private javax.swing.JButton jbAltaSala;
    private javax.swing.JButton jbComfirmarEliminar;
    private javax.swing.JButton jbtBuscarSalaModificar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlCIfBuscador;
    private javax.swing.JLabel jlCif;
    private javax.swing.JLabel jlCifCine;
    private javax.swing.JLabel jlCifCineEliminar;
    private javax.swing.JLabel jlCifConsulta;
    private javax.swing.JLabel jlCineAEliminar;
    private javax.swing.JLabel jlCineResultado;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDireccionActual;
    private javax.swing.JLabel jlDireccionCine;
    private javax.swing.JLabel jlIDCineAEliminar;
    private javax.swing.JLabel jlIDSalaAEliminar;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreActual;
    private javax.swing.JLabel jlNombreCine;
    private javax.swing.JLabel jlNombreResultado;
    private javax.swing.JLabel jlNombreSalaAEliminar;
    private javax.swing.JLabel jlNumeroButacasAELiminar;
    private javax.swing.JLabel jlNumeroResultado;
    private javax.swing.JLabel jlPoblacionActual;
    private javax.swing.JPanel jpAltaCine;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFondoEleminar;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JTextField jtIdConsultaSala;
    private javax.swing.JTable jtaConsulta;
    private javax.swing.JTextField jtfCifBuscador;
    private javax.swing.JTextField jtfCifCineEliminar;
    private javax.swing.JTextField jtfIDCine;
    private javax.swing.JTextField jtfIdCineNueva;
    private javax.swing.JTextField jtfNombreNuevo;
    private javax.swing.JTextField jtfNombreSala;
    private javax.swing.JTextField jtfNumeroButacas;
    private javax.swing.JTextField jtfNumeroButacasNuevo;
    private javax.swing.JTabbedPane jtpAltaCine;
    private javax.swing.JTabbedPane jtpConsulta;
    private javax.swing.JTabbedPane jtpEliminar;
    private javax.swing.JTabbedPane jtpFondo;
    private javax.swing.JTabbedPane jtpModificar;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
