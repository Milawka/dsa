package com.company.Chapter2.P2_30;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\User\\IdeaProjects\\untitled\\src\\com.company.Chapter2\\P2_30\\text.txt";
        InputHandler input = new InputHandler(path);
        Parser parser = new Parser();
        OutputWriter output = new OutputWriter();

        LinkedList<Character> letters = input.read();
        parser.parse(letters);
        output.printDiagram();
    }
}
