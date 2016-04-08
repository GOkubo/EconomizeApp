# Host: localhost  (Version: 5.6.17-log)
# Date: 2016-04-08 09:14:16
# Generator: MySQL-Front 5.3  (Build 4.271)

/*!40101 SET NAMES latin1 */;

#
# Structure for table "department"
#

CREATE TABLE `department` (
  `department_id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `id_level_1` int(5) unsigned NOT NULL,
  `id_level_2` int(5) NOT NULL,
  `name` varchar(145) CHARACTER SET utf8 NOT NULL,
  `status_id` tinyint(2) unsigned NOT NULL,
  PRIMARY KEY (`department_id`),
  KEY `status_id` (`status_id`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`status_id`) REFERENCES `mercadocamargo`.`user_statuses` (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "department"
#

INSERT INTO `department` VALUES (1,0,0,'depto1',1),(2,0,0,'depto2',1),(3,0,0,'depto3',1);
