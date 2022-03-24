package capitulo3.exercicio;

import java.io.IOException;
// Contar espaços versão 1
public class ReadChar {
    public static void main(String[] args) throws IOException {
        char ch, ignore;
        int spaces = 0;
        do {
            System.out.print("Informe um caracter: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
                spaces++;
            } while (ignore != '\n');
            System.out.println("Chars: " + ch);
        } while (ch != '.');

        System.out.println("Espaços: " + spaces);
    }
}
