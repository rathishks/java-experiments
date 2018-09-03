package com.rathish.java;

public class Calculator {

    private Integer sum =0;

    public void setSum(Integer sum){
        this.sum =  sum;
    }

    public Integer getSum(){
        return sum;
    }

    public synchronized void increment(){
        setSum(getSum() + 1);
    }
}

