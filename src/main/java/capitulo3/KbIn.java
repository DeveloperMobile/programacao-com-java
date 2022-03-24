package capitulo3;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;

        System.out.println("Press a key followed by ENTER: ");
        ch = (char) System.in.read(); // obtém um char
        System.out.println("Your key is: " + ch);
    }
}
