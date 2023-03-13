package org.joksin.micronaut.samples.service;

import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Singleton
public class HelloService {

    public String sayHello(Optional<String> name) {
        return name.map(n -> String.format("Hello %s!", n))
                   .orElse("Hello world!");
    }

    public Mono<String> sayHelloAsync(Optional<String> name) {
        return Mono.just(name.map(n -> String.format("Hello %s!", n))
                             .orElse("Hello world!"));
    }

}
