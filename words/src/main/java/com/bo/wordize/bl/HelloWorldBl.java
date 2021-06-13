package com.bo.wordize.bl;

import com.bo.wordize.dto.WordsDto;
import com.bo.wordize.model.HelloWorld;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldBl {
    public HelloWorld sayHelloWorld() {
        return new HelloWorld("Hello World");
    }
}
