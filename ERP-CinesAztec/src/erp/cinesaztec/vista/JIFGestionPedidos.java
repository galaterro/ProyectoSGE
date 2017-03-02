package erp.cinesaztec.vista;

import erp.cinesaztec.modelo.CabeceraPedido;
import erp.cinesaztec.modelo.CuerpoPedido;
import erp.cinesaztec.modelo.Producto;
import erp.cinesaztec.persistencia.PedidoPersistencia;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cine Aztec Team
 */
class JIFGestionPedidos extends javax.swing.JInternalFrame {

    private PedidoPersistencia pp = new PedidoPersistencia();
    private ArrayList<CabeceraPedido> alCabeceraPedido;
    private ArrayList<CuerpoPedido> alCuerpoPedido;
    private CuerpoPedido cuerpoPedido;
    private CabeceraPedido cabeceraPedido;
    private Producto producto;
    private Vector vPedidos = new Vector();
    private DefaultTableModel dtm = new DefaultTableModel(vPedidos, 0);
    private float iva = 1.21f;

    public JIFGestionPedidos() {
        initComponents();
        vPedidos.add("Fecha:");
        vPedidos.add("Importe SIN/IVA:");
        vPedidos.add("IVA:");
        vPedidos.add("Importe IVA/INC.:");
        vPedidos.add("Producto:");
        vPedidos.add("Descripcion Producto:");
        vPedidos.add("Cantidad:");

        jtaConsulta.setModel(dtm);
        this.setSize(990, 700);
        this.setResizable(false);
        this.setTitle("Gestión Pedidos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpFondo = new javax.swing.JTabbedPane();
        jtpConsulta = new javax.swing.JTabbedPane();
        jpConsulta = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jlCifConsulta = new javax.swing.JLabel();
        jtfIdConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaConsulta = new javax.swing.JTable();
        jbAceptarConsulta = new javax.swing.JButton();
        jtpModificar = new javax.swing.JTabbedPane();
        jpModificar = new javax.swing.JPanel();
        jlNombreCine = new javax.swing.JLabel();
        jlCifBuscador = new javax.swing.JLabel();
        jtfIdBuscador = new javax.swing.JTextField();
        jtfFechaModificar = new javax.swing.JTextField();
        jbtModificar = new javax.swing.JButton();
        jbtBuscarPedidoModificar = new javax.swing.JButton();
        jlNombreActual = new javax.swing.JLabel();
        jlDireccionActual = new javax.swing.JLabel();
        jlPoblacionActual = new javax.swing.JLabel();
        jlCodigoPostalActual = new javax.swing.JLabel();
        jlFechaResultado = new javax.swing.JLabel();
        jlImporteSinIvaResultado = new javax.swing.JLabel();
        jlimporteConIvaResultado = new javax.swing.JLabel();
        jlDescProductoResultado = new javax.swing.JLabel();
        jlCtd = new javax.swing.JLabel();
        jlCtdResultado = new javax.swing.JLabel();
        jlIva = new javax.swing.JLabel();
        jlIvaResultado = new javax.swing.JLabel();
        jtpAltaCine = new javax.swing.JTabbedPane();
        jpAltaCine = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtfFechaAltaPedido = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfCantidadAltaPedido = new javax.swing.JTextField();
        jlPoblacion = new javax.swing.JLabel();
        jtfNombreAltaProductoPedido = new javax.swing.JTextField();
        jbAltaPedido = new javax.swing.JButton();
        jtpEliminar = new javax.swing.JTabbedPane();
        jpFondoEliminar = new javax.swing.JPanel();
        jlCifCineEliminar = new javax.swing.JLabel();
        jtfIdPedidoEliminar = new javax.swing.JTextField();
        jlCineAEliminar = new javax.swing.JLabel();
        jbAceptaridEliminar = new javax.swing.JButton();
        jlFechaPedidoAEliminar = new javax.swing.JLabel();
        jlImportotalSinIvaAELiminar = new javax.swing.JLabel();
        jlImporteTotalConIvaAEliminar = new javax.swing.JLabel();
        jlDescripcionAEliminar = new javax.swing.JLabel();
        jbConfirmarEliminar = new javax.swing.JButton();
        jlNombreProductEliminar = new javax.swing.JLabel();
        jlCtdtEliminar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

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
        lbTitulo.setText("Ingrese el ID del pedido o pulse Aceptar para  completar la búsqueda:");

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
                        .addComponent(jtfIdConsulta))
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
                    .addComponent(jtfIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAceptarConsulta)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jtpConsulta.addTab("", jpConsulta);

        jtpFondo.addTab("Consulta", jtpConsulta);

        jlNombreCine.setText("Fecha:");

        jlCifBuscador.setText("Ingrese el id del pedido que desea modificar:");

        jbtModificar.setText("Modificar");
        jbtModificar.setEnabled(false);
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtBuscarPedidoModificar.setText("Buscar");
        jbtBuscarPedidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarPedidoModificarActionPerformed(evt);
            }
        });

        jlNombreActual.setText("Fechal:");

        jlDireccionActual.setText("Importe SIN/IVA:");

        jlPoblacionActual.setText("Importe CON/IVA");

        jlCodigoPostalActual.setText("Descripción Producto:");

        jlCtd.setText("Cantidad:");

        jlIva.setText("IVA:");

        javax.swing.GroupLayout jpModificarLayout = new javax.swing.GroupLayout(jpModificar);
        jpModificar.setLayout(jpModificarLayout);
        jpModificarLayout.setHorizontalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(jlCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfIdBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtBuscarPedidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNombreActual, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jlFechaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlImporteSinIvaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDireccionActual, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlimporteConIvaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpModificarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlDescProductoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlCodigoPostalActual, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlCtd, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jlCtdResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlIva, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jlIvaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpModificarLayout.createSequentialGroup()
                            .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jtfFechaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCifBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscarPedidoModificar))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDireccionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPoblacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigoPostalActual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCtd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpModificarLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlimporteConIvaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                .addComponent(jlImporteSinIvaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jpModificarLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jlFechaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlCtdResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDescProductoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jlIvaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFechaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jbtModificar)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jtpModificar.addTab("", jpModificar);

        jtpFondo.addTab("Modificar", jtpModificar);

        jlNombre.setText("Fecha:");

        jtfFechaAltaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaAltaPedidoActionPerformed(evt);
            }
        });
        jtfFechaAltaPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfFechaAltaPedidoKeyPressed(evt);
            }
        });

        jlDireccion.setText("Cantidad:");

        jlPoblacion.setText("Nombre Producto:");

        jbAltaPedido.setText("Aceptar");
        jbAltaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAltaCineLayout = new javax.swing.GroupLayout(jpAltaCine);
        jpAltaCine.setLayout(jpAltaCineLayout);
        jpAltaCineLayout.setHorizontalGroup(
            jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaCineLayout.createSequentialGroup()
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaCineLayout.createSequentialGroup()
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFechaAltaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbAltaPedido)
                        .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpAltaCineLayout.createSequentialGroup()
                                .addComponent(jlPoblacion, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNombreAltaProductoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpAltaCineLayout.createSequentialGroup()
                                .addComponent(jlDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCantidadAltaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jpAltaCineLayout.setVerticalGroup(
            jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaCineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFechaAltaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCantidadAltaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreAltaProductoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jbAltaPedido)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jtpAltaCine.addTab("", jpAltaCine);

        jtpFondo.addTab("Alta", jtpAltaCine);

        jlCifCineEliminar.setText("Ingrese el ID del pedido que desee eliminar:");

        jlCineAEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCineAEliminar.setText("Va a eliminar el siguiente pedido:");

        jbAceptaridEliminar.setText("Aceptar");
        jbAceptaridEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptaridEliminarActionPerformed(evt);
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
                        .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfIdPedidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAceptaridEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                        .addComponent(jlFechaPedidoAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlImportotalSinIvaAELiminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlImporteTotalConIvaAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlDescripcionAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlNombreProductEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCtdtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirmarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jpFondoEliminarLayout.setVerticalGroup(
            jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCifCineEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondoEliminarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAceptaridEliminar)
                            .addComponent(jtfIdPedidoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jlCineAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcionAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlFechaPedidoAEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(jlImportotalSinIvaAELiminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlImporteTotalConIvaAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreProductEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCtdtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jbConfirmarEliminar)
                .addContainerGap(183, Short.MAX_VALUE))
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

    private void jbAceptarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarConsultaActionPerformed
        listarPedidos();
    }//GEN-LAST:event_jbAceptarConsultaActionPerformed

    private void jtpConsultaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtpConsultaStateChanged

    }//GEN-LAST:event_jtpConsultaStateChanged

    private void jtpConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtpConsultaFocusLost

    }//GEN-LAST:event_jtpConsultaFocusLost

    private void jtfFechaAltaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaAltaPedidoActionPerformed
//        if (jtfNombreNuevo.getText().compareToIgnoreCase("") != 0) {
//            contadorModificadosAlta++;
//        } else {
//            if (contadorModificadosAlta == 1) {
//                contadorModificadosAlta--;
//            }
//        }
    }//GEN-LAST:event_jtfFechaAltaPedidoActionPerformed

    private void jtfFechaAltaPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFechaAltaPedidoKeyPressed

    }//GEN-LAST:event_jtfFechaAltaPedidoKeyPressed

    private void jbAltaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaPedidoActionPerformed
        ingresarPedido();
    }//GEN-LAST:event_jbAltaPedidoActionPerformed

    private void jbAceptaridEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptaridEliminarActionPerformed
        cargarCineEliminar();
    }//GEN-LAST:event_jbAceptaridEliminarActionPerformed

    private void jbConfirmarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarEliminarActionPerformed
        // eliminarCine();
    }//GEN-LAST:event_jbConfirmarEliminarActionPerformed

    private void jtpFondoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtpFondoStateChanged

    }//GEN-LAST:event_jtpFondoStateChanged

    private void jbtBuscarPedidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarPedidoModificarActionPerformed
        cargarPedidoModificar();
    }//GEN-LAST:event_jbtBuscarPedidoModificarActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        actualizarPedido();
    }//GEN-LAST:event_jbtModificarActionPerformed

    public void listarPedidos() {
        String idBuscador = jtfIdConsulta.getText();

        if (idBuscador.trim().equals("")) {
            try {
                alCabeceraPedido = pp.listarCabeceraPedidos();
                alCuerpoPedido = pp.listarCuerpoPedidos();
                dtm.setRowCount(alCabeceraPedido.size());
                for (int i = 0; i < alCabeceraPedido.size(); i++) {
                    producto = pp.buscarProductoPorId(alCuerpoPedido.get(i).getId_producto());
                    jtaConsulta.setValueAt(alCabeceraPedido.get(i).getFecha_pedido(), i, 0);
                    jtaConsulta.setValueAt(alCabeceraPedido.get(i).getImporte_total_sin_iva(), i, 1);
                    jtaConsulta.setValueAt(alCabeceraPedido.get(i).getIVA(), i, 2);
                    jtaConsulta.setValueAt(alCabeceraPedido.get(i).getImporte_total_con_iva(), i, 3);
                    jtaConsulta.setValueAt(producto.getNombre_producto(), i, 4);
                    jtaConsulta.setValueAt(producto.getDesc_producto(), i, 5);
                    jtaConsulta.setValueAt(alCuerpoPedido.get(i).getCantidad(), i, 6);

                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA APLICACIÓN");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "NO SE HAN PODIDO CARGAR LOS PEDIDOS");
            }

        } else {
            try {
                int id = Integer.parseInt(idBuscador);
                cabeceraPedido = pp.buscarCabeceraPedido(id);
                cuerpoPedido = pp.buscarCuerpoPedido(cabeceraPedido.getId_cabecera_pedido());
                producto = pp.buscarProductoPorId(cuerpoPedido.getId_producto());
                dtm.setRowCount(1);
                jtaConsulta.setValueAt(cabeceraPedido.getFecha_pedido(), 0, 0);
                jtaConsulta.setValueAt(cabeceraPedido.getImporte_total_sin_iva(), 0, 1);
                jtaConsulta.setValueAt(cabeceraPedido.getIVA(), 0, 2);
                jtaConsulta.setValueAt(cabeceraPedido.getImporte_total_con_iva(), 0, 3);
                jtaConsulta.setValueAt(producto.getNombre_producto(), 0, 4);
                jtaConsulta.setValueAt(producto.getDesc_producto(), 0, 5);
                jtaConsulta.setValueAt(cuerpoPedido.getCantidad(), 0, 6);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA APLICACIÓN");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "NO SE HAN PODIDO CARGAR LOS PEDIDOS");
            }
        }
    }

    public void ingresarPedido() {
        try {

            DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            Date fechaInicio = (Date) format.parse(jtfFechaAltaPedido.getText());
            DateFormat dsf = new SimpleDateFormat("yyyy-mm-dd");
            String fechaPedido = dsf.format(fechaInicio);
            java.sql.Date fecha = java.sql.Date.valueOf(fechaPedido);

            System.out.println("fecha" + fecha + "  " + fechaInicio);
            System.out.println(jtfFechaAltaPedido.getText());

            String nompreProducto = jtfNombreAltaProductoPedido.getText();
            int id = pp.buscarProductoPorNombre(nompreProducto);
            producto = pp.buscarProductoPorId(id);
            int ctd = Integer.parseInt(jtfCantidadAltaPedido.getText());
            Float importeSinIva = producto.getPrecio_producto();

            Float importeConIva = (importeSinIva * iva) * ctd;

            cabeceraPedido = new CabeceraPedido(fecha, importeSinIva, iva, importeConIva);
            pp.ingresarCabeceraPedido(cabeceraPedido);
            int siguienteID = pp.buscarUltimoId();
            cabeceraPedido = pp.buscarCabeceraPedido(id);
            cuerpoPedido = new CuerpoPedido(producto.getDesc_producto(), ctd, producto.getId_producto(), siguienteID);
            pp.ingresarCuerpoPedido(cuerpoPedido);
            JOptionPane.showMessageDialog(null, "PEDIDO INGRESADO CON ÉXITO.");

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "FORMATO DE FECHA INCORRECTO \n EJEMPLO: 2017-12-31");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO INGRESAR EL PEDIDO cabecera" + ex);
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA APLICACIÓN" + ex);
        }
    }

    public void cargarPedidoModificar() {
        String idBuscador = jtfIdBuscador.getText();

        if (idBuscador.compareToIgnoreCase("") == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido.");
        } else {
            try {

                cabeceraPedido = pp.buscarCabeceraPedido(Integer.parseInt(idBuscador));
                cuerpoPedido = pp.buscarCuerpoPedido(cabeceraPedido.getId_cabecera_pedido());

                jlFechaResultado.setText(String.valueOf(cabeceraPedido.getFecha_pedido()));
                jlIvaResultado.setText(String.valueOf(cabeceraPedido.getIVA()));
                jlImporteSinIvaResultado.setText(String.valueOf(cabeceraPedido.getImporte_total_sin_iva()));
                jlimporteConIvaResultado.setText(String.valueOf(cabeceraPedido.getImporte_total_con_iva()));
                jlDescProductoResultado.setText(cuerpoPedido.getDescrip_producto());
                jlCtdResultado.setText(String.valueOf(cuerpoPedido.getCantidad()));

                jtfFechaModificar.setText(String.valueOf(cabeceraPedido.getFecha_pedido()));
                jbtModificar.setEnabled(true);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido cargar el empleado solicitado.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        }
    }

    public void actualizarPedido() {
        String idBuscador = jtfIdBuscador.getText();

        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date fechaInicio;
        try {
            fechaInicio = (Date) format.parse(jtfFechaModificar.getText());
            DateFormat dsf = new SimpleDateFormat("yyyy-mm-dd");
            String fechaPedido = dsf.format(fechaInicio);
            java.sql.Date fecha = java.sql.Date.valueOf(fechaPedido);

            cabeceraPedido = new CabeceraPedido(fecha);
            pp.actualizarCabeceraPedido(cabeceraPedido, Integer.parseInt(idBuscador));

            JOptionPane.showMessageDialog(null, "PEDIDO ACTUALIZADO CON ÉXITO");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "FORMATO DE FECHA INCORRECTO \n EJEMPLO: 2017-12-31");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido cargar el empleado solicitado.\nPruebe de nuevo.");
        }

    }

    public void cargarCineEliminar(){
        String idBusca = jtfIdPedidoEliminar.getText();

        if (idBusca.compareToIgnoreCase("") == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un CIF válido.");
        } else {
            try {
                cabeceraPedido = pp.buscarCabeceraPedido(Integer.parseInt(idBusca));
                cuerpoPedido = pp.buscarCuerpoPedido(cabeceraPedido.getId_cabecera_pedido());
                jlFechaPedidoAEliminar.setText(String.valueOf(cabeceraPedido.getFecha_pedido()));
                jlImportotalSinIvaAELiminar.setText(String.valueOf(cabeceraPedido.getImporte_total_sin_iva()));
                jlImporteTotalConIvaAEliminar.setText(String.valueOf(cabeceraPedido.getImporte_total_con_iva()));
                jlCtdtEliminar.setText(String.valueOf(cuerpoPedido.getCantidad()));
                jlDescripcionAEliminar.setText(cuerpoPedido.getDescrip_producto());
                producto = pp.buscarProductoPorId(cuerpoPedido.getId_producto());
                
                jlNombreProductEliminar.setText(producto.getNombre_producto());
                jbConfirmarEliminar.setEnabled(true);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la aplicación.\nNo se ha podido consultar el cine solicitado.\nPruebe de nuevo.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión con la BD.\nPruebe de nuevo.");
            }
        }
    }
    
    public void eliminarPedido(){
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptarConsulta;
    private javax.swing.JButton jbAceptaridEliminar;
    private javax.swing.JButton jbAltaPedido;
    private javax.swing.JButton jbConfirmarEliminar;
    private javax.swing.JButton jbtBuscarPedidoModificar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlCifBuscador;
    private javax.swing.JLabel jlCifCineEliminar;
    private javax.swing.JLabel jlCifConsulta;
    private javax.swing.JLabel jlCineAEliminar;
    private javax.swing.JLabel jlCodigoPostalActual;
    private javax.swing.JLabel jlCtd;
    private javax.swing.JLabel jlCtdResultado;
    private javax.swing.JLabel jlCtdtEliminar;
    private javax.swing.JLabel jlDescProductoResultado;
    private javax.swing.JLabel jlDescripcionAEliminar;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDireccionActual;
    private javax.swing.JLabel jlFechaPedidoAEliminar;
    private javax.swing.JLabel jlFechaResultado;
    private javax.swing.JLabel jlImporteSinIvaResultado;
    private javax.swing.JLabel jlImporteTotalConIvaAEliminar;
    private javax.swing.JLabel jlImportotalSinIvaAELiminar;
    private javax.swing.JLabel jlIva;
    private javax.swing.JLabel jlIvaResultado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreActual;
    private javax.swing.JLabel jlNombreCine;
    private javax.swing.JLabel jlNombreProductEliminar;
    private javax.swing.JLabel jlPoblacion;
    private javax.swing.JLabel jlPoblacionActual;
    private javax.swing.JLabel jlimporteConIvaResultado;
    private javax.swing.JPanel jpAltaCine;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpFondoEliminar;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JTable jtaConsulta;
    private javax.swing.JTextField jtfCantidadAltaPedido;
    private javax.swing.JTextField jtfFechaAltaPedido;
    private javax.swing.JTextField jtfFechaModificar;
    private javax.swing.JTextField jtfIdBuscador;
    private javax.swing.JTextField jtfIdConsulta;
    private javax.swing.JTextField jtfIdPedidoEliminar;
    private javax.swing.JTextField jtfNombreAltaProductoPedido;
    private javax.swing.JTabbedPane jtpAltaCine;
    private javax.swing.JTabbedPane jtpConsulta;
    private javax.swing.JTabbedPane jtpEliminar;
    private javax.swing.JTabbedPane jtpFondo;
    private javax.swing.JTabbedPane jtpModificar;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
