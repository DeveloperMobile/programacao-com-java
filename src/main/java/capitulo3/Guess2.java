package capitulo3;

import java.io.IOException;

// Adivinhe a letra do jogo, 2ª versão.
public class Guess2 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you gess it: ");

        ch = (char) System.in.read(); // lê um char no teclado

        if (ch == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you're wrong.");
    }
}
