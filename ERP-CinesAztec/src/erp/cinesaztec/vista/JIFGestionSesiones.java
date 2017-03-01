/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.vista;

import erp.cinesaztec.modelo.Sesion;
import erp.cinesaztec.persistencia.SesionPersistencia;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allen
 */
class JIFGestionSesiones extends javax.swing.JInternalFrame {

    SesionPersistencia sp = new SesionPersistencia();
    Sesion sesion;
    ArrayList<Sesion> alSesion = new ArrayList();
    private DefaultTableModel dtm = null;

    /**
     * Creates new form JIFGestionSesiones
     */
    public JIFGestionSesiones() {
        initComponents();
        Vector vSesion = new Vector();
        dtm = new DefaultTableModel(vSesion, 0);
        vSesion.add("ID:");
        vSesion.add("Hora:");
        vSesion.add("ID Pelicula:");
        vSesion.add("ID Sala:");
        jtaConsulta.setModel(dtm);
        this.setSize(990, 700);
        this.setTitle("Gestión Sesiones");
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
        jtpConsultar = new javax.swing.JTabbedPane();
        jpConsulta = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jlNombreConsulta = new javax.swing.JLabel();
        jtfIDConsulta = new javax.swing.JTextField();
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
        jtfPeliculaModificar = new javax.swing.JTextField();
        jtfSalaModificar = new javax.swing.JTextField();
        jtfHoraModificar = new javax.swing.JTextField();
        jbtModificar = new javax.swing.JButton();
        jbtBuscarModificar = new javax.swing.JButton();
        jlNombreActual = new javax.swing.JLabel();
        jlDireccionActual = new javax.swing.JLabel();
        jlPoblacionActual = new javax.swing.JLabel();
        jlPeliculaNueva = new javax.swing.JLabel();
        jlSalaNueva = new javax.swing.JLabel();
        jlHoraNueva = new javax.swing.JLabel();
        jtpAlta = new javax.swing.JTabbedPane();
        jpAltaCine = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtfPeliculaAlta = new javax.swing.JTextField();
        jlCif = new javax.swing.JLabel();
        jtfSalaAlta = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfHoraAlta = new javax.swing.JTextField();
        jbAltaCine = new javax.swing.JButton();
        jtpEliminar = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jpFondoEleminar = new javax.swing.JPanel();
        jlCifCineEliminar = new javax.swing.JLabel();
        jtfCifCineEliminar = new javax.swing.JTextField();
        jlCineAEliminar = new javax.swing.JLabel();
        jbAceptarCifEleiminar = new javax.swing.JButton();
        jlIDSesionEliminar = new javax.swing.JLabel();
        jlHoraEliminar = new javax.swing.JLabel();
        jlPeliculaEliminar = new javax.swing.JLabel();
        jlCodPosCineAEliminar = new javax.swing.JLabel();
        jbComfirmarEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Ingrese el ID de la sesión o pulse Aceptar para búsqueda completa:");

        jlNombreConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombreConsulta.setText("ID:");

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
                        .addComponent(jlNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfIDConsulta))
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
                    .addComponent(jlNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIDConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAceptarConsulta)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jtpConsultar.addTab("", jpConsulta);

        jtpFondo.addTab("Consultar", jtpConsultar);

        jlNombreCine.setText("ID Película:");

        jlCifCine.setText("ID Sala:");
        jlCifCine.setToolTipText("");

        jlCIfBuscador.setText("Ingrese el CIF de la sesión que desea modificar:");

        jlDireccionCine.setText("Hora Sesión:");

        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtBuscarModificar.setText("Buscar");
        jbtBuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarModificarActionPerformed(evt);
            }
        });

        jlNombreActual.setText("ID Película Actual:");

        jlDireccionActual.setText("ID Sala Actual:");

        jlPoblacionActual.setText("Hora Sesión Actual:");

        javax.swing.GroupLayout jpModificarLayout = new javax.swing.GroupLayout(jpModificar);
        jpModificar.setLayout(jpModificarLayout);
        jpModificarLayout.setHorizontalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlNombreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jlDireccionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlPeliculaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlSalaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlHoraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlCIfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpModificarLayout.createSequentialGroup()
                            .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlCifCine, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfHoraModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfSalaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfPeliculaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCIfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscarModificar))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDireccionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlHoraNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jlSalaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlPeliculaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPeliculaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSalaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCifCine, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccionCine, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHoraModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtModificar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jtpModificar.addTab("", jpModificar);

        jtpFondo.addTab("Modificar", jtpModificar);

        jlNombre.setText("ID Película:");

        jlCif.setText("ID Sala:");

        jlDireccion.setText("Hora Sesión:");

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
                            .addComponent(jtfPeliculaAlta))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAltaCineLayout.createSequentialGroup()
                            .addComponent(jlCif, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtfSalaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbAltaCine)
                        .addGroup(jpAltaCineLayout.createSequentialGroup()
                            .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtfHoraAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jpAltaCineLayout.setVerticalGroup(
            jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaCineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPeliculaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCif, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSalaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHoraAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(jbAltaCine)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jtpAlta.addTab("", jpAltaCine);

        jtpFondo.addTab("Alta", jtpAlta);

        jlCifCineEliminar.setText("Ingrese el CIF de la sesión que desee eliminar:");

        jlCineAEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCineAEliminar.setText("Va a eliminar la siguiente sesión:");

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
                        .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAceptarCifEleiminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondoEleminarLayout.createSequentialGroup()
                        .addComponent(jlIDSesionEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlHoraEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlPeliculaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCodPosCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEleminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbComfirmarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
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
                            .addComponent(jlIDSesionEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jlHoraEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlPeliculaEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEleminarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlCodPosCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbComfirmarEliminar)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpFondoEleminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpFondoEleminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jtpEliminar.addTab("tab1", jPanel4);

        jtpFondo.addTab("Eliminar", jtpEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpFondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpFondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarCifEleiminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarCifEleiminarActionPerformed

    }//GEN-LAST:event_jbAceptarCifEleiminarActionPerformed

    private void jbComfirmarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComfirmarEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbComfirmarEliminarActionPerformed

    private void jbAceptarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarConsultaActionPerformed
        consultaSesiones();
    }//GEN-LAST:event_jbAceptarConsultaActionPerformed

    private void jbtBuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarModificarActionPerformed
        cargarSesion();
    }//GEN-LAST:event_jbtBuscarModificarActionPerformed

    private void jbAltaCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaCineActionPerformed
        crearSesion();
    }//GEN-LAST:event_jbAltaCineActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        modificarSesion();
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void crearSesion() {
           
            SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
            int idPelicula = Integer.parseInt(jtfPeliculaAlta.getText());
            Date horaSesion;
        try {
            horaSesion = format.parse(jtfHoraAlta.getText());
            java.sql.Time hora = new java.sql.Time(horaSesion.getTime());
            
            int idSala = Integer.parseInt(jtfSalaAlta.getText());

            sesion = new Sesion(hora, idPelicula, idSala);
            try {
                sp.ingresarSesion(sesion);
                JOptionPane.showMessageDialog(null, "Sesion ingresado con éxito.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nNo se ha podido ingresar el nuevo cine.\nPruebe de nuevo.");
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nPruebe de nuevo.");
            }
            
        } catch (ParseException ex) {
             JOptionPane.showMessageDialog(null, "Formato de la hora incorrecto.\n ejemplo 18:30:50 \nPruebe de nuevo.");
        }           
    }

    public void cargarSesion() {
        int idSesionBuscador = Integer.parseInt(jtfCifBuscador.getText());

        try {
            sesion = sp.buscarSesiones(idSesionBuscador);

            for (Sesion sesion : alSesion) {
                Integer id_sala = sesion.getId_sala();
                Integer id_pelicula = sesion.getId_sesion();
                Time hora_sesion = sesion.getHora_sesion();

                jlPeliculaNueva.setText(id_sala.toString());
                jlSalaNueva.setText(id_pelicula.toString());
                jlHoraNueva.setText(hora_sesion.toString());
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("aqui");
        } catch (SQLException ex) {
            System.out.println("2");
        }

    }

    public void modificarSesion() {

        try {
            int id_sala = Integer.parseInt(jtfSalaModificar.getText());
            int id_pelicula = Integer.parseInt(jtfPeliculaModificar.getText());
            String hora_sesion = jtfHoraModificar.getText();
            SimpleDateFormat parser = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
            Date date = parser.parse(hora_sesion);

            //  sesion = new Sesion(date, id_pelicula, id_sala);
            try {
                sp.ingresarSesion(sesion);
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar la sesión", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultaSesiones() {

        String cifBuscador = jtfIDConsulta.getText();

        if (cifBuscador.equals("")) {
            try {
                alSesion = sp.listarSesion();
                dtm.setRowCount(alSesion.size());
                for (int i = 0; i < alSesion.size(); i++) {
                    jtaConsulta.setValueAt(alSesion.get(i).getId_sesion(), i, 0);
                    jtaConsulta.setValueAt(alSesion.get(i).getHora_sesion(), i, 1);
                    jtaConsulta.setValueAt(alSesion.get(i).getId_pelicula(), i, 2);
                    jtaConsulta.setValueAt(alSesion.get(i).getId_sala(), i, 3);
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA APLICACIÓN");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "NO SE HA PODIDO CARGAR LA SESIÓN");
            }

        } else {
            try {
                int cif = Integer.parseInt(cifBuscador);
                sesion = sp.buscarSesiones(cif);
                dtm.setRowCount(1);
                jtaConsulta.setValueAt(sesion.getId_sesion(), 0, 0);
                jtaConsulta.setValueAt(sesion.getHora_sesion(), 0, 1);
                jtaConsulta.setValueAt(sesion.getId_pelicula(), 0, 2);
                jtaConsulta.setValueAt(sesion.getId_sala(), 0, 3);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA APLICACIÓN");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "NO SE HAN PODIDO CARGAR LOS CINES" + ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptarCifEleiminar;
    private javax.swing.JButton jbAceptarConsulta;
    private javax.swing.JButton jbAltaCine;
    private javax.swing.JButton jbComfirmarEliminar;
    private javax.swing.JButton jbtBuscarModificar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlCIfBuscador;
    private javax.swing.JLabel jlCif;
    private javax.swing.JLabel jlCifCine;
    private javax.swing.JLabel jlCifCineEliminar;
    private javax.swing.JLabel jlCineAEliminar;
    private javax.swing.JLabel jlCodPosCineAEliminar;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDireccionActual;
    private javax.swing.JLabel jlDireccionCine;
    private javax.swing.JLabel jlHoraEliminar;
    private javax.swing.JLabel jlHoraNueva;
    private javax.swing.JLabel jlIDSesionEliminar;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreActual;
    private javax.swing.JLabel jlNombreCine;
    private javax.swing.JLabel jlNombreConsulta;
    private javax.swing.JLabel jlPeliculaEliminar;
    private javax.swing.JLabel jlPeliculaNueva;
    private javax.swing.JLabel jlPoblacionActual;
    private javax.swing.JLabel jlSalaNueva;
    private javax.swing.JPanel jpAltaCine;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFondoEleminar;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JTable jtaConsulta;
    private javax.swing.JTextField jtfCifBuscador;
    private javax.swing.JTextField jtfCifCineEliminar;
    private javax.swing.JTextField jtfHoraAlta;
    private javax.swing.JTextField jtfHoraModificar;
    private javax.swing.JTextField jtfIDConsulta;
    private javax.swing.JTextField jtfPeliculaAlta;
    private javax.swing.JTextField jtfPeliculaModificar;
    private javax.swing.JTextField jtfSalaAlta;
    private javax.swing.JTextField jtfSalaModificar;
    private javax.swing.JTabbedPane jtpAlta;
    private javax.swing.JTabbedPane jtpConsultar;
    private javax.swing.JTabbedPane jtpEliminar;
    private javax.swing.JTabbedPane jtpFondo;
    private javax.swing.JTabbedPane jtpModificar;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
