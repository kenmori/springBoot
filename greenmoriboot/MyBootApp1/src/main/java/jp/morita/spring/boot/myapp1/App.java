package jp.morita.spring.boot.myapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.anotation.ComponentScan;
import org.springframework.context.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan

public class App {
    public static void main( String[] args ) {
      ApplicationContext ctx = SpringApplication.run(App.class, args);
    }
}
