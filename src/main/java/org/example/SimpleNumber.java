package org.example;

public class SimpleNumber {

    private int num;

    public SimpleNumber (int num){
        this.num = num;
    }

    public boolean isPositive(){
        return num > 0;
    }

    public boolean isNegative(){
        return num < 0;
    }
}
