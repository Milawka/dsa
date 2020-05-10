package com.company.Chapter1.Projects.P1_26;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        ReversePrinter reversePrinter = new ReversePrinter();

        LinkedList<String> buf = reader.readLines();
        reversePrinter.reversePrint(buf);
    }
}
