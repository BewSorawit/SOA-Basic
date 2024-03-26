-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2024 at 10:09 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test_soa`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CUS_ID` int(11) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CUS_ID`, `NAME`) VALUES
(1, 'HelloHibernate'),
(2, 'HelloHibernate'),
(3, 'S1'),
(4, 'Hong'),
(5, 'Hong'),
(6, 'John Doe'),
(7, 'John Doe'),
(8, 'John Doe'),
(9, 'John Doe'),
(10, 'John Doe'),
(11, 'John Doe'),
(12, 'John Doe'),
(13, 'John Doe'),
(14, 'John Doe'),
(15, 'John Doe'),
(16, 'John Doe'),
(17, 'John Doe'),
(18, 'John Doe'),
(19, 'John Doe'),
(20, 'John Doe'),
(21, 'John Doe');

-- --------------------------------------------------------

--
-- Table structure for table `phonenumber`
--

CREATE TABLE `phonenumber` (
  `PHONENUMBER_ID` int(11) NOT NULL,
  `NUMBER` varchar(255) DEFAULT NULL,
  `CUS_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;

--
-- Dumping data for table `phonenumber`
--

INSERT INTO `phonenumber` (`PHONENUMBER_ID`, `NUMBER`, `CUS_ID`) VALUES
(1, '0987654321', NULL),
(2, '1234567890', NULL),
(3, '0987654321', NULL),
(4, '1234567890', NULL),
(5, '1234567890', 21),
(6, '0987654321', 21);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CUS_ID`);

--
-- Indexes for table `phonenumber`
--
ALTER TABLE `phonenumber`
  ADD PRIMARY KEY (`PHONENUMBER_ID`),
  ADD KEY `FK_28498m2ap6ybm5xn8tce6iwmh` (`CUS_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `CUS_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `phonenumber`
--
ALTER TABLE `phonenumber`
  MODIFY `PHONENUMBER_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `phonenumber`
--
ALTER TABLE `phonenumber`
  ADD CONSTRAINT `FK_28498m2ap6ybm5xn8tce6iwmh` FOREIGN KEY (`CUS_ID`) REFERENCES `customer` (`CUS_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
