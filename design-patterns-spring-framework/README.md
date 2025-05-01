# Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework

Esse projeto foi feito juntamente com o instrutor Venilton. O link para o projeto original pode ser acessao clicando [aqui](https://github.com/digitalinnovationone/lab-padroes-projeto-spring). </br>

Nesse projeto, foram explorados três Design Patterns: 

1. Singleton
2. Strategy
3. Facade 

Fiz algumas modificações no projeto para que ele pudesse rodar com o Java 21 e o Springboot 3.4.5. 

Adicionei a tag **properties** do arquivo **pom.xml** a versão da openapi.


```xml
<openapi.version> 2.2.0 </openapi.version>
```
		
		
Adicionei a dependência da **openapi** para acesso ao **Swagger**.
 

	```xml
	<dependency>
	   <groupId>org.springdoc</groupId>
	   <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
	   <version>${openapi.version}</version>
	</dependency>	
	```


Adicionei a dependência do **Hibernate**, pois o Springboot estava pedindo.

	```xml
	<dependency>
		<groupId>org.hibernate.validator</groupId>
		<artifactId>hibernate-validator</artifactId>
	</dependency>
	```


Modifiquei a porta do localhost para 1025, pois a 8080 estava ocupada no meu computador. </br>
A mudança da porta pode ser feita adicionando o techo abaixo no arquivo **application.properties**.


```
server.port = 1025
```

Alguns imports tiveram que ser modificados como **jakarta** devido à versão do Java. </br>

O programa funcionou perfeitamente após as modificações. Assim, foram feitos alguns testes no Swagger. </br>


<img src= "\images\telaSwagger.jpg" /> 




