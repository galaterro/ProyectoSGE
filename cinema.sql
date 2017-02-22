-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 22-02-2017 a las 15:13:13
-- Versión del servidor: 5.7.17-0ubuntu0.16.04.1
-- Versión de PHP: 7.0.13-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `usuario_admin` varchar(15) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `contraseña_admin` varchar(15) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `id_admin` int(11) NOT NULL,
  `dni_admin` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `nombre_admin` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `apellidos_admin` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `telefono_admin` int(11) DEFAULT NULL,
  `fecha_inicio_admin` date DEFAULT NULL,
  `cargo_admin` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `id_cine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `butaca`
--

CREATE TABLE `butaca` (
  `id_butaca` int(11) NOT NULL,
  `numero_fila` int(11) DEFAULT NULL,
  `id_sala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `butaca`
--

INSERT INTO `butaca` (`id_butaca`, `numero_fila`, `id_sala`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cabecera_factura_cliente`
--

CREATE TABLE `cabecera_factura_cliente` (
  `id_cab_factura_cli` int(11) NOT NULL,
  `fecha_factura` date DEFAULT NULL,
  `importe` decimal(10,0) DEFAULT NULL,
  `iva` int(11) DEFAULT NULL,
  `importe_total_con_iva` decimal(10,0) DEFAULT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cabecera_pedido`
--

CREATE TABLE `cabecera_pedido` (
  `id_cab_pedido` int(11) NOT NULL,
  `fecha_pedido` date DEFAULT NULL,
  `importe_total_sin_iva` decimal(10,0) DEFAULT NULL,
  `iva` int(11) DEFAULT NULL,
  `importe_total_con_iva` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cine`
--

CREATE TABLE `cine` (
  `id_cine` int(11) NOT NULL,
  `nombre_cine` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `cif_cine` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `direccion_cine` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `poblacion_cine` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `cp_cine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `cine`
--

INSERT INTO `cine` (`id_cine`, `nombre_cine`, `cif_cine`, `direccion_cine`, `poblacion_cine`, `cp_cine`) VALUES
(1, 'cine1', '48599624', 'calle falsa 123', 'alcorcon', 28922),
(2, 'cine YUJUUU', '123456', 'calle pollas', 'madrid', 28450),
(3, 'cine dos', '123444', 'calle dos', 'madrid', 18452),
(4, 'cine records', '123456789', 'calle records', 'Madrid', 28045),
(5, 'Cine Aztec', '456789', 'Calle de la Luna, 27', 'Alcorcón', 28923),
(6, 'alguno', '123', 'alguna muy lejana', 'lejos de verdad', 28923);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `dni_cli` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `nombre_cli` varchar(20) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `apellidos_cli` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `telefono_cli` int(11) DEFAULT NULL,
  `cp` int(11) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `usuario` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `password` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni_cli`, `nombre_cli`, `apellidos_cli`, `telefono_cli`, `cp`, `puntos`, `usuario`, `password`) VALUES
(1, '46456453P', 'Natalio', 'McAddams', 689656257, 28939, 100, 'natmac01', 'pene');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuerpo_factura_cliente`
--

CREATE TABLE `cuerpo_factura_cliente` (
  `id_cuerpo_factura_cli` int(11) NOT NULL,
  `ctd` int(11) DEFAULT NULL,
  `id_factura` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuerpo_pedido`
--

CREATE TABLE `cuerpo_pedido` (
  `id_cuerpo_pedido` int(11) NOT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `descrip_producto` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `dni_emp` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `nombre_emp` varchar(20) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `apellidos_emp` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `telefono_emp` int(11) DEFAULT NULL,
  `fecha_inicio_emp` date DEFAULT NULL,
  `cargo_emp` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `Usuario_empleado` varchar(20) COLLATE utf16_spanish2_ci NOT NULL,
  `Contraseña_empleado` varchar(20) COLLATE utf16_spanish2_ci NOT NULL,
  `id_cine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE `entrada` (
  `id_entrada` int(11) NOT NULL,
  `precio_entrada` double(6,2) DEFAULT NULL,
  `id_pelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `id_pelicula` int(11) NOT NULL,
  `id_sala` int(11) NOT NULL,
  `nombre_pelicula` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `duracion_pelicula` int(11) DEFAULT NULL,
  `edad_acceso` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`id_pelicula`, `id_sala`, `nombre_pelicula`, `duracion_pelicula`, `edad_acceso`) VALUES
(6, 1, 'pelicula caca', 150, 18),
(7, 2, 'pelicula caca 2', 180, 18),
(8, 3, 'pelicula caca 3', 100, 14),
(9, 4, 'pelicula caca 4', 100, 18),
(11, 1, 'pelicula de mierda', 182, 21);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `descripcion_producto` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `precio_producto` decimal(10,0) DEFAULT NULL,
  `precio_venta` decimal(10,0) DEFAULT NULL,
  `nombre_producto` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `cif_proveedor` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `nombre_proveedor` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `apellidos_proveedor` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `telefono_proveedor` int(11) DEFAULT NULL,
  `poblacion_proveedor` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `cp_proveedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `cif_proveedor`, `nombre_proveedor`, `apellidos_proveedor`, `telefono_proveedor`, `poblacion_proveedor`, `cp_proveedor`) VALUES
(1, '123', 'nombre', 'apellido', 123456, 'Madrid', 28500),
(2, 'cif1', 'proveedor', 'uno', 1234567897, 'Madrid', 28500),
(3, '12344', 'Tipo', 'Puesto', 5487, 'Madrid', 28500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor-cine`
--

CREATE TABLE `proveedor-cine` (
  `id_proveedor` int(11) NOT NULL,
  `id_cine` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `id_pelicula` int(11) DEFAULT NULL,
  `id_sesion` int(11) DEFAULT NULL,
  `id_butaca` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_sala` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `id_sala` int(11) NOT NULL,
  `nombre_sala` varchar(20) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `numero_butacas` int(11) DEFAULT NULL,
  `id_cine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`id_sala`, `nombre_sala`, `numero_butacas`, `id_cine`) VALUES
(1, 'saca caca', 100, 1),
(2, 'sala caca 2', 150, 1),
(3, 'sala caca 3', 200, 1),
(4, 'sala caca 4', 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesion`
--

CREATE TABLE `sesion` (
  `id_sesion` int(11) NOT NULL,
  `hora_sesion` date DEFAULT NULL,
  `id_pelicula` int(11) NOT NULL,
  `id_sala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Volcado de datos para la tabla `sesion`
--

INSERT INTO `sesion` (`id_sesion`, `hora_sesion`, `id_pelicula`, `id_sala`) VALUES
(1, '2015-04-14', 6, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_admin`),
  ADD KEY `administrador_cine_id_cine_fk` (`id_cine`);

--
-- Indices de la tabla `butaca`
--
ALTER TABLE `butaca`
  ADD PRIMARY KEY (`id_butaca`),
  ADD KEY `id_sala` (`id_sala`);

--
-- Indices de la tabla `cabecera_factura_cliente`
--
ALTER TABLE `cabecera_factura_cliente`
  ADD PRIMARY KEY (`id_cab_factura_cli`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `cabecera_pedido`
--
ALTER TABLE `cabecera_pedido`
  ADD PRIMARY KEY (`id_cab_pedido`);

--
-- Indices de la tabla `cine`
--
ALTER TABLE `cine`
  ADD PRIMARY KEY (`id_cine`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `cuerpo_factura_cliente`
--
ALTER TABLE `cuerpo_factura_cliente`
  ADD PRIMARY KEY (`id_cuerpo_factura_cli`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `cuerpo_pedido`
--
ALTER TABLE `cuerpo_pedido`
  ADD PRIMARY KEY (`id_cuerpo_pedido`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`),
  ADD KEY `empleado_cine_id_cine_fk` (`id_cine`);

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`id_entrada`),
  ADD KEY `id_pelicula` (`id_pelicula`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`id_pelicula`),
  ADD KEY `id_sala` (`id_sala`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- Indices de la tabla `proveedor-cine`
--
ALTER TABLE `proveedor-cine`
  ADD PRIMARY KEY (`id_proveedor`,`id_cine`),
  ADD KEY `id_proveedor` (`id_proveedor`),
  ADD KEY `proveedor-cine_cine_id_cine_fk` (`id_cine`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_sala` (`id_sala`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_butaca` (`id_butaca`),
  ADD KEY `id_sesion` (`id_sesion`),
  ADD KEY `id_pelicula` (`id_pelicula`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`id_sala`),
  ADD KEY `sala_cine_id_cine_fk` (`id_cine`);

--
-- Indices de la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD PRIMARY KEY (`id_sesion`),
  ADD KEY `id_pelicula` (`id_pelicula`),
  ADD KEY `id_sala` (`id_sala`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cabecera_factura_cliente`
--
ALTER TABLE `cabecera_factura_cliente`
  MODIFY `id_cab_factura_cli` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cabecera_pedido`
--
ALTER TABLE `cabecera_pedido`
  MODIFY `id_cab_pedido` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cine`
--
ALTER TABLE `cine`
  MODIFY `id_cine` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `cuerpo_factura_cliente`
--
ALTER TABLE `cuerpo_factura_cliente`
  MODIFY `id_cuerpo_factura_cli` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `id_entrada` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_cine_id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `butaca`
--
ALTER TABLE `butaca`
  ADD CONSTRAINT `sala_id_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id_sala`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cabecera_factura_cliente`
--
ALTER TABLE `cabecera_factura_cliente`
  ADD CONSTRAINT `id_cliente_cabecera_fk` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cuerpo_factura_cliente`
--
ALTER TABLE `cuerpo_factura_cliente`
  ADD CONSTRAINT `Cuerpo_factura_cliente_ibfk_1` FOREIGN KEY (`id_cuerpo_factura_cli`) REFERENCES `cabecera_factura_cliente` (`id_cab_factura_cli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `producto_fk` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cuerpo_pedido`
--
ALTER TABLE `cuerpo_pedido`
  ADD CONSTRAINT `pedido_id_pedido_fk` FOREIGN KEY (`id_cuerpo_pedido`) REFERENCES `cabecera_pedido` (`id_cab_pedido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `producto_id_producto_fk` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_cine_id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `pelicula_id_foreifhaksdbgfsadfg` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD CONSTRAINT `id_sala_sala_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id_sala`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `proveedor-cine`
--
ALTER TABLE `proveedor-cine`
  ADD CONSTRAINT `id_proveedor_cine_pk` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `proveedor-cine_cine_id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `butaca_id_butaca_fk` FOREIGN KEY (`id_butaca`) REFERENCES `butaca` (`id_butaca`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cliente_id_cliente_fk` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pelicula_id_pelicula_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sala_id_sala_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id_sala`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sesion_id_sesion_fk` FOREIGN KEY (`id_sesion`) REFERENCES `sesion` (`id_sesion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `sala`
--
ALTER TABLE `sala`
  ADD CONSTRAINT `sala_cine_id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD CONSTRAINT `id_pelicula_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_sala_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id_sala`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
