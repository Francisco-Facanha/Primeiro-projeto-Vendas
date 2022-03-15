package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.Name;

@Configuration
public class AnimalConfiguration {


    @Bean(name = "Cachorro")

    public Animal Cachorro(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Au, au");
            }
        };
    }

    @Bean(name = "Gato")

    public Animal Gato(){
        return new Animal() {
            @Override
            public void fazerBarulho() {

                System.out.println("Meow, Meow");
            }
        };
    }
}