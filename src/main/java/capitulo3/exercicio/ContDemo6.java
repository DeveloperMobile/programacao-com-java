package capitulo3.exercicio;
// Usa continue
public class ContDemo6 {
    public static void main(String[] args) {
        int i = 0;
        // exibe os números pares entre 0 e 100.
        while (i <= 100) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
    }
}
