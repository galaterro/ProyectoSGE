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