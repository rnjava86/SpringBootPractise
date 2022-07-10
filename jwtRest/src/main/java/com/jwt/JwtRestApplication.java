package com.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
///@EnableJpaRepositories(basePackages ={"com.jwt.repository"})
public class JwtRestApplication {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("server.tomcat.basedir"));
		SpringApplication.run(JwtRestApplication.class, args);

	}
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				//System.out.println(beanName);
//			}

		};
	}*/
	@CrossOrigin(origins = "*")
	@RestController
	public class HelloController {

		@GetMapping("/")
		public String index() {
			System.out.println("We are in...");
			return "Greetings from Spring Boot!";
		}
		@GetMapping("/tutorials/{id}")
		public ResponseEntity<String> getAllTutorialWithID(@PathVariable("id") long id) {
			System.out.println("getAllTutorialWithID");
			return  ResponseEntity.status(HttpStatus.OK).body("Yes her is all records");
		}
	}

}
