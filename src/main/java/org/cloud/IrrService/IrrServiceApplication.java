package org.cloud.IrrService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.cloud.IrrService")
@EnableSwagger2
@EnableJpaRepositories
public class IrrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrrServiceApplication.class, args);
	}

}
