CREATE SCHEMA IF NOT EXISTS `spring-intro` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `spring-intro` ;

DROP TABLE IF EXISTS `spring-intro`.`offers` ;

CREATE TABLE IF NOT EXISTS `spring-intro`.`offers` (
  `id` INT NOT NULL COMMENT '',
  `name` VARCHAR(100) NOT NULL COMMENT '',
  `email` VARCHAR(60) NOT NULL COMMENT '',
  `text` TEXT NOT NULL COMMENT '')
ENGINE = InnoDB;

ALTER TABLE `spring-intro`.`offers` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '' ,
ADD PRIMARY KEY (`id`)  COMMENT '';