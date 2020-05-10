package com.company.Chapter1.Projects.P1_26;

import java.util.LinkedList;
import java.util.Scanner;

public class Reader {
    private Scanner scanner;
    private LinkedList<String> buffer;

    Reader() {
        scanner = new Scanner(System.in);
        buffer = new LinkedList<>();
    }

    public LinkedList<String> readLines() {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("")) {
                break;
            }

            buffer.add(line);
        }
        return buffer;
    }
}
