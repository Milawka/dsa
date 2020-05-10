package com.company.Chapter1.Projects.P1_26;

import java.util.LinkedList;

public class ReversePrinter {

    public void reversePrint(LinkedList<String> buffer) {
        System.out.println("Result: ");

        for (int i = buffer.size() - 1; i >= 0; i--) {
            String s = buffer.get(i);
            System.out.println(s);
        }
    }
}
