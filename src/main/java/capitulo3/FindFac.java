package capitulo3;
/* Usa laços aninhados para encontrar os fatores dos números
 * de 2 a 100. */
public class FindFac {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if ((i % 2) != 0) continue;
            System.out.print("Factors of " + i + ": ");
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
