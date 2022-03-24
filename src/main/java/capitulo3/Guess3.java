package capitulo3;

import java.io.IOException;

// Adivinhe a letra do jogo, 3ª versão.
public class Guess3 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you gess it: ");

        ch = (char) System.in.read(); // lê um char no teclado

        if (ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");
            // um if aninhado
            if (ch < answer) System.out.println("too low");
            else System.out.println("to high");
        }
    }
}
