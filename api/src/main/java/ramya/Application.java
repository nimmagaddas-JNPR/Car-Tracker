package ramya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
@Controller

public class Application  extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/api/**").allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedOrigins("http://mocker.egen.io/?","http://localhost8008")
                .allowedHeaders("accepts", "Origin","Access-Control-Request-Method", "Access-Control-Request-Method")
                .allowCredentials(false).maxAge(3600);
    }
}