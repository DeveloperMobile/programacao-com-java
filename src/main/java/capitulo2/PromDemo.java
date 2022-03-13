package capitulo2;
// O inesperado em uma promoção!
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // Certo, não é necessária uma coerção

        b = 10;
        b = (byte) (b * b);

        System.out.println("i and b: " + i + " " + b);
    }
}
