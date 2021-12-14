-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 14, 2021 at 05:51 PM
-- Server version: 8.0.17
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_code` int(10) NOT NULL,
  `availability` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_id`, `book_code`, `availability`) VALUES
('9780199339136', 1, 'NO'),
('9780199339136', 2, 'YES'),
('9780199339136', 3, 'YES'),
('9780199339136', 4, 'YES'),
('9781586638474', 1, 'YES'),
('9781586638474', 2, 'YES'),
('9789556950083', 1, 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `bookinf`
--

CREATE TABLE `bookinf` (
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `genre` varchar(30) NOT NULL,
  `author_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `registered_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bookinf`
--

INSERT INTO `bookinf` (`book_id`, `name`, `genre`, `author_name`, `registered_date`) VALUES
('9780199339136', 'Microelectronic Circuits 7th edition', 'Science', 'Adel S. Sedra, Kenneth C. Smith', '2021-12-01'),
('9781586638474', 'Julius Caesar (No Fear Shakespeare)', 'Literature', 'William Shakespeare', '2021-12-01'),
('9789556950083', 'Lay Bare the Roots – Ape Gama (Translated)', 'Fiction', 'Lakshmi De Silva', '2021-12-01');

-- --------------------------------------------------------

--
-- Table structure for table `borrow`
--

CREATE TABLE `borrow` (
  `issue_no` int(10) NOT NULL,
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `book_code` int(10) NOT NULL,
  `member_id` varchar(10) NOT NULL,
  `issue_date` date NOT NULL,
  `due_date` date NOT NULL,
  `is_returned` text NOT NULL,
  `returned_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `borrow`
--

INSERT INTO `borrow` (`issue_no`, `book_id`, `book_code`, `member_id`, `issue_date`, `due_date`, `is_returned`, `returned_date`) VALUES
(1, '9780199339136', 1, 'AA1334', '2021-12-07', '2022-12-07', 'NO', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `member_id` varchar(10) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `contact_no` int(11) NOT NULL,
  `sex` text NOT NULL,
  `birthday` date NOT NULL,
  `faculty` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`member_id`, `name`, `contact_no`, `sex`, `birthday`, `faculty`) VALUES
('AA1334', 'Kaiz Noorhamith', 765343008, 'male', '2001-06-01', 'Engineering'),
('AA1382', 'Kisal Gunawardena', 716978877, 'male', '2000-04-10', 'Engineering'),
('AA1488', 'Sithara Bandara', 773363403, 'female', '2000-01-04', 'Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL,
  `user_pw` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_pw`) VALUES
('KaizNH', 'kaiz2001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`book_id`,`book_code`),
  ADD UNIQUE KEY `UNIQUE` (`book_id`,`book_code`);

--
-- Indexes for table `bookinf`
--
ALTER TABLE `bookinf`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `borrow`
--
ALTER TABLE `borrow`
  ADD PRIMARY KEY (`issue_no`),
  ADD KEY `book_id` (`book_id`,`book_code`),
  ADD KEY `member_id` (`member_id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`member_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `bookinf` (`book_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `borrow`
--
ALTER TABLE `borrow`
  ADD CONSTRAINT `borrow_ibfk_1` FOREIGN KEY (`book_id`,`book_code`) REFERENCES `book` (`book_id`, `book_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `borrow_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
