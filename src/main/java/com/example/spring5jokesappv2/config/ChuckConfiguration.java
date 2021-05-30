package com.example.spring5jokesappv2.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//this is used when we are taking class from external jar.

//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
