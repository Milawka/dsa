package com.company.Chapter1.Projects.P1_27;

import java.util.Scanner;

public class Reader {
    private Scanner scanner;
    private String[] operands;

    Reader() {
        scanner = new Scanner(System.in);
        operands = new String[3];
    }

    public String[] readExpression() {
        operands[0] = scanner.next();
        System.out.println(operands[0]);
        operands[1] = scanner.next();
        System.out.println(operands[0]);
        operands[2] = scanner.next();
        System.out.println(operands[2]);

        return operands;
    }
}
