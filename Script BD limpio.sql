/* NOTA: todos los campos foreign key que están comentados son para tener en cuenta las relaciones que tendrán las tablas. Las restricciones se añadirán posteriormente en phpMyAdmin. */

create  table Cliente (
    id_cliente int primary key auto_increment, /* Tiene que ser autoincremental. */
    dni_cli varchar(9),
    nombre_cli varchar(20),
    apellidos_cli varchar(30),
    telefono_cli int,
    cp int,
    puntos int,
    usuario varchar(30),
    contraseña varchar(30)
);

create table Cabecera_factura_cliente (
    id_cab_factura_cli int primary key auto_increment, /* Tiene que ser autoincremental. */
    fecha_factura date,
    importe decimal,
    iva int, /* Será una constante en la aplicación de escritorio. */
    importe_total_con_iva decimal
    /* Clave foránea: id_cliente int foreign key references Cliente (id_cliente) */
);

create table Cuerpo_factura_cliente (
    id_cuerpo_factura_cli int primary key auto_increment, /* Tiene que ser autoincremental. */
    /* Clave foránea: id_factura int foreign key references Cabecera_factura_cliente (id_cab_factura_cli) */
    /* Clave foránea: id_producto int foreign key references Producto(id_producto) */
    ctd int
 );

 create table Entrada (
     id_entrada int  primary key auto_increment, /* Tiene que ser autoincremental. */
     precio_entrada decimal
     /* Clave foránea: id_pelicula int foreign key references Pelicula(id_pelicula) */
 );

 create table Sala (
     id_sala int primary key,
     nombre_sala varchar(20),
     numero_butacas int
     /* Clave foránea: id_cine int foreign key references Cine(id_cine) */
 );

 create table Cine (
     id_cine int primary key,
     nombre_cine varchar(30),
     cif_cine varchar(9),
     direccion_cine varchar(50),
     poblacion_cine varchar(30),
     cp int
 );

 create table Butaca (
     id_butaca int primary key,
     /* Clave foránea: id_sala int foreign key references Sala(id_sala) */
     numero_fila int
);

create table Sesion (
    id_sesion int primary key,
    hora_sesion date
    /* Clave foránea: id_pelicula int foreign key references Pelicula(id_pelicula) */
    /* Clave foránea: id_sala int foreign key references Sala(id_sala) */
);

create table Pelicula (
    id_pelicula int primary key auto_increment, /* Tiene que ser autoincremental. */
    nombre_pelicula varchar(50),
    duracion_pelicula int,
    edad_acceso int
);

create table Empleado (
    id_empleado int primary key auto_increment, /* Tiene que ser autoincremental. */
    dni_emp varchar(9),
    nombre_emp varchar(20),
    apellidos_emp varchar(30),
    telefono_emp int,
    fecha_inicio_emp date,
    cargo_emp varchar(30),
    id_cine int
);

create table Cabecera_pedido (
    id_cab_pedido int primary key auto_increment, /* Tiene que ser autoincremental. */
    fecha_pedido date,
    importe_total_sin_iva decimal,
    iva int,
    importe_total_con_iva decimal
);

create table Cuerpo_pedido (
    id_cuerpo_pedido int primary key,
    id_producto int,
    descrip_producto varchar,
    cantidad int
);

create table Producto (
    id_producto int primary key, 
    descripcion_producto varchar,
    precio_producto decimal,
    precio_venta decimal,
    nombre_producto varchar
);

create table Proveedor (
    id_proveedor int primary key,
    cif_proveedor varchar,
    nombre_proveedor varchar,
    apellidos_proveedor varchar,
    telefono_proveedor int,
    poblacion_proveedor varchar,
    cp_proveedor int
);

create table Administrador (
    id_admin int primary key,
    dni_admin varchar,
    nombre_admin varchar,
    apellidos_admin varchar,
    telefono_admin int,
    fecha_inicio_admin date,
    cargo_admin varchar,
    id_cine int
)

create table Reserva (
    id_reserva int primary key auto_increment,
    id_pelicula int, 
    id_sesion int,
    id_butaca int,
    id_cliente int,
    id_sala int
)