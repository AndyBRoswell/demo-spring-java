package top.abr.demo_spring_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringJavaApplication.class, args);
    }
    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }
}
