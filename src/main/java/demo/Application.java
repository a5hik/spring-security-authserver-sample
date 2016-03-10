package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Marcos Barbero
 */
@EnableResourceServer
@SpringCloudApplication
public class Application {

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
}
