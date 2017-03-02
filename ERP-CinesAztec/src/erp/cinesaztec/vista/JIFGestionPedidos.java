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
        vPedidos.add("fecha:");
        vPedidos.add("IVA:");
        vPedidos.add("Importe SIN/IVA:");
        vPedidos.add("Importe IVA/INC.:");
        vPedidos.add("Producto:");
        vPedidos.add("Descripcion Producto:");
        vPedidos.add("CTD:");

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
        jlCifCine = new javax.swing.JLabel();
        jlCifBuscador = new javax.swing.JLabel();
        jlDireccionCine = new javax.swing.JLabel();
        jlPoblacionCine = new javax.swing.JLabel();
        jlCodigoPostal = new javax.swing.JLabel();
        jtfIdBuscador = new javax.swing.JTextField();
        jtfNombreCine = new javax.swing.JTextField();
        jtfCIfCine = new javax.swing.JTextField();
        jtfDireccionCine = new javax.swing.JTextField();
        jtfPoblacionCine = new javax.swing.JTextField();
        jtfCodigoPostal = new javax.swing.JTextField();
        jbtModificar = new javax.swing.JButton();
        jbtBuscarPedidoModificar = new javax.swing.JButton();
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
        jtfFechaAltaPedido = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfCantidadAltaPedido = new javax.swing.JTextField();
        jlPoblacion = new javax.swing.JLabel();
        jtfNombreAltaProductoPedido = new javax.swing.JTextField();
        jbAltaPedido = new javax.swing.JButton();
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

        jlNombreCine.setText("Nombre:");

        jlCifCine.setText("CIF:");

        jlCifBuscador.setText("Ingrese el id del pedido que desea modificar:");

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

        jbtBuscarPedidoModificar.setText("Buscar");
        jbtBuscarPedidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarPedidoModificarActionPerformed(evt);
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
                        .addComponent(jtfIdBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtBuscarPedidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
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
                .addContainerGap(194, Short.MAX_VALUE))
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

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        //modificarCine();
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jbtBuscarPedidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarPedidoModificarActionPerformed
        // cargarCineModificar();
    }//GEN-LAST:event_jbtBuscarPedidoModificarActionPerformed

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

    private void jbAceptarCifEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarCifEliminarActionPerformed
        // cargarCineEliminar();
    }//GEN-LAST:event_jbAceptarCifEliminarActionPerformed

    private void jbConfirmarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarEliminarActionPerformed
        // eliminarCine();
    }//GEN-LAST:event_jbConfirmarEliminarActionPerformed

    private void jtpFondoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtpFondoStateChanged

    }//GEN-LAST:event_jtpFondoStateChanged

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
            Date fechaInicio = (Date)format.parse(jtfFechaAltaPedido.getText());
            DateFormat dsf = new SimpleDateFormat("yyyy-mm-dd");
            String fechaPedido = dsf.format(fechaInicio);
            java.sql.Date fecha = java.sql.Date.valueOf(fechaPedido);
            
            System.out.println("fecha"+ fecha+"  "+fechaInicio);
            System.out.println(jtfFechaAltaPedido.getText());
            
            String nompreProducto = jtfNombreAltaProductoPedido.getText();
            int id = pp.buscarProductoPorNombre(nompreProducto);
            producto = pp.buscarProductoPorId(id);         
            int ctd = Integer.parseInt(jtfCantidadAltaPedido.getText());
            Float importeSinIva = producto.getPrecio_producto();
            
            Float importeConIva = (importeSinIva * iva)*ctd;
            
            cabeceraPedido = new CabeceraPedido(fecha, importeSinIva, iva, importeConIva);
            pp.ingresarCabeceraPedido(cabeceraPedido);
            int siguienteID = pp.buscarUltimoId();
            cabeceraPedido = pp.buscarCabeceraPedido(id);
            cuerpoPedido = new CuerpoPedido(producto.getDesc_producto(), ctd, producto.getId_producto(),siguienteID);
            pp.ingresarCuerpoPedido(cuerpoPedido);
            JOptionPane.showMessageDialog(null, "PEDIDO INGRESADO CON ÉXITO.");
        
       
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "FORMATO DE FECHA INCORRECTO \n EJEMPLO: 2017-12-31");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO INGRESAR EL PEDIDO cabecera"+ex);
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA APLICACIÓN"+ex);
        }
    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptarCifEliminar;
    private javax.swing.JButton jbAceptarConsulta;
    private javax.swing.JButton jbAltaPedido;
    private javax.swing.JButton jbConfirmarEliminar;
    private javax.swing.JButton jbtBuscarPedidoModificar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlCifBuscador;
    private javax.swing.JLabel jlCifCine;
    private javax.swing.JLabel jlCifCineEliminar;
    private javax.swing.JLabel jlCifConsulta;
    private javax.swing.JLabel jlCineAEliminar;
    private javax.swing.JLabel jlCodPosCineAEliminar;
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
    private javax.swing.JTextField jtfCantidadAltaPedido;
    private javax.swing.JTextField jtfCifCineEliminar;
    private javax.swing.JTextField jtfCodigoPostal;
    private javax.swing.JTextField jtfDireccionCine;
    private javax.swing.JTextField jtfFechaAltaPedido;
    private javax.swing.JTextField jtfIdBuscador;
    private javax.swing.JTextField jtfIdConsulta;
    private javax.swing.JTextField jtfNombreAltaProductoPedido;
    private javax.swing.JTextField jtfNombreCine;
    private javax.swing.JTextField jtfPoblacionCine;
    private javax.swing.JTabbedPane jtpAltaCine;
    private javax.swing.JTabbedPane jtpConsulta;
    private javax.swing.JTabbedPane jtpEliminar;
    private javax.swing.JTabbedPane jtpFondo;
    private javax.swing.JTabbedPane jtpModificar;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
