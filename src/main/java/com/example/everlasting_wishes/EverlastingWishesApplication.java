package com.example.everlasting_wishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EverlastingWishesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EverlastingWishesApplication.class, args);
    }

}

/*
    Host
    ec2-54-74-14-109.eu-west-1.compute.amazonaws.com

    Database
    dddht6sgbb8gn8

    User
    obzyjfosthgbia

    Port
    5432

    Password
    a16b779f9cafd1c7092460e33ed9e34d4a29dbfdbd6e0cc147b908687e90c8a1

    URI
    postgres://obzyjfosthgbia:a16b779f9cafd1c7092460e33ed9e34d4a29dbfdbd6e0cc147b908687e90c8a1@ec2-54-74-14-109.eu-west-1.compute.amazonaws.com:5432/dddht6sgbb8gn8

    Heroku CLI
    heroku pg:psql postgresql-pointy-24552 --app everlasting-wishes
*/