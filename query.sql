-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`gamer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`gamer` (
  `gamer_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `score` VARCHAR(45) NULL,
  PRIMARY KEY (`gamer_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`question` (
  `question_id` INT NOT NULL AUTO_INCREMENT,
  `asnwer_false01` TEXT(1000) NULL,
  `answer_false02` TEXT(1000) NULL,
  `answer_false03` TEXT(1000) NULL,
  `answer_true` TEXT(1000) NULL,
  `level` INT NOT NULL,
  PRIMARY KEY (`question_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`game` (
  `gamer_id` INT NOT NULL AUTO_INCREMENT,
  `gamer_gamer_id` INT NOT NULL,
  `question_question_id` INT NOT NULL,
  `date` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`gamer_id`),
  INDEX `fk_game_gamer_idx` (`gamer_gamer_id` ASC) VISIBLE,
  INDEX `fk_game_question1_idx` (`question_question_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_gamer`
    FOREIGN KEY (`gamer_gamer_id`)
    REFERENCES `mydb`.`gamer` (`gamer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_game_question1`
    FOREIGN KEY (`question_question_id`)
    REFERENCES `mydb`.`question` (`question_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
