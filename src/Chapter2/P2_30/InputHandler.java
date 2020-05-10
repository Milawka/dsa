package Chapter2.P2_30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class InputHandler {
    private InputStreamReader reader;

    InputHandler(String path) {
        try {
            reader = new InputStreamReader(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<Character> read() {
        LinkedList<Character> characters = new LinkedList<>();
        int character = 0;
        while (character != -1) {
            try {
                character = reader.read();
                characters.add((char) character);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return characters;
    }
}
