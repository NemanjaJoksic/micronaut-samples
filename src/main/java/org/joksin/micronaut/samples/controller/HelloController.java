package org.joksin.micronaut.samples.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.joksin.micronaut.samples.service.HelloService;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
@AllArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @Get("/hello")
    public Map<String, String> sayHello(@QueryValue Optional<String> name) {
        var message = helloService.sayHello(name);
        log.info("Message: {}", message);
        return Map.of("message", message);
    }

}
