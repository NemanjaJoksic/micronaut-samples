package org.joksin.micronaut.samples.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.joksin.micronaut.samples.service.HelloService;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
@AllArgsConstructor
public class ReactiveHelloController {

    private final HelloService helloService;

    @Get ("/async/hello")
    public Mono<Map<String, String>> sayHello(@QueryValue Optional<String> name) {
        return helloService.sayHelloAsync(name).map(message -> {
            log.info("Message: {}", message);
            return Map.of("message", message);
        });
    }

}
