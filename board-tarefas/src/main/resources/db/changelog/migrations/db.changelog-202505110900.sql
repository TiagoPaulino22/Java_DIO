--liquibase formatted sql
--changeset tiago:202505110900
--comment: boards table crate

CREATE TABLE boards (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL	
)ENGINE = InnoDB;

--rolback DROP TABLE boards

