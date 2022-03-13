package capitulo2.exercicio;

public class Random2 {
    public static void main(String[] args) {
        double a, b, c;
        a = Math.random();
        b = Math.random();
        c = Math.random();

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);

        if (a < 0.2 && b < 0.2 && c < 0.2) {
            System.out.println("All are tiny");
        } else if (a < 0.2 || b < 0.2 || c < 0.2) {
            System.out.println("One is tiny");
        }

    }
}
