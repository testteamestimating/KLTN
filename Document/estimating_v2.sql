CREATE SCHEMA estimatingnew_v2;
create table estimatingnew_v2.UsecasePointMethod (
	ucpId int unsigned not null auto_increment,
	wusWeight int unsigned,
	wasWeight int unsigned,
	tcfWeight int unsigned,
	efcWeight int unsigned,
    version int,
    createDate timestamp,
    totalPoint double,
    wusPoint double,
    wasPoint double,
    tcfPoint double,
    efcPoint double,
    totalHour double,
    totalCost double,
    payment double,
	primary key(ucpId),
    constraint wus_fk foreign key (wusWeight) references wusweight (wusId),
    constraint was_fk foreign key (wasWeight) references wasweight (wasId),
    constraint tcf_fk foreign key (tcfWeight) references tcfweight (tcfId),
    constraint efc_fk foreign key (efcWeight) references efcweight (efcId)
);
set foreign_key_checks=0;

create table estimatingnew_v2.UsecaseProperties (

	ucppId int unsigned not null auto_increment,
    ucppName varchar(30),
    ucppType int unsigned ,
    ucpId int unsigned,
    primary key(ucppId),
    constraint ucp_fk foreign key (ucpId) references UsecasePointMethod (ucpId),
    constraint comm_fk foreign key (ucppType) references CommonType (cmId)
);
drop table  estimatingnew_v2.UsecasePointMethod;
create table  estimatingnew_v2.CommonType ( 
	cmId int unsigned not null auto_increment,
    commonName varchar(30),
    primary key(cmId)    
);

create table estimatingnew_v2.WusWeight ( 
	
    wusId int unsigned not null auto_increment,
    uSimple int,
    uAverage int,
    uComplex int,
    primary key(wusId)
);

create table estimatingnew_v2.WasWeight (
	wasId int unsigned not null auto_increment,
    aSimple int default 0,
    aAverage int default 0,
    aComplex int default 0,
    primary key(wasId)
);

create table estimatingnew_v2.TcfWeight (

	tcfId int unsigned not null auto_increment,
	distributed_system int default 0,
    performance_objectives int default 0,
	end_uses_efficiency int default 0,
	complex_processing int default 0,
	reusable_code int default 0,
	easy_to_installation int default 0,
	easy_to_use int default 0, 
	portable int default 0,
	easy_to_change int default 0,
	concurrent_use int default 0,
	special_security int default 0,
	access_for_3_parties int default 0,
	training_needs int default 0,
    primary key(tcfId)
);

create table estimatingnew_v2.EfcWeight (
	
    efcId int unsigned not null auto_increment,
    familiarwithDevelopmentProcess int default 0,
	applicationExperience int default 0,
	objectOrientedExperience int default 0,
	leadAnalystCapability int default 0,
	motivation int default 0,
	stableRequirements int default 0,
	parttimeStaff int default 0,
	difficulProgrammingLanguage int default 0,
    primary key(efcId)
    
);


/*
Navicat MySQL Data Transfer

Source Server         : mySQL
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : estimating_v2

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2015-03-28 16:45:28
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `commontype`
-- ----------------------------
DROP TABLE IF EXISTS `commontype`;
CREATE TABLE `commontype` (
  `cmId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `commonName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cmId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commontype
-- ----------------------------

-- ----------------------------
-- Table structure for `eifweight`
-- ----------------------------
DROP TABLE IF EXISTS `eifweight`;
CREATE TABLE estimatingnew_v2.eifweight (
  `eifId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `eifSimple` int(11) DEFAULT NULL,
  `eifAverage` int(11) DEFAULT NULL,
  `eifComplex` int(11) DEFAULT NULL,
  PRIMARY KEY (`eifId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of eifweight
-- ----------------------------

-- ----------------------------
-- Table structure for `eiweight`
-- ----------------------------
DROP TABLE IF EXISTS `eiweight`;
CREATE TABLE estimatingnew_v2.eiweight (
  `eiId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `eiSimple` int(11) DEFAULT NULL,
  `eiAverage` int(11) DEFAULT NULL,
  `eiComplex` int(11) DEFAULT NULL,
  PRIMARY KEY (`eiId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of eiweight
-- ----------------------------

-- ----------------------------
-- Table structure for `eoweight`
-- ----------------------------
DROP TABLE IF EXISTS estimatingnew_v2.eoweight;
CREATE TABLE estimatingnew_v2.eoweight (
  `eoId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `eoSimple` int(11) DEFAULT NULL,
  `eoAverage` int(11) DEFAULT NULL,
  `eoComplex` int(11) DEFAULT NULL,
  PRIMARY KEY (`eoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of eoweight
-- ----------------------------

-- ----------------------------
-- Table structure for `eqweight`
-- ----------------------------
DROP TABLE IF EXISTS estimatingnew_v2eqweight;
CREATE TABLE estimatingnew_v2eqweight (
  `eqId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `eqSimple` int(11) DEFAULT NULL,
  `eqAverage` int(11) DEFAULT NULL,
  `eqComplex` int(11) DEFAULT NULL,
  PRIMARY KEY (`eqId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of eqweight
-- ----------------------------

-- ----------------------------
-- Table structure for `functionpointmethod`
-- ----------------------------
DROP TABLE IF EXISTS `functionpointmethod`;
CREATE TABLE estimatingnew_v2.functionpointmethod (
  `fpId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `eiId` int(10) unsigned DEFAULT NULL,
  `eoId` int(10) unsigned DEFAULT NULL,
  `eqId` int(10) unsigned DEFAULT NULL,
  `ilfId` int(10) unsigned DEFAULT NULL,
  `eifId` int(10) unsigned DEFAULT NULL,
  `rcafId` int(10) unsigned DEFAULT NULL,
  `fpversion` int(11) DEFAULT NULL,
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `totalPoint` double DEFAULT NULL,
  `totalHour` double DEFAULT NULL,
  `payment` double DEFAULT NULL,
  PRIMARY KEY (`fpId`),
  KEY `fp_ei` (`eiId`),
  KEY `fp_eo` (`eoId`),
  KEY `fp_eq` (`eqId`),
  KEY `fp_ilf` (`ilfId`),
  KEY `fp_eif` (`eifId`),
  CONSTRAINT `fp_ei` FOREIGN KEY (`eiId`) REFERENCES `eiweight` (`eiId`),
  CONSTRAINT `fp_eif` FOREIGN KEY (`eifId`) REFERENCES `eifweight` (`eifId`),
  CONSTRAINT `fp_eo` FOREIGN KEY (`eoId`) REFERENCES `eoweight` (`eoId`),
  CONSTRAINT `fp_eq` FOREIGN KEY (`eqId`) REFERENCES `eqweight` (`eqId`),
  CONSTRAINT `fp_ilf` FOREIGN KEY (`ilfId`) REFERENCES `ilfweight` (`ilfId`),
  constraint fp_racf foreign key (rcafId) references rcafator (rcafId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of functionpointmethod
-- ----------------------------

-- ----------------------------
-- Table structure for `functionpointproperties`
-- ----------------------------
DROP TABLE IF EXISTS `functionpointproperties`;
CREATE TABLE estimatingnew_v2.functionpointproperties (
  `fppId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fppName` varchar(50) DEFAULT NULL,
  `fppType` int(10) unsigned DEFAULT NULL,
  `fpId` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`fppId`),
  KEY `fp_fk` (`fpId`),
  KEY `cmm_fk` (`fppType`),
  CONSTRAINT `cmm_fk` FOREIGN KEY (`fppType`) REFERENCES `commontype` (`cmId`),
  CONSTRAINT `fp_fk` FOREIGN KEY (`fpId`) REFERENCES `functionpointmethod` (`fpId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of functionpointproperties
-- ----------------------------

-- ----------------------------
-- Table structure for `ilfweight`
-- ----------------------------
DROP TABLE IF EXISTS `ilfweight`;
CREATE TABLE estimatingnew_v2.ilfweight (
  `ilfId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ilfSimple` int(11) DEFAULT NULL,
  `ilfAverage` int(11) DEFAULT NULL,
  `ilfComplex` int(11) DEFAULT NULL,
  PRIMARY KEY (`ilfId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ilfweight
-- ----------------------------

-- ----------------------------
-- Table structure for `rcafator`
-- ----------------------------
DROP TABLE IF EXISTS `rcafator`;
CREATE TABLE estimatingnew_v2.rcafator (
  `rcafId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `rcaf_1` int(11) DEFAULT '0',
  `rcaf_2` int(11) DEFAULT '0',
  `rcaf_3` int(11) DEFAULT '0',
  `rcaf_4` int(11) DEFAULT '0',
  `rcaf_5` int(11) DEFAULT '0',
  `rcaf_6` int(11) DEFAULT '0',
  `rcaf_7` int(11) DEFAULT '0',
  `rcaf_8` int(11) DEFAULT '0',
  `rcaf_9` int(11) DEFAULT '0',
  `rcaf_10` int(11) DEFAULT '0',
  `rcaf_11` int(11) DEFAULT '0',
  `rcaf_12` int(11) DEFAULT '0',
  `rcaf_13` int(11) DEFAULT '0',
  `rcaf_14` int(11) DEFAULT '0',
  PRIMARY KEY (`rcafId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rcafator
-- ----------------------------

