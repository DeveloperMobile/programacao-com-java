package capitulo3;
// Exibe as raízes quadradas de 1 a 99.
public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num +
                    " is " + sroot);
        }
    }
}
