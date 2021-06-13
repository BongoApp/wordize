package com.bo.wordize.bl;

import com.bo.wordize.model.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldBl {
    public HelloWorld sayHelloWorld() {
        return new HelloWorld("Hello World");
    }
}
