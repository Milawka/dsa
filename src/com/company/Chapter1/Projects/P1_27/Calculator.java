package com.company.Chapter1.Projects.P1_27;

public class Calculator {
    public double calculateExpression(String[] expression){
        double firstOperand = Double.parseDouble(expression[0]);
        double secondOperand = Double.parseDouble(expression[2]);

        switch (expression[1]){
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                return firstOperand / secondOperand;
            case "%":
                return firstOperand % secondOperand;
            default:
                System.out.println("Error");
                return 0.0;
        }
    }
}
