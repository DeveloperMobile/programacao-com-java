package capitulo1.exercicio;

public class FahrToCels {
    public static void main(String[] args) {
        double f, ce;

        f = 62;
        ce = (f - 32) * 5.0/9.0;

        System.out.println(f + " degrees Fahrenheit is " +
                ce + " degress Celsius.");
    }
}
