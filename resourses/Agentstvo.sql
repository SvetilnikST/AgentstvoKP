-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: agentstvo
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
  `idClients` int(11) NOT NULL,
  `SNMClients` varchar(150) NOT NULL,
  `Floor` varchar(45) NOT NULL,
  `PassportClients` varchar(45) NOT NULL,
  `PhoneClients` varchar(45) NOT NULL,
  PRIMARY KEY (`idClients`),
  KEY `DealClient1` (`SNMClients`),
  KEY `DealClient2` (`SNMClients`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deal`
--

DROP TABLE IF EXISTS `deal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deal` (
  `idDeal` int(11) NOT NULL,
  `DateDeal` int(11) NOT NULL,
  `DealClient1` int(11) NOT NULL,
  `DealClient2` int(11) NOT NULL,
  `DealView` int(11) NOT NULL,
  `DealProperty` int(11) NOT NULL,
  `DealPropertyParam` int(11) NOT NULL,
  `DealEmployee` int(11) NOT NULL,
  `DealSum` double NOT NULL,
  `DealPercent` double NOT NULL,
  PRIMARY KEY (`idDeal`),
  KEY `idViewDeal_idx` (`DealView`),
  KEY `idProperty_idx` (`DealProperty`),
  KEY `idEmployees_idx` (`DealEmployee`),
  KEY `idClient_idx` (`DealClient1`,`DealClient2`),
  KEY `idClients` (`DealClient1`,`DealClient2`),
  KEY `idClient2_idx` (`DealClient2`),
  CONSTRAINT `idClient1` FOREIGN KEY (`DealClient1`) REFERENCES `clients` (`idClients`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idClient2` FOREIGN KEY (`DealClient2`) REFERENCES `clients` (`idClients`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idEmployees` FOREIGN KEY (`DealEmployee`) REFERENCES `employees` (`idEmployees`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idProperty` FOREIGN KEY (`DealProperty`) REFERENCES `property` (`idProperty`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idViewDeal` FOREIGN KEY (`DealView`) REFERENCES `viewdeal` (`idViewDeal`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deal`
--

LOCK TABLES `deal` WRITE;
/*!40000 ALTER TABLE `deal` DISABLE KEYS */;
/*!40000 ALTER TABLE `deal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `idEmployees` int(11) NOT NULL,
  `EmployeesSNM` varchar(150) NOT NULL,
  `EmployeesFloor` varchar(45) NOT NULL,
  `EmployeesCitizinship` varchar(45) NOT NULL,
  `EmployeesDoB` datetime NOT NULL,
  `EmployeesPassport` varchar(45) DEFAULT NULL,
  `Position` int(11) NOT NULL,
  `EmployeesPhone` varchar(45) NOT NULL,
  `EmployeesMail` varchar(45) NOT NULL,
  `password` varchar(32) NOT NULL,
  `solt` varchar(32) NOT NULL,
  `status` int(11) DEFAULT '0',
  `employeescol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEmployees`),
  KEY `idposition_idx` (`Position`),
  KEY `idusers_idx` (`EmployeesSNM`,`EmployeesMail`),
  CONSTRAINT `idposition` FOREIGN KEY (`Position`) REFERENCES `positions` (`idPositions`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `idLocation` int(11) NOT NULL,
  `LocationStreet` int(11) NOT NULL,
  `LocationHouse` varchar(20) NOT NULL,
  PRIMARY KEY (`idLocation`),
  KEY `idStreets_idx` (`LocationStreet`),
  CONSTRAINT `idStreets` FOREIGN KEY (`LocationStreet`) REFERENCES `streets` (`idStreets`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paramproperty`
--

DROP TABLE IF EXISTS `paramproperty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paramproperty` (
  `idParamProperty` int(11) NOT NULL,
  `ParamPropertyArea` int(11) NOT NULL,
  `ParamPropertyLocation` int(11) NOT NULL,
  `ParamPropertyFloor` int(11) NOT NULL,
  `ParamPropertyDescription` varchar(200) NOT NULL,
  PRIMARY KEY (`idParamProperty`),
  KEY `idLocation_idx` (`ParamPropertyLocation`),
  CONSTRAINT `idLocation` FOREIGN KEY (`ParamPropertyLocation`) REFERENCES `location` (`idLocation`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paramproperty`
--

LOCK TABLES `paramproperty` WRITE;
/*!40000 ALTER TABLE `paramproperty` DISABLE KEYS */;
/*!40000 ALTER TABLE `paramproperty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `positions`
--

DROP TABLE IF EXISTS `positions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `positions` (
  `idPositions` int(11) NOT NULL,
  `Positions` varchar(45) NOT NULL,
  PRIMARY KEY (`idPositions`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `positions`
--

LOCK TABLES `positions` WRITE;
/*!40000 ALTER TABLE `positions` DISABLE KEYS */;
/*!40000 ALTER TABLE `positions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `property` (
  `idProperty` int(11) NOT NULL,
  `Property` varchar(45) NOT NULL,
  `ParamProperty` int(11) NOT NULL,
  `propertycol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProperty`),
  KEY `idParamProperty_idx` (`ParamProperty`),
  CONSTRAINT `idParamProperty` FOREIGN KEY (`ParamProperty`) REFERENCES `paramproperty` (`idParamProperty`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `streets`
--

DROP TABLE IF EXISTS `streets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `streets` (
  `idStreets` int(11) NOT NULL,
  `StreetsName` varchar(150) NOT NULL,
  PRIMARY KEY (`idStreets`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `streets`
--

LOCK TABLES `streets` WRITE;
/*!40000 ALTER TABLE `streets` DISABLE KEYS */;
/*!40000 ALTER TABLE `streets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viewdeal`
--

DROP TABLE IF EXISTS `viewdeal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `viewdeal` (
  `idViewDeal` int(11) NOT NULL,
  `ViewDeal` varchar(45) NOT NULL,
  PRIMARY KEY (`idViewDeal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viewdeal`
--

LOCK TABLES `viewdeal` WRITE;
/*!40000 ALTER TABLE `viewdeal` DISABLE KEYS */;
/*!40000 ALTER TABLE `viewdeal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'agentstvo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-13 10:07:16
