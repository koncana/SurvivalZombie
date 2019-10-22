drop database if exists game;
create database game;
use game;
-- -----------------------------------------------------
-- Schema juego
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `game` DEFAULT CHARACTER SET utf8 ;
USE `game` ;

-- -----------------------------------------------------
-- Table `juego`.`imagenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `game`.`images` (
  `id_Img` INT NOT NULL,
  `route_img` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Img`))
ENGINE = InnoDB;

INSERT INTO game.imagenes VALUES(1,"./src/images/soldier.png");
INSERT INTO game.imagenes VALUES(2,"./src/images/skeleton-attack.png");
INSERT INTO game.imagenes VALUES(3,"./src/images/background.png");
INSERT INTO game.imagenes VALUES(4,"./src/images/Hearth.png");
INSERT INTO game.imagenes VALUES(5, "./src/images/bullet.png");
INSERT INTO game.imagenes VALUES(6, "./src/images/pink_soldier.png");
INSERT INTO game.imagenes VALUES(7, "./src/images/bg.png");


select * from game.imagenes;
