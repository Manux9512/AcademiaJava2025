CREATE DATABASE  IF NOT EXISTS `members_directory`;
USE `members_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `entry_date` date DEFAULT NULL,
  `expiration_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `member` VALUES 
	(1,'Leslie','Andrews','leslie@luv2code.com', '5510293810', '2024-01-01','2025-01-01'),
	(2,'Emma','Baumgarten','emma@luv2code.com','3210293810', '2023-01-01','2024-02-05'),
	(3,'Avani','Gupta','avani@luv2code.com','3510293810', '2010-01-01','2025-01-06'),
	(4,'Yuri','Petrov','yuri@luv2code.com','7510295910', '2019-01-03','2024-02-01'),
	(5,'Juan','Vega','juan@luv2code.com','8590293810', '2017-01-01','2025-02-01');

