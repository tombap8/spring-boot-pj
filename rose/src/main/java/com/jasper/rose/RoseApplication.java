package com.jasper.rose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.Banner;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jasper.rose","com.jasper.lily"})
public class RoseApplication {

	public static void main(String[] args) {
		SpringApplication application =
		new SpringApplication(RoseApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);

		// 배너 OFF
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);

	}

}
