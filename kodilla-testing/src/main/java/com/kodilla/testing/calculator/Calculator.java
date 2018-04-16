package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Calculator {

    double a = 5.2;
    double b = 1.6;
    public double addition() {
        return a + b;
    }
    public double subtraction(){
        return a - b;
    }


    public static void main(String[] args){
        Calculator calculator = new Calculator();
        double subtraction = calculator.subtraction();

        System.out.println(subtraction);
    }
}