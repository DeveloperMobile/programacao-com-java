package capitulo1.exercicio;
/* Tente isto 1-2

 * Este programa exibe uma tabela de conversões
   de polegadas em metros.

   Chame-o de "InchToMeterTable.java".
*/
public class InchToMeterTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;

        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // converte para metros
            System.out.println(inches + " inches is " +
                                 meters + " meters.");

            counter++;
            // a cada 12 linhas, exibe uma linha em branco
            if (counter == 12) {
                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }
}
