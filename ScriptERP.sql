
create  table Cliente(

    id_cliente int   primary key auto_increment , /**TIENE QUE SER AUTOINCREMENTAL**/
    dni varchar(9),
    nombre varchar(20),
    apellidos varchar(30),
    telefono int,
    cp int,
    puntos int,
    usuario varchar(30),
    contraseña varchar(30)
);


create table Cabecera_factura_cliente(
    id_factura_cli int   primary key auto_increment, /**TIENE QUE SER AUTOINCREMENTAL**/
    fecha_factura Date,
    importe decimal,
    iva int, /**Constante Final**/
    importe_total_con_iva decimal,
    id_cliente int,  /** foreign key references Cliente (id_cliente)**/
);

create table Cuerpo_factura_cliente(
    id_cuerpo_factura_cli int    primary key auto_increment, /**TIENE QUE SER AUTOINCREMENTAL**/
    id_factura int,   /**foreign key references Cabecera_factura_cliente (id_factura_cli),**/
    id_producto int,   /**foreign key references Producto(id_producto),**/
    ctd int,
 );


 create table Entrada(
     id_entrada int  primary key auto_increment,/**TIENE QUE SER AUTOINCREMENTAL**/
     precio decimal,
     id_pelicula int, /**foreign key references Pelicula **/
 );

 create table Sala(
     id_sala int primary key,
     nombre_sala varchar(20),
     numero_butacas int,
     id_cine int /**foreign key cine**/
 );

 create table Butaca(
     id_butaca int primary key,
     id_sala int, /**foreign key sala**/
     numero_fila int
);

create table Sesion(
    id_sesion int primary key,
    hora date,
    id_pelicula int, /**Foreign key pelicula**/
    id_sala int, /**foreingn key sala**/
);

create table Pelicula(
    id_pelicula int primary key auto_increment,
    nombre_pelicula varchar(50),
    duracion int,
    edad_acceso int
);

 create table empleado(
     id_empleado  int  primary key auto_increment,
     dni varchar(9),
     nombre varchar(20),
     apellidos varchar(30),
     telefono int,
     fecha_inicio date,
     cargo varchar(30),
     id_cine int
 );

 create table cabecera_pedido (
   id_pedido             INT PRIMARY KEY AUTO_INCREMENT,
   fecha_pedido          DATE ,
   importe_total_sin_iva DECIMAL,
   iva                   INT,
   importe_total_con_iva DECIMAL
 );

 create table cuerpo_pedido (
   id_pedido        INT,
   id_producto      INT,
   descrip_producto VARCHAR,
   cantidad         INT
 );

 create table Producto (
   id_producto     INT PRIMARY KEY,
   descripcion     VARCHAR,
   precio_producto DECIMAL,
   precio_venta    DECIMAL,
   nombre_producto VARCHAR
 );

CREATE TABLE  proveedor(
  id_proveedor INT PRIMARY KEY AUTO_INCREMENT,
  cif VARCHAR,
  nombre VARCHAR,
  apellidos VARCHAR,
  telefono INT,
  poblacion VARCHAR,
  cp INT
);

CREATE TABLE admin(
  id_admin INT PRIMARY KEY AUTO_INCREMENT,
  dni VARCHAR,
  nombre VARCHAR,
  apellidos VARCHAR,
  telefono INT,
  fecha_inicio DATETIME,
  cargo varchar,
  id_cine int
)

CREATE TABLE reserva(
    id_reserva INT primary key auto_increment,
    id_pelicula INT, 
    id_sesion: INT,
    id_butaca: INT,
    id_cliente INT,
    id_sala INT
)

