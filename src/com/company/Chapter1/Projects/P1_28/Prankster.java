package com.company.Chapter1.Projects.P1_28;

public class Prankster {
    private final String PUNISHMENT = "I will never spam my friends again.";
    private StringBuilder typo = new StringBuilder(PUNISHMENT);

    public void executePunishment() {
        for (int i = 1; i <= 100; i++) {
            switch (i) {
                case 6:
                    System.out.println(i + ") " + typo.deleteCharAt(4));
                    typo = new StringBuilder(PUNISHMENT);
                    break;
                case 27:
                    System.out.println(i + ") " + typo.insert(23, 'i'));
                    typo = new StringBuilder(PUNISHMENT);
                    break;
                case 30:
                    System.out.println(i + ") " + typo.deleteCharAt(16));
                    typo = new StringBuilder(PUNISHMENT);
                case 44:
                    System.out.println(i + ") " + typo.append('.'));
                    typo = new StringBuilder(PUNISHMENT);
                case 54:
                    System.out.println(i + ") " + typo.deleteCharAt(7));
                    typo = new StringBuilder(PUNISHMENT);
                    break;
                case 69:
                    System.out.println(i + ") " + typo.insert(12, "er"));
                    typo = new StringBuilder(PUNISHMENT);
                    break;
                case 71:
                    int index = typo.lastIndexOf(".");
                    System.out.println(i + ") " + typo.deleteCharAt(index));
                    typo = new StringBuilder(PUNISHMENT);
                    break;
                case 98:
                    typo.deleteCharAt(0);
                    System.out.println(i + ") " + typo.insert(0, "i"));
                    typo = new StringBuilder(PUNISHMENT);
                    break;
                default:
                    System.out.println(i + ") " + PUNISHMENT);
            }
        }
    }
}
