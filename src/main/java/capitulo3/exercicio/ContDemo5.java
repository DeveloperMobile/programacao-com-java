package capitulo3.exercicio;
// Usa continue
public class ContDemo5 {
    public static void main(String[] args) {
        int i = 0;
        // exibe os números pares entre 0 e 100.
        for (;;) {
            if (i % 2 == 0) System.out.println(i);
            if (i == 100) break;
            i++;
        }
    }
}
