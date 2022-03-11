package capitulo1;

/* Este programa ilustra as diferenças
   entre int e double.
   
   Chame este arquivo de Example3.java*/
class Example3 {
    public static void main(String[] args) {
        int w; // esta instrução declara uma variável int
        double x; // esta instrução declara uma variável de ponto flutuante

        w = 10; // atrubui a w o valor 10

        x = 10.0; // atribui a x o valor 10,0

        System.out.println("Original value of w: " + w);
        System.out.println("Original value of x: " + x);

        System.out.println(); // exibe uma linha em branco

        // agora, divide as duas por 4

        w = w / 4;
        x = x / 4;

        System.out.println("w after division: " + w);
        System.out.println("x after division: " + x);
    }
}