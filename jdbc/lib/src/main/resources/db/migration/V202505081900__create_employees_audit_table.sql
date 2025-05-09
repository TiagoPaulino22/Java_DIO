# O arquivo .db deve estar dentro do caminho src/main/resources/db/migration/.
# O nome do arquivo deve seguir o padrão V"versão"__"nome".sql

CREATE TABLE IF NOT EXISTS employees_audit(
	id BIGINT not null auto_increment,
	name VARCHAR(150), 
	old_name VARCHAR(150),
	salary decimal(10,2),
	old_salary decimal(10,2),
	birthday TIMESTAMP ,
	old_birthday TIMESTAMP,
	operation CHAR(1),
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(id)
)engine = InnoDB default charset = utf8;