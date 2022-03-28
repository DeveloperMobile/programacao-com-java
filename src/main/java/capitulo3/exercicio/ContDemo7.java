package capitulo3.exercicio;
// Usa continue
public class ContDemo7 {
    public static void main(String[] args) {
        int i = 0;
        // exibe os números pares entre 0 e 100.
        do {
            if (i % 2 == 0) System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
