package com.company;

import java.util.Scanner;

class ExampleException extends Exception{

    private double number;

    public double getNumber() {
        return number;
    }
    public ExampleException(String message, double num){
        super(message);
        this.number = num;
    }
}

class Example {
    public static double decisionExample(double x, double y) throws ExampleException{
        double z = 0;
        if(y == -1) throw new ExampleException("Division by zero", y);
        z = (x + y) / (y + 1);
        return z;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = in.nextDouble();
        System.out.print("Введите число y: ");
        double y = in.nextDouble();
        try{
            double result = Example.decisionExample(x, y);
            System.out.printf("Result of solved example: %.2f", result);
        }
        catch (ExampleException e){
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }
}
