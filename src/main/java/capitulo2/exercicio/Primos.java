package capitulo2.exercicio;

public class Primos {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Número primo: " + i);
            }
        }
    }
}
