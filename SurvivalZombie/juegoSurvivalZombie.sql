drop database if exists juego;
create database juego;
use juego;
-- -----------------------------------------------------
-- Schema juego
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `juego` DEFAULT CHARACTER SET utf8 ;
USE `juego` ;

-- -----------------------------------------------------
-- Table `juego`.`imagenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juego`.`imagenes` (
  `id_Img` INT NOT NULL,
  `ruta_img` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Img`))
ENGINE = InnoDB;

INSERT INTO juego.imagenes VALUES(1,"./src/images/survivor-idle_rifle.png");
INSERT INTO juego.imagenes VALUES(2,"./src/images/skeleton-attack.png");
INSERT INTO juego.imagenes VALUES(3,"./src/images/background.png");
INSERT INTO juego.imagenes VALUES(4,"./src/images/Hearth.png");
INSERT INTO juego.imagenes VALUES(5, "./src/images/bullet.png");


select * from juego.imagenes;
