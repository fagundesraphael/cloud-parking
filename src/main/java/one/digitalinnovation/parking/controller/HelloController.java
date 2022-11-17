package one.digitalinnovation.parking.controller;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")
@Hidden
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello, Digital Innovation One!!!";
    }
}
