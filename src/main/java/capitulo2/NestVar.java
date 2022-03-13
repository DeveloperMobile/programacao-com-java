package capitulo2;
/*
  Este programa tenta declarar uma variável
  em um escopo interno com o mesmo nome de uma
  definida em um escopo esterno.

  *** O programa não será compilado. ***
*/
public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);
            //int count; // inválido!!!

            for (count = 0; count < 2; count++) {
                System.out.println("This program is in error!");
            }
        }
    }
}
