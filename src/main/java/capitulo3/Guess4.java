package capitulo3;

import java.io.IOException;
import java.util.Arrays;

// Adivinhe a letra do jogo, 4ª versão.
public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("I'm  thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");

            // lê um caractere
            ch = (char) System.in.read();

            // descarta qualqer outro caractere do buffer de entrada
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Right **");
            else {
                System.out.print("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}
