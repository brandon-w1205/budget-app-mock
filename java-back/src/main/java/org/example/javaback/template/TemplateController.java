package org.example.javaback.template;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @RequestMapping("/")
    public String getHelloWorld() {
        return "Hello World";
    }
}
