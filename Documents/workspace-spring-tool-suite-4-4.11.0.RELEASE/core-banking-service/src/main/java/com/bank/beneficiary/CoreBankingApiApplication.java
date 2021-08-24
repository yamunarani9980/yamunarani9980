package com.bank.beneficiary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.bank.beneficiary.**")
public class CoreBankingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreBankingApiApplication.class, args);

	}

}
