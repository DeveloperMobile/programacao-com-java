package capitulo1.exercicio;

public class Pow {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 20; i++) {
            int valor = (int) Math.pow(i, 2);
            total += valor;
            System.out.println("Quadrado de " + i + " : " + valor);
        }

        System.out.println("Soma dos Quadrados é: " + total);
        System.out.println("A média dos Quadrados é: " + (total / 20));
    }
}
