package propets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ProPetsRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProPetsRouterApplication.class, args);
	}

}
