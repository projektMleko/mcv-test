package pl.project.milk.mvctest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleRestController {

    @GetMapping("/hello")
    public String helloEndpoint() {
        return "Hello world!";
    }
}
