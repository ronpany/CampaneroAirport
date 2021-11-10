CREATE SCHEMA `hangares` ;

CREATE TABLE `hangares`.`cliente` (
  `idCliente` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `cellphone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCliente`));

CREATE TABLE `hangares`.`avion` (
  `idAvion` VARCHAR(45) NOT NULL,
  `height` VARCHAR(45) NOT NULL,
  `length` VARCHAR(45) NOT NULL,
  `width` VARCHAR(45) NOT NULL,
  `idCliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAvion`),
  INDEX `fk_idCliente_idx` (`idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_idCliente`
    FOREIGN KEY (`idCliente`)
    REFERENCES `hangares`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `hangares`.`tarifa` (
  `idTarifa` INT NOT NULL AUTO_INCREMENT,
  `price` FLOAT NOT NULL,
  PRIMARY KEY (`idTarifa`));

CREATE TABLE `hangares`.`hangar` (
  `idHangar` VARCHAR(45) NOT NULL,
`height` VARCHAR(45) NOT NULL,
  `length` VARCHAR(45) NOT NULL,
  `width` VARCHAR(45) NOT NULL,
 `state` VARCHAR(45) NOT NULL,
 
  `idTarifa` INT NOT NULL,
  PRIMARY KEY (`idHangar`),
  INDEX `fk_idTarifa_idx` (`idTarifa` ASC) VISIBLE,
  CONSTRAINT `fk_idTarifa`
    FOREIGN KEY (`idTarifa`)
    REFERENCES `hangares`.`tarifa` (`idTarifa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE `hangares`.`registro` (
  `idRegistro` INT NOT NULL AUTO_INCREMENT,
  `entryDate` DATE NOT NULL,
  `departureDate` DATE NOT NULL,
  `idHangar` VARCHAR(45) NOT NULL,
  `idAvion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRegistro`),
  INDEX `fk_idAvion_idx` (`idAvion` ASC) VISIBLE,
  INDEX `fk_idHangar_idx` (`idHangar` ASC) VISIBLE,
  CONSTRAINT `fk_idAvion`
    FOREIGN KEY (`idAvion`)
    REFERENCES `hangares`.`avion` (`idAvion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idHangar`
    FOREIGN KEY (`idHangar`)
    REFERENCES `hangares`.`hangar` (`idHangar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `hangares`.`ticket` (
  `idTicket` INT NOT NULL AUTO_INCREMENT,
  `dateTicket` DATE NULL,
  `entryDate` DATE NULL,
  `departureDate` DATE NULL,
  `totalValue` FLOAT NULL,
  `idRegistro` INT NULL,
  PRIMARY KEY (`idTicket`),
  INDEX `fk_idRegistro_idx` (`idRegistro` ASC) VISIBLE,
  CONSTRAINT `fk_idRegistro`
    FOREIGN KEY (`idRegistro`)
    REFERENCES `hangares`.`registro` (`idRegistro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

ALTER TABLE `hangares`.`ticket` 
DROP FOREIGN KEY `fk_idRegistro`;
ALTER TABLE `hangares`.`ticket` 
CHANGE COLUMN `dateTicket` `dateTicket` DATE NOT NULL ,
CHANGE COLUMN `entryDate` `entryDate` DATE NOT NULL ,
CHANGE COLUMN `departureDate` `departureDate` DATE NOT NULL ,
CHANGE COLUMN `totalValue` `totalValue` FLOAT NOT NULL ,
CHANGE COLUMN `idRegistro` `idRegistro` INT NOT NULL ;
ALTER TABLE `hangares`.`ticket` 
ADD CONSTRAINT `fk_idRegistro`
  FOREIGN KEY (`idRegistro`)
  REFERENCES `hangares`.`registro` (`idRegistro`);

ALTER TABLE `hangares`.`ticket` 
CHANGE COLUMN `dateTicket` `dateTicket` DATETIME NOT NULL ,
CHANGE COLUMN `entryDate` `entryDate` DATETIME NOT NULL ,
CHANGE COLUMN `departureDate` `departureDate` DATETIME NOT NULL ;

ALTER TABLE `hangares`.`registro` 
CHANGE COLUMN `entryDate` `entryDate` DATETIME NOT NULL ,
CHANGE COLUMN `departureDate` `departureDate` DATETIME NOT NULL ;