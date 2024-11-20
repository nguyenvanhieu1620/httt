-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema tuyen_sinh_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tuyen_sinh_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tuyen_sinh_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;
USE `tuyen_sinh_db` ;

-- -----------------------------------------------------
-- Table `tuyen_sinh_db`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuyen_sinh_db`.`user` (
  `id` INT NOT NULL,
  `fullname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `tuyen_sinh_db`.`career`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuyen_sinh_db`.`career` (
  `id` INT NOT NULL,
  `history` DATETIME NULL DEFAULT NULL,
  `holland_index` DOUBLE NOT NULL,
  `result` VARCHAR(45) NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_career_user1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_career_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `tuyen_sinh_db`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `tuyen_sinh_db`.`training`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuyen_sinh_db`.`training` (
  `id` INT NOT NULL,
  `mark` VARCHAR(5) NOT NULL,
  `capacity` VARCHAR(5) NOT NULL,
  `tuition` VARCHAR(5) NOT NULL,
  `time` VARCHAR(5) NOT NULL,
  `knowledge` VARCHAR(5) NOT NULL,
  `history` DATETIME NULL DEFAULT NULL,
  `result` VARCHAR(45) NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_training_user_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_training_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `tuyen_sinh_db`.`user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
