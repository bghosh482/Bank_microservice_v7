package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountContactInfoDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableConfigurationProperties(value = {AccountContactInfoDto.class})
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableFeignClients
@OpenAPIDefinition(
		info =@Info(
				title = "Accounts Microservice",
				version = "v1",
				description = "EazyBank Accounts Microservice Rest API Documentation",
                contact = @Contact(
						name = "Bubai Ghosh",
						email = "bghosh482@gmail.com",
						url = "https://github.com/bghosh482"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.bghosh482.com"
				)
		)
)
public class AccountsApplication {

	/**
	 * Entry point for the spring boot application. This method is invoked by the
	 * JVM when the program is started.
	 *
	 * @param args The command line arguments. These are passed to the application by
	 * the user.
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}