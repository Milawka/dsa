package Chapter2.P2_30;

public class OutputWriter {

    public void printDiagram() {
        Alphabet[] alphabet = Alphabet.values();
        for (Alphabet letter : alphabet) {
            System.out.print(letter + " |");
            for (int i = 0; i < letter.number; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
