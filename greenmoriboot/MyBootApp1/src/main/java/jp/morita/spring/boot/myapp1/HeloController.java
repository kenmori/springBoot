package jp.morita.spring.boot.myapp1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HeloController{
  @RequestMapping('/')
  public String index() {
    return "Hello, Spring Boot!";
  }
}
