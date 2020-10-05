package com.example.springboottest3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
// 아직 DB설정을 안해서 오류가 뜨니 오류안뜨게 예외처리한것.
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Springboottest3Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboottest3Application.class, args);
    }
}
