-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 11, 2021 at 03:54 PM
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
('1212', 2, 'YES'),
('123456789874', 1, 'YES'),
('1234567899', 1, 'YES'),
('1234567899', 2, 'YES'),
('1234567899', 3, 'YES'),
('456', 1, 'NO'),
('456', 2, 'YES'),
('456', 3, 'YES'),
('456', 4, 'YES'),
('456', 5, 'YES'),
('48789', 1, 'YES'),
('6969696', 1, 'YES'),
('6969696', 2, 'YES'),
('6969696', 3, 'YES'),
('6969696', 4, 'YES'),
('6969696', 5, 'YES'),
('6969696', 6, 'YES'),
('69696969', 1, 'YES'),
('69696969', 2, 'YES'),
('69696969', 3, 'YES'),
('69696969', 4, 'YES'),
('69696969', 5, 'YES'),
('69696969', 6, 'YES'),
('69696969', 7, 'YES'),
('69696969', 8, 'YES'),
('69696969', 9, 'YES'),
('69696969', 10, 'YES'),
('69696969', 11, 'YES'),
('69696969', 12, 'YES'),
('69696969', 14, 'YES'),
('69696969', 15, 'YES'),
('69696969', 16, 'YES'),
('69696969', 17, 'YES'),
('69696969', 18, 'YES'),
('69696969', 19, 'YES'),
('69696969', 20, 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `bookinf`
--

CREATE TABLE `bookinf` (
  `book_id` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `genre` varchar(30) NOT NULL,
  `author_name` varchar(30) NOT NULL,
  `registered_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bookinf`
--

INSERT INTO `bookinf` (`book_id`, `name`, `genre`, `author_name`, `registered_date`) VALUES
('1212', 'charuka', 'Science', 'charuka', '2021-12-01'),
('123456789123', 'e', 'Mathematics', 'e', '2021-12-09'),
('1234567891234', 'e', 'Mathematics', 'e', '2021-12-09'),
('123456789874', 'wekowe', 'Business and Economics', 'ewew', '2021-12-02'),
('1234567899', 'mp', 'Mathematics', 'charles darwin', '2021-12-03'),
('12345678998', 'mp', 'Mathematics', 'charles darwin', '2021-12-03'),
('123456789987', 'mp', 'Mathematics', 'charles darwin', '2021-12-03'),
('1234567899876', 'mp', 'Mathematics', 'charles darwin', '2021-12-03'),
('456', '456', 'Lifestyle', 'po', '2021-12-03'),
('48789', 'Importance of bei', 'Fiction', 'Leonardo', '2021-12-10'),
('6969696', 'fefegregre', 'Lifestyle', 'bgvbdb', '2021-12-03'),
('69696969', 'xoiwjd', 'Literature', 'dwqdq', '2021-12-03');

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
(1, '456', 2, '1212', '2021-12-02', '2021-12-17', 'YES', '2021-12-02'),
(7, '456', 1, '123', '2021-12-02', '2021-12-11', 'NO', NULL);

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
('1212', 'kais', 1849499, 'female', '2021-12-03', 'Computing'),
('123', 'on', 123, 'female', '2021-12-04', 'Business');

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
('sith', 'sith');

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
