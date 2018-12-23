package com.marvintdawson.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {

    // GET
    // URI end point = /hello-world
    // method - "Hello World"

    // hellow-world
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // hellow-world-bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean");
    }


    // hello-world/path-variable/in28minutes
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
