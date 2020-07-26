DROP TABLE IF EXISTS `tenants`;
CREATE TABLE `tenants` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `bldg_no` bigint(20) DEFAULT NULL,
  `apt_no` bigint(20) DEFAULT NULL,
  `parking_no` varchar(50) DEFAULT NULL,
  `renew_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
);