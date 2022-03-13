package capitulo2.exercicio;

public class Random {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            double x = Math.random();
            if (x > 0.5) {
                System.out.println(i + " - " + x);
            }
        }
    }
}
