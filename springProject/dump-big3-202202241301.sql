-- MySQL dump 10.13  Distrib 5.7.34, for osx10.16 (x86_64)
--
-- Host: localhost    Database: big3
-- ------------------------------------------------------
-- Server version	5.7.34

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
-- Table structure for table `bbs`
--

DROP TABLE IF EXISTS `bbs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bbs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `writer` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `bbs_FK` (`writer`),
  CONSTRAINT `bbs_FK` FOREIGN KEY (`writer`) REFERENCES `member` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bbs`
--

LOCK TABLES `bbs` WRITE;
/*!40000 ALTER TABLE `bbs` DISABLE KEYS */;
INSERT INTO `bbs` VALUES (1,'java','fun java','park'),(2,'jsp','fun jsp','kim'),(3,'spring2','fun spring2','song');
/*!40000 ALTER TABLE `bbs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `pw` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `tel` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('computer','computer','oracle','01049142996'),('computer2','computer2','oracle2','010491429962'),('gardenpro','garden','garden','01014241245'),('kim','kim','kim','kim'),('park','park','park','park'),('song','song','song','song'),('song11','song11','song11','song11'),('song12','song12','song12','song12'),('song2','song2','song2','song2'),('song21','song21','song21','song21'),('song22','song22','song22','song22'),('song3','song3','song3','song3'),('song33','song33','song33','song33'),('song5','song5','song5','song5'),('song6','song6','song6','song6'),('song7','song7','song7','song7'),('song8','song8','song8','song8'),('song9','song9','song9','song9');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `name` varchar(100) NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('100','food1','fun food1',1000,'c100','1.png'),('101','food2','fun food2',2000,'c200','2.png'),('102','food3','fun food3',3000,'c300','3.png'),('103','food4','fun food4',4000,'c100','4.png'),('104','food5','fun food5',5000,'c200','5.png'),('105','food6','fun food6',6000,'c300','6.png'),('106','food7','fun food7',7000,'c100','7.png'),('107','food8','fun food8',8000,'c200','8.png'),('108','food9','fun food9',9000,'c300','9.png'),('109','food10','fun food10',10000,'c100','10.png');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bbsid` int(11) NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `writer` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `reply_fk` (`bbsid`),
  KEY `reply_fk_1` (`writer`),
  CONSTRAINT `reply_fk` FOREIGN KEY (`bbsid`) REFERENCES `bbs` (`id`),
  CONSTRAINT `reply_fk_1` FOREIGN KEY (`writer`) REFERENCES `member` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
INSERT INTO `reply` VALUES (1,1,'fun','park'),(2,2,'good','kim'),(3,3,'best','song'),(4,1,'good','song'),(5,1,'normal','song2'),(6,2,'so so','song'),(9,1,'happy..','song'),(10,1,'happy..','song'),(11,1,'friday','song'),(12,1,'the end.','song'),(13,1,'smile','song'),(14,1,'test','song');
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'big3'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-24 13:01:42
