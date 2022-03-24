package capitulo3.exercicio;

import java.io.IOException;

public class UpperLower {
    public static void main(String[] args) throws IOException {
        char choice, ignore;

        do {
            System.out.print("Informe uma letra maiúscula ou minúscula: ");
            choice = (char) System.in.read();
            String str = String.valueOf(choice);
            if (str.startsWith(str.toLowerCase())) {
                System.out.println("Minúscula: " + choice);
                System.out.println("Maiúscula: " + (char)(choice - 32));
            } else {
                System.out.println("Minúscula: " + (char)(choice + 32));
                System.out.println("Maiúscula: " + choice);
            }
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while ((choice >= 'a' && choice <= 'z') ||
                (choice >= 'A' && (choice <= 'Z')) && choice != '.');
    }
}
