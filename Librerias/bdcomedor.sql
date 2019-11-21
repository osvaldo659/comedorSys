-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-11-2019 a las 23:38:38
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdcomedor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `frecuencias`
--

CREATE TABLE `frecuencias` (
  `CodF` int(11) NOT NULL,
  `platos` varchar(100) NOT NULL,
  `contador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `frecuencias`
--

INSERT INTO `frecuencias` (`CodF`, `platos`, `contador`) VALUES
(1, 'MILANESA', 3),
(2, 'REMOLACHA', 1),
(3, 'ARVEJA', 1),
(4, 'SANDWICH', 1),
(5, 'MAICENA', 1),
(6, 'TRIGO', 2),
(7, 'CELULAR', 1),
(8, 'AVENA', 1),
(9, 'PAPA', 1),
(10, 'REPOIO', 1),
(12, 'jalado', 1),
(13, 'ervcrvr', 1),
(14, 'wdxd', 1),
(15, 'efvefv', 1),
(16, 'everv', 1),
(17, 'ececre', 1),
(18, 'evrv', 2),
(19, 'efvrt', 2),
(20, 'vtr', 2),
(21, 'vr', 2),
(22, 'vrtv', 2),
(23, '2', 9),
(24, '2ece', 2),
(25, '2rvfr', 2),
(26, '2rv', 2),
(27, 'ergfer', 1),
(28, 'wefe', 1),
(29, 'wefw', 3),
(30, 'dia', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menuscol`
--

CREATE TABLE `menuscol` (
  `semana` int(10) NOT NULL,
  `fecha` datetime NOT NULL,
  `clunes` varchar(50) NOT NULL,
  `plunes` varchar(50) NOT NULL,
  `cmartes` varchar(50) NOT NULL,
  `pmartes` varchar(50) NOT NULL,
  `cmiercoles` varchar(50) NOT NULL,
  `pmiercoles` varchar(50) NOT NULL,
  `cjueves` varchar(50) NOT NULL,
  `pjueves` varchar(50) NOT NULL,
  `cviernes` varchar(50) NOT NULL,
  `pviernes` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='cadaRegistroUnaSemana';

--
-- Volcado de datos para la tabla `menuscol`
--

INSERT INTO `menuscol` (`semana`, `fecha`, `clunes`, `plunes`, `cmartes`, `pmartes`, `cmiercoles`, `pmiercoles`, `cjueves`, `pjueves`, `cviernes`, `pviernes`) VALUES
(1, '2019-10-02 22:34:38', 'up', 'oiu', 'iu', 'jhg', ',hg', 'ky', 'giu', 'ytf', 'tffkhgfyu', 'asdfew'),
(5, '2019-10-09 09:06:58', '', '', 'Sandwich', '', '', '', '', '', '', ''),
(30, '2019-10-09 20:01:23', 'asdf', '', '', '', '', '', '', '', '', ''),
(31, '2019-10-09 20:02:09', 'asdf', '', '', '', '', '', '', '', '', ''),
(32, '2019-10-09 20:07:39', '', '', '', '', '', 'asdf', '', '', '', ''),
(33, '2019-10-09 20:08:11', '', '', '', '', '', '', '', '', 'asdf', ''),
(34, '2019-10-09 20:10:03', '', '', '', '', 'asdf', '', '', '', '', ''),
(35, '2019-10-09 20:28:32', '', '', '', 'asdf', '', '', '', '', '', ''),
(36, '2019-10-09 20:33:14', '', '', '', 'erty', '', '', '', '', '', ''),
(37, '2019-10-09 20:34:39', '', '', '', '', 'qwer', '', '', '', '', ''),
(38, '2019-10-09 20:42:56', '', '', 'wert', '', '', '', '', '', '', ''),
(39, '2019-10-09 20:46:41', '', '', '', '', 'zcxv', '', '', '', '', ''),
(40, '2019-10-09 20:50:14', '', '', '', '', 'asdf', '', '', '', '', ''),
(41, '2019-10-09 20:50:42', '', '', '', '', 'asdf', '', '', '', '', ''),
(42, '2019-10-09 20:52:46', '', '', '', 'asdf', '', '', '', '', '', ''),
(43, '2019-10-09 20:57:33', '', '', 'asdf', '', '', '', '', '', '', ''),
(44, '2019-10-09 20:58:15', '', '', '', '', 'qwer', '', '', '', '', ''),
(45, '2019-10-09 21:50:52', '', '', '', '', 'qwer', '', '', '', '', ''),
(46, '2019-10-09 22:21:30', 'wert', '', '', '', '', '', '', '', '', '');

--
-- Disparadores `menuscol`
--
DELIMITER $$
CREATE TRIGGER `incrementaFrecuencia` AFTER INSERT ON `menuscol` FOR EACH ROW BEGIN
    IF (New.clunes = 'MILANESA')  
    THEN
       	UPDATE frecuencias SET contador = contador+1 WHERE platos = New.clunes OR platos=New.cmartes OR platos=New.cmiercoles OR platos=New.cmiercoles OR platos=New.cjueves OR platos=New.cviernes;
    ELSE
    	INSERT INTO frecuencias (platos) VALUES (New.clunes);
	END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menusfila`
--

CREATE TABLE `menusfila` (
  `cod` int(11) NOT NULL,
  `semana` int(100) NOT NULL,
  `dia` varchar(100) NOT NULL,
  `plato` varchar(100) NOT NULL,
  `postre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='registro_por_dia';

--
-- Volcado de datos para la tabla `menusfila`
--

INSERT INTO `menusfila` (`cod`, `semana`, `dia`, `plato`, `postre`) VALUES
(98, 2, 'LUNES', 'dia', 'mes'),
(99, 2, 'MARTES', 'dia', 'mes'),
(100, 2, 'MIERCOLES', 'dia', 'mes'),
(101, 2, 'JUEVES', 'dia', 'mes'),
(102, 2, 'VIERNES', 'dia', 'mes');

--
-- Disparadores `menusfila`
--
DELIMITER $$
CREATE TRIGGER `decfrec` AFTER DELETE ON `menusfila` FOR EACH ROW BEGIN
	IF exists (select platos from frecuencias where platos=Old.plato)
    THEN
    	UPDATE frecuencias SET contador = contador - 1 WHERE platos=Old.plato;
        DELETE FROM frecuencias WHERE contador = '0';
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `incFrec` AFTER INSERT ON `menusfila` FOR EACH ROW BEGIN
	IF exists (select platos from frecuencias where platos=New.plato)
    THEN
    	UPDATE frecuencias SET contador = contador +1 WHERE platos=New.plato;
    ELSE
    	INSERT frecuencias (platos,contador)VALUES(New.plato,1);
    END IF;
END
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `frecuencias`
--
ALTER TABLE `frecuencias`
  ADD PRIMARY KEY (`CodF`);

--
-- Indices de la tabla `menuscol`
--
ALTER TABLE `menuscol`
  ADD PRIMARY KEY (`semana`);

--
-- Indices de la tabla `menusfila`
--
ALTER TABLE `menusfila`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `frecuencias`
--
ALTER TABLE `frecuencias`
  MODIFY `CodF` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `menuscol`
--
ALTER TABLE `menuscol`
  MODIFY `semana` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT de la tabla `menusfila`
--
ALTER TABLE `menusfila`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
