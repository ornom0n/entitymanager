-- Use these sql commands to initialize entitymanager database

------------------------
-- Creating the database
------------------------

CREATE DATABASE entity_database;
USE entity_database;

------------------------
-- Creating the tables
------------------------

CREATE TABLE `entity` (
	`EN_ID` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`NAME` VARCHAR(100) NOT NULL DEFAULT '0',
	`FORM` VARCHAR(100) NULL DEFAULT '0',
	`STATUS` BIGINT(20) NULL DEFAULT NULL,
	`BORN_DT` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`LAST_UPDATE_DT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	INDEX `Index 1` (`EN_ID`),
	FULLTEXT INDEX `Index 2` (`NAME`)
)
COMMENT='Main table for entities.'
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

CREATE TABLE `entityrel` (
	`EN_REL_ID` BIGINT(20) NOT NULL,
	`TO_EN_ID` BIGINT(20) NOT NULL,
	`FROM_EN_ID` BIGINT(20) NOT NULL,
	`REL_TP` INT(11) NOT NULL,
	`START_DT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`LAST_UPDATE_DT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`EN_REL_ID`),
	INDEX `Index 2` (`TO_EN_ID`),
	INDEX `FK_entityrel_entity_2` (`FROM_EN_ID`),
	CONSTRAINT `FK_entityrel_entity` FOREIGN KEY (`TO_EN_ID`) REFERENCES `entity` (`EN_ID`) ON UPDATE NO ACTION ON DELETE CASCADE,
	CONSTRAINT `FK_entityrel_entity_2` FOREIGN KEY (`FROM_EN_ID`) REFERENCES `entity` (`EN_ID`) ON UPDATE NO ACTION ON DELETE CASCADE
)
COMMENT='Contains relationships between two entities'
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;