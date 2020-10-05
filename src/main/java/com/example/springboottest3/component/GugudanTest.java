package com.example.springboottest3.component;

import lombok.*;

@Getter
@Setter
public class GugudanTest {
    private int num;

    public void cal(){
        for(int i = 1; i < 10; i++){
            System.out.println(getNum() + " X " + i +" = " + getNum() * i);
        }
    }
}
