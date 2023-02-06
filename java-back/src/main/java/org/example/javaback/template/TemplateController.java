package org.example.javaback.template;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {
    Template theExample = new Template("Hello World");

    @RequestMapping("/")
    public String getHelloWorld() {
        return theExample.getExample();
    }
}
