package designpatterns.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients // Habilita o Feign dentro do projeto
@SpringBootApplication
public class DesignPatternsSpringFrameworkApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsSpringFrameworkApplication.class, args);
	}

}
