CREATE SCHEMA `fake_soa` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `fake_soa`.`soa_access_log` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `server_name` VARCHAR(30) NOT NULL,
  `remote_addr` CHAR(15) NOT NULL,
  `create_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
