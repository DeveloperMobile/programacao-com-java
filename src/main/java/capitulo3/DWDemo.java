package capitulo3;

import java.io.IOException;

// Demonstra o laço do-while.
public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // obtém um char
        } while (ch != 'q');
    }
}
