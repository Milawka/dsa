package com.company.Chapter1.Projects.P1_27;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Calculator calculator = new Calculator();

        String[] expression = reader.readExpression();
        System.out.println(calculator.calculateExpression(expression));
    }
}

