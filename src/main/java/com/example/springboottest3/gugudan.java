package com.example.springboottest3;
/* GUGUDAN 클래스 */

public class gugudan {
    private int num1;

    gugudan(){}
    public gugudan(int n){
        this.num1 = n;
    }

    public void cal(){
        for(int i=1; i<10; i++){
            System.out.println(this.num1 + " X " +i+" = "+this.num1 * i);
        }
    }


}
