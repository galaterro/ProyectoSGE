
create  table Cliente(

    id_cliente number Constraint pk_cli_idc primary key, /**TIENE QUE SER AUTOINCREMENTAL**/
    dni varchar2(9),
    nombre varchar2(20),
    apellidos varchar2(30),
    telefono number(9),
    cp number(5),
    puntos number(6),
    usuario varchar2(30),
    contraseña varchar2(30)
);


create table Cabecera_factura_cliente(
    id_factura_cli number Constraint pk_cabFac_idf primary key, /**TIENE QUE SER AUTOINCREMENTAL**/
    fecha_factura Date,
    importe decimal,
    iva number, /**Constante Final**/
    importe_total_con_iva decimal,
    id_cliente number Constraint fk_cli_idCli foreign key references Cliente (id_cliente)
);

create table Cuerpo_factura_cliente(
    id_cuerpo_factura_cli number Constraint pk_cuerpFactCli_idCuerpo  primary key, /**TIENE QUE SER AUTOINCREMENTAL**/
    id_factura number Constraint fk_cabFac_idf foreign key references Cabecera_factura_cliente (id_factura_cli),
    id_producto number Constraint fk_prod_idProd foreign key references Producto(id_producto),
    ctd number
 );