-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-07-2021 a las 04:56:13
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pet_project_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_cat`
--

CREATE TABLE `tb_cat` (
  `id` int(11) NOT NULL,
  `breed` varchar(30) NOT NULL,
  `id_pet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_doctor`
--

CREATE TABLE `tb_doctor` (
  `id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  `document` int(11) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_dog`
--

CREATE TABLE `tb_dog` (
  `id` int(11) NOT NULL,
  `breed` varchar(30) NOT NULL,
  `pedigree` tinyint(1) NOT NULL DEFAULT 0,
  `id_pet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_hospital`
--

CREATE TABLE `tb_hospital` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `patient_type` varchar(20) NOT NULL,
  `id_doctor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_pet`
--

CREATE TABLE `tb_pet` (
  `id` int(11) NOT NULL,
  `code` varchar(3) NOT NULL,
  `name` varchar(50) NOT NULL,
  `born_year` int(11) NOT NULL,
  `health_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_pet`
--

INSERT INTO `tb_pet` (`id`, `code`, `name`, `born_year`, `health_status`) VALUES
(1, '15', 'Bruno', 2015, 'De alta'),
(2, '2', 'Martina', 2013, 'En observación'),
(4, '4', 'Max', 2011, 'De alta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_pet_hospital`
--

CREATE TABLE `tb_pet_hospital` (
  `id` int(11) NOT NULL,
  `date_appointment` date DEFAULT NULL,
  `id_pet` int(11) NOT NULL,
  `id_hospital` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_cat`
--
ALTER TABLE `tb_cat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pet` (`id_pet`);

--
-- Indices de la tabla `tb_doctor`
--
ALTER TABLE `tb_doctor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_dog`
--
ALTER TABLE `tb_dog`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pet` (`id_pet`);

--
-- Indices de la tabla `tb_hospital`
--
ALTER TABLE `tb_hospital`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_doctor` (`id_doctor`);

--
-- Indices de la tabla `tb_pet`
--
ALTER TABLE `tb_pet`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_pet_hospital`
--
ALTER TABLE `tb_pet_hospital`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pet` (`id_pet`),
  ADD KEY `id_hospital` (`id_hospital`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_cat`
--
ALTER TABLE `tb_cat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_doctor`
--
ALTER TABLE `tb_doctor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_dog`
--
ALTER TABLE `tb_dog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_hospital`
--
ALTER TABLE `tb_hospital`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_pet`
--
ALTER TABLE `tb_pet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tb_pet_hospital`
--
ALTER TABLE `tb_pet_hospital`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_cat`
--
ALTER TABLE `tb_cat`
  ADD CONSTRAINT `tb_cat_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `tb_pet` (`id`);

--
-- Filtros para la tabla `tb_dog`
--
ALTER TABLE `tb_dog`
  ADD CONSTRAINT `tb_dog_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `tb_pet` (`id`);

--
-- Filtros para la tabla `tb_hospital`
--
ALTER TABLE `tb_hospital`
  ADD CONSTRAINT `tb_hospital_ibfk_1` FOREIGN KEY (`id_doctor`) REFERENCES `tb_doctor` (`id`);

--
-- Filtros para la tabla `tb_pet_hospital`
--
ALTER TABLE `tb_pet_hospital`
  ADD CONSTRAINT `tb_pet_hospital_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `tb_pet` (`id`),
  ADD CONSTRAINT `tb_pet_hospital_ibfk_2` FOREIGN KEY (`id_hospital`) REFERENCES `tb_hospital` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
