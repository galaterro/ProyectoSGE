/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.vista;

import erp.cinesaztec.modelo.Cine;
import erp.cinesaztec.persistencia.CinePersistencia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

/**
 * JInternalFrame dedicado a gestión de cines.
 *
 * @author Cine Aztec Team
 */
class JIFGestionCines extends javax.swing.JInternalFrame {

    private CinePersistencia cp = new CinePersistencia();
    private ArrayList<Cine> alCine = new ArrayList();
    private Cine cine;
    private Vector vCine = new Vector();
    private DefaultTableModel dtm = new DefaultTableModel(vCine, 0);
    private int contadorModificadosAlta = 0;

    /* Se usa para contar cuántos TextField están modificados y desbloquear el botón en el debido momento. */

    public JIFGestionCines() {
        initComponents();
//        Vector vCine = new Vector();
//        dtm = new DefaultTableModel(vCine, 0);
        vCine.add("Nombre cine:");
        vCine.add("CIF cine:");
        vCine.add("Dirección cine:");
        vCine.add("Población cine:");
        vCine.add("Código postal cine:");
        jtaConsulta.setModel(dtm);
        this.setSize(990, 700);
        this.setResizable(false);
        this.setTitle("Gestión Cines");
        /* Se añade un Listener para analizar cuándo se recibe algún cambio de ventana en esta ventana. */
        jtpFondo.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                if (e.getSource() instanceof JTabbedPane) {
                    reiniciarCamposConsulta();
                    reiniciarCamposModificar();
                    reiniciarCamposAlta();
                    reiniciarCamposEliminar();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpFondo = new javax.swing.JTabbedPane();
        jtpConsulta = new javax.swing.JTabbedPane();
        jpConsulta = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jlCifConsulta = new javax.swing.JLabel();
        jtfCifConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaConsulta = new javax.swing.JTable();
        jbAceptarConsulta = new javax.swing.JButton();
        jtpModificar = new javax.swing.JTabbedPane();
        jpModificar = new javax.swing.JPanel();
        jlNombreCine = new javax.swing.JLabel();
        jlCifCine = new javax.swing.JLabel();
        jlCifBuscador = new javax.swing.JLabel();
        jlDireccionCine = new javax.swing.JLabel();
        jlPoblacionCine = new javax.swing.JLabel();
        jlCodigoPostal = new javax.swing.JLabel();
        jtfCifBuscador = new javax.swing.JTextField();
        jtfNombreCine = new javax.swing.JTextField();
        jtfCIfCine = new javax.swing.JTextField();
        jtfDireccionCine = new javax.swing.JTextField();
        jtfPoblacionCine = new javax.swing.JTextField();
        jtfCodigoPostal = new javax.swing.JTextField();
        jbtModificar = new javax.swing.JButton();
        jbtBuscarCineModificar = new javax.swing.JButton();
        jlNombreActual = new javax.swing.JLabel();
        jlDireccionActual = new javax.swing.JLabel();
        jlPoblacionActual = new javax.swing.JLabel();
        jlCodigoPostalActual = new javax.swing.JLabel();
        jlNombreResultado = new javax.swing.JLabel();
        jlDireccionResultado = new javax.swing.JLabel();
        jlPoblacionResultado = new javax.swing.JLabel();
        jlCodigoPostalResultado = new javax.swing.JLabel();
        jtpAltaCine = new javax.swing.JTabbedPane();
        jpAltaCine = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtfNombreNuevo = new javax.swing.JTextField();
        jlCif = new javax.swing.JLabel();
        jtfCifNuevo = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfDireccionNueva = new javax.swing.JTextField();
        jlPoblacion = new javax.swing.JLabel();
        jtfPoblacionNueva = new javax.swing.JTextField();
        jlCodPostal = new javax.swing.JLabel();
        jtfCodPosNuevo = new javax.swing.JTextField();
        jbAltaCine = new javax.swing.JButton();
        jtpEliminar = new javax.swing.JTabbedPane();
        jpFondoEliminar = new javax.swing.JPanel();
        jlCifCineEliminar = new javax.swing.JLabel();
        jtfCifCineEliminar = new javax.swing.JTextField();
        jlCineAEliminar = new javax.swing.JLabel();
        jbAceptarCifEliminar = new javax.swing.JButton();
        jlNombreCineAEliminar = new javax.swing.JLabel();
        jlDireccionCineAELiminar = new javax.swing.JLabel();
        jlPobCineAEliminar = new javax.swing.JLabel();
        jlCodPosCineAEliminar = new javax.swing.JLabel();
        jbConfirmarEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeactivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jtpFondo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtpFondoStateChanged(evt);
            }
        });

        jtpConsulta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtpConsultaStateChanged(evt);
            }
        });
        jtpConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtpConsultaFocusLost(evt);
            }
        });

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Ingrese el CIF del cine o pulse Aceptar para búsqueda completar:");

        jlCifConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCifConsulta.setText("CIF:");

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
                        .addComponent(jtfCifConsulta))
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
                    .addComponent(jtfCifConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAceptarConsulta)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jtpConsulta.addTab("", jpConsulta);

        jtpFondo.addTab("Consulta", jtpConsulta);

        jlNombreCine.setText("Nombre:");

        jlCifCine.setText("CIF:");

        jlCifBuscador.setText("Ingrese el CIF del cine que desea modificar:");

        jlDireccionCine.setText("Dirección:");

        jlPoblacionCine.setText("Población:");

        jlCodigoPostal.setText("Código Postal:");

        jbtModificar.setText("Modificar");
        jbtModificar.setEnabled(false);
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtBuscarCineModificar.setText("Buscar");
        jbtBuscarCineModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarCineModificarActionPerformed(evt);
            }
        });

        jlNombreActual.setText("Nombre Actual:");

        jlDireccionActual.setText("Dirección Actual:");

        jlPoblacionActual.setText("Población Actual:");

        jlCodigoPostalActual.setText("Código postal Actual:");

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
                        .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCodigoPostalActual, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlNombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlDireccionResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlPoblacionResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlCodigoPostalResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCifCine, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPoblacionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCIfCine, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPoblacionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtBuscarCineModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscarCineModificar))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDireccionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigoPostalActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCodigoPostalResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jlPoblacionResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDireccionResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlNombreResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCIfCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCifCine, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPoblacionCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPoblacionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpModificar.addTab("", jpModificar);

        jtpFondo.addTab("Modificar", jtpModificar);

        jlNombre.setText("Nombre:");

        jtfNombreNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreNuevoActionPerformed(evt);
            }
        });
        jtfNombreNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNombreNuevoKeyPressed(evt);
            }
        });

        jlCif.setText("CIF:");

        jlDireccion.setText("Dirección:");

        jlPoblacion.setText("Población:");

        jlCodPostal.setText("Código Postal:");

        jbAltaCine.setText("Aceptar");
        jbAltaCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaCineActionPerformed(evt);
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
                            .addComponent(jtfCifNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbAltaCine)
                        .addGroup(jpAltaCineLayout.createSequentialGroup()
                            .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlCodPostal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(jlPoblacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfDireccionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfCodPosNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfPoblacionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(jtfCifNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDireccionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPoblacionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodPosNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAltaCine)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jtpAltaCine.addTab("", jpAltaCine);

        jtpFondo.addTab("Alta", jtpAltaCine);

        jlCifCineEliminar.setText("Ingrese el CIF del cine que desee eliminar:");

        jlCineAEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCineAEliminar.setText("Va a eliminar el siguiente cine:");

        jbAceptarCifEliminar.setText("Aceptar");
        jbAceptarCifEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarCifEliminarActionPerformed(evt);
            }
        });

        jbConfirmarEliminar.setText("Eliminar");
        jbConfirmarEliminar.setEnabled(false);
        jbConfirmarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondoEliminarLayout = new javax.swing.GroupLayout(jpFondoEliminar);
        jpFondoEliminar.setLayout(jpFondoEliminarLayout);
        jpFondoEliminarLayout.setHorizontalGroup(
            jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                        .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAceptarCifEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                        .addComponent(jlNombreCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlDireccionCineAELiminar, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlPobCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCodPosCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirmarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jpFondoEliminarLayout.setVerticalGroup(
            jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbAceptarCifEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNombreCineAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jlDireccionCineAELiminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEliminarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlCodPosCineAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jlPobCineAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jbConfirmarEliminar)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jtpEliminar.addTab("", jpFondoEliminar);

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

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
    }//GEN-LAST:event_formInternalFrameDeactivated

    private void jbtBuscarCineModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarCineModificarActionPerformed
        cargarCineModificar();
    }//GEN-LAST:event_jbtBuscarCineModificarActionPerformed

    private void jbAceptarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarConsultaActionPerformed
        consultaCine();
    }//GEN-LAST:event_jbAceptarConsultaActionPerformed

    private void jbAltaCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaCineActionPerformed
        ingresarCine();
    }//GEN-LAST:event_jbAltaCineActionPerformed

    private void jbAceptarCifEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarCifEliminarActionPerformed
        cargarCineEliminar();
    }//GEN-LAST:event_jbAceptarCifEliminarActionPerformed

    private void jbConfirmarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarEliminarActionPerformed
        eliminarCine();
    }//GEN-LAST:event_jbConfirmarEliminarActionPerformed

    private void jtpConsultaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtpConsultaStateChanged

    }//GEN-LAST:event_jtpConsultaStateChanged

    private void jtpConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtpConsultaFocusLost
    }//GEN-LAST:event_jtpConsultaFocusLost

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        modificarCine();
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jtpFondoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtpFondoStateChanged
    }//GEN-LAST:event_jtpFondoStateChanged

    private void jtfNombreNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreNuevoActionPerformed
        
    }//GEN-LAST:event_jtfNombreNuevoActionPerformed

    private void jtfNombreNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreNuevoKeyPressed

    }//GEN-LAST:event_jtfNombreNuevoKeyPressed

    /**
     * Método usado para limpiar las tablas de cara a una nueva consulta.
     */
    private void limpiarTabla() {
        jtaConsulta.setModel(dtm);
        dtm.setRowCount(0);
    }
    
    /**
     * Método usado para ingresar un nuevo cine.
     */
    public void ingresarCine() {
        if (jtfNombreNuevo.getText().compareToIgnoreCase("") == 0) {
            JOptionPane.showMessageDialog(null, "Inserte un nombre válido.");
        } else {
            if (jtfCifNuevo.getText().compareToIgnoreCase("") == 0) {
                JOptionPane.showMessageDialog(null, "Inserte un CIF válido.");
            } else {
                if (jtfDireccionNueva.getText().compareToIgnoreCase("") == 0) {
                    JOptionPane.showMessageDialog(null, "Inserte una dirección válida.");
                } else {
                    if (jtfPoblacionNueva.getText().compareToIgnoreCase("") == 0) {
                        JOptionPane.showMessageDialog(null, "Inserte una población válida.");
                    } else {
                        if (jtfCodPosNuevo.getText().compareToIgnoreCase("") == 0) {
                            JOptionPane.showMessageDialog(null, "Inserte un código postal válido.");
                        } else {
                            String nombreNuevo = jtfNombreNuevo.getText();
                            String cifNuevo = jtfCifNuevo.getText();
                            String dirNueva = jtfDireccionNueva.getText();
                            String poblaNueva = jtfPoblacionNueva.getText();
                            int codPosNuevo = Integer.parseInt(jtfCodPosNuevo.getText());
                            cine = new Cine(nombreNuevo, cifNuevo, dirNueva, poblaNueva, codPosNuevo);
                            try {
                                cp.ingresarCine(cine);
                                reiniciarCamposAlta();
                                JOptionPane.showMessageDialog(null, "Cine ingresado con éxito.");
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nNo se ha podido ingresar el nuevo cine.\nPruebe de nuevo.");
                            } catch (ClassNotFoundException ex) {
                                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nPruebe de nuevo.");
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Método usado para consultar los cines.
     */
    public void consultaCine() {
        String cifBuscador = jtfCifConsulta.getText();

        if (cifBuscador.equals("")) {
            /* Búsqueda general de cines. */
            try {
                reiniciarCamposConsulta();
                limpiarTabla();
                alCine.clear();
                alCine = cp.listarCines();
                dtm.setRowCount(alCine.size());
                for (int i = 0; i < alCine.size(); i++) {
                    jtaConsulta.setValueAt(alCine.get(i).getNombre_cine(), i, 0);
                    jtaConsulta.setValueAt(alCine.get(i).getCif_cine(), i, 1);
                    jtaConsulta.setValueAt(alCine.get(i).getDir_cine(), i, 2);
                    jtaConsulta.setValueAt(alCine.get(i).getPob_cine(), i, 3);
                    jtaConsulta.setValueAt(alCine.get(i).getCodPos_cine(), i, 4);
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar ningún cine.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        } else {
            /* Búsqueda específica de cine por CIF. */
            try {
                reiniciarCamposConsulta();
                limpiarTabla();
                cine = cp.buscarCine(cifBuscador);
                dtm.setRowCount(1);
                jtaConsulta.setValueAt(cine.getNombre_cine(), 0, 0);
                jtaConsulta.setValueAt(cine.getCif_cine(), 0, 1);
                jtaConsulta.setValueAt(cine.getDir_cine(), 0, 2);
                jtaConsulta.setValueAt(cine.getPob_cine(), 0, 3);
                jtaConsulta.setValueAt(cine.getCodPos_cine(), 0, 4);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar el cine solicitado.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        }
    }

    /**
     * Método usado específicamente para recoger los cines existentes en la
     * ventana Modificar.
     */
    public void cargarCineModificar() {
        String cifBuscador = jtfCifBuscador.getText();
        boolean existe = false;
        if (cifBuscador.compareToIgnoreCase("") == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un CIF válido.");
        } else {
            try {
                existe = cp.existeCine(cifBuscador);
                if (existe) {
                    cine = cp.buscarCine(cifBuscador);
                    jlNombreResultado.setText(cine.getNombre_cine());
                    jlDireccionResultado.setText(cine.getDir_cine());
                    Integer codPos = cine.getCodPos_cine();
                    jlCodigoPostalResultado.setText(codPos.toString());
                    jlPoblacionResultado.setText(cine.getPob_cine());

                    jtfNombreCine.setText(jlNombreResultado.getText());
                    jtfCIfCine.setText(jtfCifBuscador.getText());
                    jtfDireccionCine.setText(jlDireccionResultado.getText());
                    jtfPoblacionCine.setText(jlPoblacionResultado.getText());
                    jtfCodigoPostal.setText(jlCodigoPostalResultado.getText());
                    jbtModificar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe el cine con el CIF seleccionado.\nPruebe de nuevo.");
                    jtfCifBuscador.setText("");
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar el cine solicitado.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        }
    }

    /**
     * Método usado para modificar un cine.
     */
    public void modificarCine() {
        try {
            String cif = jtfCifBuscador.getText();
            String nombreNuevo = jtfNombreCine.getText();
            String cifNuevo = jtfCIfCine.getText();
            String direccionNueva = jtfDireccionCine.getText();
            String poblacion = jtfPoblacionCine.getText();
            String codPos = jtfCodigoPostal.getText();
            int codigoPostal = Integer.parseInt(codPos);
            cine = new Cine(nombreNuevo, cifNuevo, direccionNueva, poblacion, codigoPostal);
            cp.actualizarCine(cine, cif);
            JOptionPane.showMessageDialog(null, "Cine actualizado con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido modificar el cine solicitado.\nPruebe de nuevo.");
        }
    }

    /**
     * Método usado específicamente para recoger los cines existentes en la
     * ventana Eliminar.
     */
    public void cargarCineEliminar() {
        String cifBusca = jtfCifCineEliminar.getText();

        if (cifBusca.compareToIgnoreCase("") == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un CIF válido.");
        } else {
            try {
                cine = cp.buscarCine(cifBusca);
                jlNombreCineAEliminar.setText(cine.getNombre_cine());
                jlDireccionCineAELiminar.setText(cine.getDir_cine());
                jlPobCineAEliminar.setText(cine.getPob_cine());
                Integer codPos = cine.getCodPos_cine();
                String codPostal = codPos.toString();
                jlCodPosCineAEliminar.setText(codPostal);
                jbConfirmarEliminar.setEnabled(true);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar el cine solicitado.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        }
    }

    /**
     * Método usado para eliminar un cine.
     */
    public void eliminarCine() {
        String cifEliminar = jtfCifCineEliminar.getText();
        try {
            cp.eliminarCine(cifEliminar);
            JOptionPane.showMessageDialog(null, "Cine eliminado con éxito.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido eliminar el cine solicitado.\nPruebe de nuevo.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
        }
    }

    /**
     * Método usado para reiniciar los campos de la ventana Consulta cuando se
     * produce un cambio de ventana.
     */
    public void reiniciarCamposConsulta() {
        jtfCifConsulta.setText("");
        for (int i = 0; i < jtaConsulta.getRowCount(); i++) {
            dtm.removeRow(i);
            i -= 1;
        }
    }

    /**
     * Método usado para reiniciar los campos de la ventana Modificar cuando se
     * produce un cambio de ventana.
     */
    public void reiniciarCamposModificar() {
        jtfCifBuscador.setText("");
        jtfNombreCine.setText("");
        jtfCIfCine.setText("");
        jtfDireccionCine.setText("");
        jtfPoblacionCine.setText("");
        jtfCodigoPostal.setText("");
        jlNombreResultado.setText("");
        jlDireccionResultado.setText("");
        jlPoblacionResultado.setText("");
        jlCodigoPostalResultado.setText("");
        jbtModificar.setEnabled(false);
    }

    /**
     * Método usado para reiniciar los campos de la ventana Alta cuando se
     * produce un cambio de ventana.
     */
    public void reiniciarCamposAlta() {
        jtfNombreNuevo.setText("");
        jtfCifNuevo.setText("");
        jtfDireccionNueva.setText("");
        jtfPoblacionNueva.setText("");
        jtfCodPosNuevo.setText("");
    }

    /**
     * Método usado para reiniciar los campos de la ventana Eliminar cuando se
     * produce un cambio de ventana.
     */
    public void reiniciarCamposEliminar() {
        jtfCifCineEliminar.setText("");
        jlNombreCineAEliminar.setText("");
        jlDireccionCineAELiminar.setText("");
        jlPobCineAEliminar.setText("");
        jlCodPosCineAEliminar.setText("");
        jbConfirmarEliminar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptarCifEliminar;
    private javax.swing.JButton jbAceptarConsulta;
    private javax.swing.JButton jbAltaCine;
    private javax.swing.JButton jbConfirmarEliminar;
    private javax.swing.JButton jbtBuscarCineModificar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlCif;
    private javax.swing.JLabel jlCifBuscador;
    private javax.swing.JLabel jlCifCine;
    private javax.swing.JLabel jlCifCineEliminar;
    private javax.swing.JLabel jlCifConsulta;
    private javax.swing.JLabel jlCineAEliminar;
    private javax.swing.JLabel jlCodPosCineAEliminar;
    private javax.swing.JLabel jlCodPostal;
    private javax.swing.JLabel jlCodigoPostal;
    private javax.swing.JLabel jlCodigoPostalActual;
    private javax.swing.JLabel jlCodigoPostalResultado;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDireccionActual;
    private javax.swing.JLabel jlDireccionCine;
    private javax.swing.JLabel jlDireccionCineAELiminar;
    private javax.swing.JLabel jlDireccionResultado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreActual;
    private javax.swing.JLabel jlNombreCine;
    private javax.swing.JLabel jlNombreCineAEliminar;
    private javax.swing.JLabel jlNombreResultado;
    private javax.swing.JLabel jlPobCineAEliminar;
    private javax.swing.JLabel jlPoblacion;
    private javax.swing.JLabel jlPoblacionActual;
    private javax.swing.JLabel jlPoblacionCine;
    private javax.swing.JLabel jlPoblacionResultado;
    private javax.swing.JPanel jpAltaCine;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFondoEliminar;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JTable jtaConsulta;
    private javax.swing.JTextField jtfCIfCine;
    private javax.swing.JTextField jtfCifBuscador;
    private javax.swing.JTextField jtfCifCineEliminar;
    private javax.swing.JTextField jtfCifConsulta;
    private javax.swing.JTextField jtfCifNuevo;
    private javax.swing.JTextField jtfCodPosNuevo;
    private javax.swing.JTextField jtfCodigoPostal;
    private javax.swing.JTextField jtfDireccionCine;
    private javax.swing.JTextField jtfDireccionNueva;
    private javax.swing.JTextField jtfNombreCine;
    private javax.swing.JTextField jtfNombreNuevo;
    private javax.swing.JTextField jtfPoblacionCine;
    private javax.swing.JTextField jtfPoblacionNueva;
    private javax.swing.JTabbedPane jtpAltaCine;
    private javax.swing.JTabbedPane jtpConsulta;
    private javax.swing.JTabbedPane jtpEliminar;
    private javax.swing.JTabbedPane jtpFondo;
    private javax.swing.JTabbedPane jtpModificar;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
