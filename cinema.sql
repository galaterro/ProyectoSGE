-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 03, 2017 at 04:42 PM
-- Server version: 5.7.17-0ubuntu0.16.04.1
-- PHP Version: 7.0.15-0ubuntu0.16.04.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinema`
--

-- --------------------------------------------------------

--
-- Table structure for table `butaca`
--

CREATE TABLE `butaca` (
  `id_butaca` int(11) NOT NULL,
  `numero_fila` int(11) DEFAULT NULL,
  `numero_columna` int(11) DEFAULT NULL,
  `id_sala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `butaca`
--

INSERT INTO `butaca` (`id_butaca`, `numero_fila`, `numero_columna`, `id_sala`) VALUES
(3, 4, 5, 8),
(4, 5, 4, 8),
(5, 3, 2, 8),
(6, 1, 1, 8),
(7, 1, 2, 8),
(8, 1, 3, 8),
(9, 1, 4, 8),
(10, 1, 5, 8),
(11, 2, 1, 8),
(12, 2, 2, 8),
(13, 2, 3, 8),
(14, 2, 4, 8),
(15, 2, 5, 8);

-- --------------------------------------------------------

--
-- Table structure for table `cabecera_factura_cliente`
--

CREATE TABLE `cabecera_factura_cliente` (
  `id_cab_factura_cli` int(11) NOT NULL,
  `fecha_factura` date DEFAULT NULL,
  `importe` decimal(5,2) DEFAULT NULL,
  `iva` int(11) DEFAULT NULL,
  `importe_total_con_iva` decimal(5,2) DEFAULT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cabecera_pedido`
--

CREATE TABLE `cabecera_pedido` (
  `id_cab_pedido` int(11) NOT NULL,
  `fecha_pedido` date DEFAULT NULL,
  `importe_total_sin_iva` decimal(5,2) DEFAULT NULL,
  `iva` decimal(5,2) DEFAULT NULL,
  `importe_total_con_iva` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `cabecera_pedido`
--

INSERT INTO `cabecera_pedido` (`id_cab_pedido`, `fecha_pedido`, `importe_total_sin_iva`, `iva`, `importe_total_con_iva`) VALUES
(14, '2010-01-04', '0.80', '1.21', '4.84'),
(16, '2009-01-31', '0.80', '1.21', '11.62'),
(17, '2010-01-04', '0.80', '1.21', '19.36'),
(18, '2010-01-04', '0.80', '1.21', '27.10'),
(19, '2010-01-04', '0.80', '1.21', '1.94'),
(20, '2010-01-04', '0.80', '1.21', '24.20'),
(21, '2010-01-04', '0.80', '1.21', '11.62'),
(22, '2007-12-31', '0.80', '1.21', '4.84'),
(23, '2007-12-31', '0.80', '1.21', '4.84'),
(24, '2010-01-04', '0.80', '1.21', '4.84'),
(25, '2005-01-03', '0.80', '1.21', '7.74'),
(26, '2014-12-29', '0.80', '1.21', '7.74'),
(27, '2016-01-04', '0.80', '1.21', '7.74'),
(28, '2010-01-04', '0.80', '1.21', '4.84'),
(29, '2014-12-29', '0.80', '1.21', '9.68'),
(30, '2011-01-03', '0.80', '1.21', '9.68'),
(31, '2011-01-03', '0.80', '1.21', '9.68'),
(32, '1999-04-14', '0.80', '1.21', '4.84'),
(33, '2017-01-31', '0.80', '1.21', '4.84');

-- --------------------------------------------------------

--
-- Table structure for table `cine`
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
-- Dumping data for table `cine`
--

INSERT INTO `cine` (`id_cine`, `nombre_cine`, `cif_cine`, `direccion_cine`, `poblacion_cine`, `cp_cine`) VALUES
(10, 'cine mayo', '312458P', 'calle mayo', 'madrid', 28500),
(11, 'cine abril', '321654p', 'calle abril', 'alcorcon', 28922);

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
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
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni_cli`, `nombre_cli`, `apellidos_cli`, `telefono_cli`, `cp`, `puntos`, `usuario`, `password`) VALUES
(1, '46456453P', 'Natalio', 'McAddams', 689656257, 28939, 100, 'natmac01', 'pene'),
(2, '123132L', 'Ines', '', 6451245, 2922, 0, 'Ines', 'ciudadanos'),
(4, '123456L', 'Ya', 'Esta', 1234567, 28921, 1, 'roote', 'estocolmos');

-- --------------------------------------------------------

--
-- Table structure for table `cuerpo_factura_cliente`
--

CREATE TABLE `cuerpo_factura_cliente` (
  `id_cuerpo_factura_cli` int(11) NOT NULL,
  `ctd` int(11) DEFAULT NULL,
  `id_factura` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cuerpo_pedido`
--

CREATE TABLE `cuerpo_pedido` (
  `id_cuerpo_pedido` int(11) NOT NULL,
  `descrip_producto` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `id_producto` int(11) NOT NULL,
  `id_cabecera_pedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `cuerpo_pedido`
--

INSERT INTO `cuerpo_pedido` (`id_cuerpo_pedido`, `descrip_producto`, `cantidad`, `id_producto`, `id_cabecera_pedido`) VALUES
(12, 'refrescos caca', 5, 4, 14),
(14, 'refrescos varios', 12, 4, 16),
(15, 'refrescos varios', 20, 4, 17),
(16, 'refrescos varios', 28, 4, 18),
(17, 'refrescos varios', 2, 4, 19),
(18, 'refrescos varios', 25, 4, 20),
(19, 'refrescos varios', 12, 4, 21),
(20, 'refrescos varios', 5, 4, 22),
(21, 'refrescos varios', 5, 4, 23),
(22, 'refrescos varios', 5, 4, 24),
(23, 'refrescos varios', 8, 4, 25),
(24, 'refrescos varios', 8, 4, 26),
(25, 'refrescos varios', 8, 4, 27),
(26, 'refrescos varios', 5, 4, 28),
(27, 'refrescos varios', 10, 4, 29),
(28, 'refrescos varios', 10, 4, 30),
(29, 'refrescos varios', 10, 4, 31),
(30, 'refrescos varios', 5, 4, 32),
(31, 'refrescos varios', 5, 4, 33);

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `dni_emp` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `nombre_emp` varchar(20) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `apellidos_emp` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `telefono_emp` int(11) DEFAULT NULL,
  `fecha_inicio_emp` date DEFAULT NULL,
  `cargo_emp` varchar(30) COLLATE utf16_spanish2_ci NOT NULL,
  `usuario_empleado` varchar(20) COLLATE utf16_spanish2_ci NOT NULL,
  `contrasena_empleado` varchar(20) COLLATE utf16_spanish2_ci NOT NULL,
  `id_cineEmp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `dni_emp`, `nombre_emp`, `apellidos_emp`, `telefono_emp`, `fecha_inicio_emp`, `cargo_emp`, `usuario_empleado`, `contrasena_empleado`, `id_cineEmp`) VALUES
(15, '2545252L', 'José', 'Fernandez', 912256352, '2008-12-29', 'Administrador', 'pepe', 'pepe', 10),
(16, '5112545J', 'nicanor', 'parra', 654321654, '2008-12-29', 'administrador', 'nica', 'nica', 10),
(20, '5555522L', 'adrian', 'perez', 654654654, '2010-01-02', 'empleado', 'caca', 'caca', 10);

-- --------------------------------------------------------

--
-- Table structure for table `entrada`
--

CREATE TABLE `entrada` (
  `id_entrada` int(11) NOT NULL,
  `precio_entrada` decimal(5,2) DEFAULT NULL,
  `id_pelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pelicula`
--

CREATE TABLE `pelicula` (
  `id_pelicula` int(11) NOT NULL,
  `nombre_pelicula` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `duracion_pelicula` int(11) DEFAULT NULL,
  `edad_acceso` int(11) DEFAULT NULL,
  `id_sala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `pelicula`
--

INSERT INTO `pelicula` (`id_pelicula`, `nombre_pelicula`, `duracion_pelicula`, `edad_acceso`, `id_sala`) VALUES
(1, 'Terminator 5', 180, 69, 8),
(5, 'The warriors', 97, 18, 8);

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `descripcion_producto` varchar(50) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `precio_producto` decimal(5,2) DEFAULT NULL,
  `precio_venta` decimal(5,2) DEFAULT NULL,
  `nombre_producto` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`id_producto`, `descripcion_producto`, `precio_producto`, `precio_venta`, `nombre_producto`) VALUES
(4, 'refrescos varios', '0.80', '3.55', 'coca cola'),
(5, 'bebida alcoholica', '1.75', '3.25', 'cerveza san mguel');

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `cif_proveedor` varchar(9) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `nombre_proveedor` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `apellidos_proveedor` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `telefono_proveedor` int(11) DEFAULT NULL,
  `poblacion_proveedor` varchar(30) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `cp_proveedor` int(11) DEFAULT NULL,
  `id_cine` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `cif_proveedor`, `nombre_proveedor`, `apellidos_proveedor`, `telefono_proveedor`, `poblacion_proveedor`, `cp_proveedor`, `id_cine`) VALUES
(1, '1234658J', 'pepe', 'perex', 564897654, 'MADRID', 28100, 10);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor-cine`
--

CREATE TABLE `proveedor-cine` (
  `id_proveedor` int(11) NOT NULL,
  `id_cine` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `id_pelicula` int(11) DEFAULT NULL,
  `id_sesion` int(11) NOT NULL,
  `id_butaca` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `reserva`
--

INSERT INTO `reserva` (`id_reserva`, `id_pelicula`, `id_sesion`, `id_butaca`, `id_cliente`) VALUES
(1, 1, 6, 3, NULL),
(2, 1, 12, 3, NULL),
(3, 1, 6, 4, NULL),
(4, 1, 6, 4, NULL),
(5, 1, 2, 4, NULL),
(6, 1, 2, 3, NULL),
(7, 1, 3, 3, NULL),
(8, 5, 15, 4, NULL),
(10, 1, 3, 7, 4),
(11, 1, 2, 5, NULL),
(12, 1, 12, 10, NULL),
(13, 1, 10, 3, NULL),
(14, 1, 10, 4, NULL),
(15, 1, 12, 4, NULL),
(16, 1, 12, 5, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `sala`
--

CREATE TABLE `sala` (
  `id_sala` int(11) NOT NULL,
  `nombre_sala` varchar(20) COLLATE utf16_spanish2_ci DEFAULT NULL,
  `numero_butacas` int(11) DEFAULT NULL,
  `id_cine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `sala`
--

INSERT INTO `sala` (`id_sala`, `nombre_sala`, `numero_butacas`, `id_cine`) VALUES
(8, 'Sala test', 35, 10);

-- --------------------------------------------------------

--
-- Table structure for table `sesion`
--

CREATE TABLE `sesion` (
  `id_sesion` int(11) NOT NULL,
  `hora_sesion` time DEFAULT NULL,
  `id_pelicula` int(11) NOT NULL,
  `id_sala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `sesion`
--

INSERT INTO `sesion` (`id_sesion`, `hora_sesion`, `id_pelicula`, `id_sala`) VALUES
(2, '18:22:33', 1, 8),
(3, '19:00:00', 1, 8),
(5, '14:00:00', 5, 8),
(6, '15:00:00', 1, 8),
(7, '14:00:00', 1, 8),
(8, '14:00:00', 1, 8),
(10, '22:00:00', 1, 8),
(11, '11:00:00', 5, 8),
(12, '11:14:59', 1, 8),
(13, '11:00:00', 5, 8),
(14, '23:59:47', 5, 8),
(15, '12:02:15', 5, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `butaca`
--
ALTER TABLE `butaca`
  ADD PRIMARY KEY (`id_butaca`),
  ADD KEY `id_sala` (`id_sala`);

--
-- Indexes for table `cabecera_factura_cliente`
--
ALTER TABLE `cabecera_factura_cliente`
  ADD PRIMARY KEY (`id_cab_factura_cli`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indexes for table `cabecera_pedido`
--
ALTER TABLE `cabecera_pedido`
  ADD PRIMARY KEY (`id_cab_pedido`);

--
-- Indexes for table `cine`
--
ALTER TABLE `cine`
  ADD PRIMARY KEY (`id_cine`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `cuerpo_factura_cliente`
--
ALTER TABLE `cuerpo_factura_cliente`
  ADD PRIMARY KEY (`id_cuerpo_factura_cli`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indexes for table `cuerpo_pedido`
--
ALTER TABLE `cuerpo_pedido`
  ADD PRIMARY KEY (`id_cuerpo_pedido`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_cabecera_pedido` (`id_cabecera_pedido`);

--
-- Indexes for table `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`),
  ADD KEY `id_cineEmp` (`id_cineEmp`);

--
-- Indexes for table `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`id_entrada`),
  ADD KEY `id_pelicula` (`id_pelicula`);

--
-- Indexes for table `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`id_pelicula`),
  ADD KEY `id_sala` (`id_sala`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`),
  ADD KEY `id_cine` (`id_cine`);

--
-- Indexes for table `proveedor-cine`
--
ALTER TABLE `proveedor-cine`
  ADD PRIMARY KEY (`id_proveedor`,`id_cine`),
  ADD KEY `id_proveedor` (`id_proveedor`),
  ADD KEY `proveedor-cine_cine_id_cine_fk` (`id_cine`);

--
-- Indexes for table `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_pelicula` (`id_pelicula`),
  ADD KEY `id_butaca` (`id_butaca`),
  ADD KEY `id_sesion` (`id_sesion`);

--
-- Indexes for table `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`id_sala`),
  ADD KEY `sala_cine_id_cine_fk` (`id_cine`);

--
-- Indexes for table `sesion`
--
ALTER TABLE `sesion`
  ADD PRIMARY KEY (`id_sesion`),
  ADD KEY `id_pelicula` (`id_pelicula`),
  ADD KEY `id_sala` (`id_sala`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `butaca`
--
ALTER TABLE `butaca`
  MODIFY `id_butaca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `cabecera_factura_cliente`
--
ALTER TABLE `cabecera_factura_cliente`
  MODIFY `id_cab_factura_cli` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `cabecera_pedido`
--
ALTER TABLE `cabecera_pedido`
  MODIFY `id_cab_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `cine`
--
ALTER TABLE `cine`
  MODIFY `id_cine` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `cuerpo_factura_cliente`
--
ALTER TABLE `cuerpo_factura_cliente`
  MODIFY `id_cuerpo_factura_cli` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `cuerpo_pedido`
--
ALTER TABLE `cuerpo_pedido`
  MODIFY `id_cuerpo_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT for table `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `entrada`
--
ALTER TABLE `entrada`
  MODIFY `id_entrada` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `sala`
--
ALTER TABLE `sala`
  MODIFY `id_sala` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `sesion`
--
ALTER TABLE `sesion`
  MODIFY `id_sesion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `butaca`
--
ALTER TABLE `butaca`
  ADD CONSTRAINT `id_sala_fk` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id_sala`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cabecera_factura_cliente`
--
ALTER TABLE `cabecera_factura_cliente`
  ADD CONSTRAINT `id_cliente_cabecera_fk` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cuerpo_factura_cliente`
--
ALTER TABLE `cuerpo_factura_cliente`
  ADD CONSTRAINT `Cuerpo_factura_cliente_ibfk_1` FOREIGN KEY (`id_cuerpo_factura_cli`) REFERENCES `cabecera_factura_cliente` (`id_cab_factura_cli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_producto_factura_fk` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cuerpo_pedido`
--
ALTER TABLE `cuerpo_pedido`
  ADD CONSTRAINT `id_producto_pedido_fk` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_id_pedido_fk` FOREIGN KEY (`id_cabecera_pedido`) REFERENCES `cabecera_pedido` (`id_cab_pedido`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `id_fk_cine` FOREIGN KEY (`id_cineEmp`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `pelicula_id_foreifhaksdbgfsadfg` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `proveedor-cine`
--
ALTER TABLE `proveedor-cine`
  ADD CONSTRAINT `proveedor-cine_cine_id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `proveedor-cine_proveedor_id` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `butaca_id_butaca` FOREIGN KEY (`id_butaca`) REFERENCES `butaca` (`id_butaca`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cliente_id_cliente_fk` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_id_sesion` FOREIGN KEY (`id_sesion`) REFERENCES `sesion` (`id_sesion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pelicula_id_pelicula_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sala`
--
ALTER TABLE `sala`
  ADD CONSTRAINT `sala_cine_id_cine_fk` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sesion`
--
ALTER TABLE `sesion`
  ADD CONSTRAINT `id_pelicula_fk` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
