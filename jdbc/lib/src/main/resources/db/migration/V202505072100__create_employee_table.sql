# O arquivo .db deve estar dentro do caminho src/main/resources/db/migration/.
# O nome do arquivo deve seguir o padrão V"versão"__"nome".sql

CREATE TABLE IF NOT EXISTS employees (
	id BIGINT not null auto_increment,
	name VARCHAR(150) not null, 
	salary decimal(10,2) not null,
	birthday TIMESTAMP not null,
	PRIMARY KEY(id)
)engine = InnoDB default charset = utf8;