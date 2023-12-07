package com.teste.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Devlopment
public class MyConfiguration {
    @Bean
    public CommandLineRunner executar(){
        return  args ->{
            System.out.println("Rodando configuração" +
                    "de desenvolvimento");
        };
    }
}
