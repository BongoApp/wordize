package com.bo.wordize.api;

import com.bo.wordize.bl.HelloWorldBl;
import com.bo.wordize.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/api/")
public class HelloWorldApi {
    private final HelloWorldBl worldBl;

    @Autowired
    public HelloWorldApi(HelloWorldBl worldBl) {
        this.worldBl = worldBl;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloWorld getInfoManager() {
        return worldBl.sayHelloWorld();
    }

}
