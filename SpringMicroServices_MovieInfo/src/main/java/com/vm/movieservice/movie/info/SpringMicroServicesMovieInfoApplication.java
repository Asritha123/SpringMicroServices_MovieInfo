package com.vm.movieservice.movie.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroServicesMovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServicesMovieInfoApplication.class, args);
	}

}
