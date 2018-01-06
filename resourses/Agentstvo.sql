CREATE DATABASE  IF NOT EXISTS `agentstvo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `agentstvo`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: agentstvo
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clients` (
  `idClients` bigint(11) NOT NULL AUTO_INCREMENT,
  `SNMClients` varchar(150) NOT NULL,
  `Floor` varchar(45) NOT NULL,
  `PassportClients` varchar(45) NOT NULL,
  `PhoneClients` varchar(45) NOT NULL,
  PRIMARY KEY (`idClients`),
  KEY `DealClient1` (`SNMClients`),
  KEY `DealClient2` (`SNMClients`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (2,'Курносова Ирина Григорьевна','женский','DP123455','+375336125482'),(3,'Стежкина Светлана Викторовна','женский','ВМ2010654','+375295927551'),(5,'Цендровкая Елена Павловна','женский','BS123456','+375293180075');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deal`
--

DROP TABLE IF EXISTS `deal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deal` (
  `idDeal` bigint(11) NOT NULL AUTO_INCREMENT,
  `DateDeal` date NOT NULL,
  `DealClient1` bigint(11) NOT NULL,
  `DealClient2` bigint(11) NOT NULL,
  `DealView` bigint(11) NOT NULL,
  `DealProperty` bigint(11) NOT NULL,
  `DealPropertyParam` bigint(11) NOT NULL,
  `DealEmployee` bigint(11) NOT NULL,
  `DealSum` double NOT NULL,
  `DealPercent` double NOT NULL,
  PRIMARY KEY (`idDeal`),
  KEY `idViewDeal_idx` (`DealView`),
  KEY `idProperty_idx` (`DealProperty`),
  KEY `idEmployees_idx` (`DealEmployee`),
  KEY `idClient_idx` (`DealClient1`,`DealClient2`),
  KEY `idClients` (`DealClient1`,`DealClient2`),
  KEY `idClient2_idx` (`DealClient2`),
  KEY `idParamProperty_idx` (`DealPropertyParam`),
  CONSTRAINT `idClient1` FOREIGN KEY (`DealClient1`) REFERENCES `clients` (`idClients`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idClient2` FOREIGN KEY (`DealClient2`) REFERENCES `clients` (`idClients`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idEmployees` FOREIGN KEY (`DealEmployee`) REFERENCES `employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idParamProperty` FOREIGN KEY (`DealPropertyParam`) REFERENCES `paramproperty` (`idParamProperty`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idProperty` FOREIGN KEY (`DealProperty`) REFERENCES `property` (`idProperty`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idViewDeal` FOREIGN KEY (`DealView`) REFERENCES `viewdeal` (`idViewDeal`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deal`
--

LOCK TABLES `deal` WRITE;
/*!40000 ALTER TABLE `deal` DISABLE KEYS */;
INSERT INTO `deal` VALUES (4,'2017-12-08',2,3,24,1,2,1,1500,10),(6,'2017-12-12',3,2,26,1,3,1,15000,10),(10,'2017-12-30',3,5,28,4,7,2,60000,20),(11,'2017-12-31',3,5,28,2,8,1,50000,20);
/*!40000 ALTER TABLE `deal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `idEmployees` bigint(11) NOT NULL AUTO_INCREMENT,
  `EmployeesSNM` varchar(150) NOT NULL,
  `EmployeesFloor` varchar(45) NOT NULL,
  `EmployeesCitizinship` varchar(45) NOT NULL,
  `EmployeesDoB` date NOT NULL,
  `EmployeesPassport` varchar(45) DEFAULT NULL,
  `Position` bigint(11) NOT NULL,
  `EmployeesPhone` varchar(45) NOT NULL,
  `EmployeesMail` varchar(45) NOT NULL,
  `password` varchar(32) NOT NULL,
  `solt` varchar(32) NOT NULL,
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`idEmployees`),
  KEY `idposition_idx` (`Position`),
  KEY `idusers_idx` (`EmployeesSNM`,`EmployeesMail`),
  CONSTRAINT `idPosition` FOREIGN KEY (`Position`) REFERENCES `positions` (`idPositions`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Иванов Петр Петрович','мужской','РБ','1988-01-03','ВМ865423',1,'475624','i@com','1','326d6',10),(2,'Копендаков Алексей Геннадьевич','мужской','РБ','1987-12-05','FV123456',2,'375928515','alex_kag@mail.ru','','',20),(3,'Стежкина Светлана Викторовна','женский','РБ','1996-06-22','ВМ451256',1,'365421','s@gmail.com','1','12354',30),(4,'testuserlogin','мужской','РБ','2017-12-29','656565',1,'21333','testuserlogin','fdg sdfg sdfgsdfg sdfg sdgf','43434',10);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `idLocation` bigint(11) NOT NULL AUTO_INCREMENT,
  `LocationStreet` bigint(11) NOT NULL,
  `LocationHouse` varchar(20) NOT NULL,
  `LocationCorps` varchar(45) NOT NULL,
  `LocationFlat` varchar(45) NOT NULL,
  PRIMARY KEY (`idLocation`),
  KEY `idStreets_idx` (`LocationStreet`),
  CONSTRAINT `idStreets` FOREIGN KEY (`LocationStreet`) REFERENCES `streets` (`idStreets`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (4,3,'22','5','1'),(5,3,'33','33','2'),(6,1,'5','1','6'),(7,3,'123','1','5'),(8,3,'123','123','9'),(9,7,'5','1','12'),(10,1,'35','2','5');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paramproperty`
--

DROP TABLE IF EXISTS `paramproperty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paramproperty` (
  `idParamProperty` bigint(11) NOT NULL AUTO_INCREMENT,
  `ParamPropertyArea` int(11) NOT NULL,
  `ParamPropertyLocation` bigint(11) NOT NULL,
  `ParamPropertyFloor` int(11) NOT NULL,
  `ParamPropertyDescription` varchar(200) NOT NULL,
  PRIMARY KEY (`idParamProperty`),
  KEY `idLocation_idx` (`ParamPropertyLocation`),
  CONSTRAINT `idLocation` FOREIGN KEY (`ParamPropertyLocation`) REFERENCES `location` (`idLocation`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paramproperty`
--

LOCK TABLES `paramproperty` WRITE;
/*!40000 ALTER TABLE `paramproperty` DISABLE KEYS */;
INSERT INTO `paramproperty` VALUES (2,46,6,2,'Квартира площадью 46 кв метров, расположена на 2 этаже '),(3,100,4,46,'Квартира расположена в северной части города'),(4,2,6,8,'Дом 2012 года постройки'),(7,80,9,1,'Квартира расположена на 1 этаже двухэтажного дома. Вблизи находятся торговый центр и книжный магазин.'),(8,87,10,523,'Год постройки дома 2016');
/*!40000 ALTER TABLE `paramproperty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `positions`
--

DROP TABLE IF EXISTS `positions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `positions` (
  `idPositions` bigint(11) NOT NULL AUTO_INCREMENT,
  `Positions` varchar(45) NOT NULL,
  PRIMARY KEY (`idPositions`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `positions`
--

LOCK TABLES `positions` WRITE;
/*!40000 ALTER TABLE `positions` DISABLE KEYS */;
INSERT INTO `positions` VALUES (1,'Менеджер'),(2,'Директор'),(3,'Агент по недвижимости');
/*!40000 ALTER TABLE `positions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `property` (
  `idProperty` bigint(11) NOT NULL AUTO_INCREMENT,
  `Property` varchar(45) NOT NULL,
  PRIMARY KEY (`idProperty`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (1,'1 комнатная квартира'),(2,'2 комнатная квартира'),(3,'3 комнатная квартира'),(4,'4 комнатная квартира'),(7,'5 комнатная квартира');
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `streets`
--

DROP TABLE IF EXISTS `streets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `streets` (
  `idStreets` bigint(11) NOT NULL AUTO_INCREMENT,
  `StreetsName` varchar(150) NOT NULL,
  PRIMARY KEY (`idStreets`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `streets`
--

LOCK TABLES `streets` WRITE;
/*!40000 ALTER TABLE `streets` DISABLE KEYS */;
INSERT INTO `streets` VALUES (1,'Янки Купалы'),(3,'Липеня'),(4,'Пушкина'),(5,'Октябрьская'),(7,'Заречная');
/*!40000 ALTER TABLE `streets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viewdeal`
--

DROP TABLE IF EXISTS `viewdeal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `viewdeal` (
  `idViewDeal` bigint(11) NOT NULL AUTO_INCREMENT,
  `ViewDeal` varchar(45) NOT NULL,
  PRIMARY KEY (`idViewDeal`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viewdeal`
--

LOCK TABLES `viewdeal` WRITE;
/*!40000 ALTER TABLE `viewdeal` DISABLE KEYS */;
INSERT INTO `viewdeal` VALUES (24,'Покупка'),(26,'Продажа'),(28,'Аренда');
/*!40000 ALTER TABLE `viewdeal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'agentstvo'
--

--
-- Dumping routines for database 'agentstvo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-04 19:00:29
