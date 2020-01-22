package com.marvintdawson.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@CrossOrigin(origins="http://localhost:4200") // coming from the Angular server
@RestController
public class HelloWorldController {

    // GET
    // URI end point = /hello-world
    // method - "Hello World"

    // hellow-world
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello Marvs World";
    }

    // hellow-world-bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
    	// throw new RuntimeException("Some Error Has Happen, Please Contact Support at 800-597-6321");
        return new HelloWorldBean("Hello World Bean - Changed");
    }


    // hello-world/path-variable/in28minutes
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
