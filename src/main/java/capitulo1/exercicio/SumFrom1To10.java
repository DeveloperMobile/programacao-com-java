package capitulo1.exercicio;

/* Este programa calcula e exibe a soma dos 10 primeiros inteiros
   positivos */
class SumFrom1To10 {
    public static void main(String[] args) {
        int sum, i;
        sum = 0;
        for (i = 1; i <= 10; i++)
            sum = sum + i;
        System.out.println("The sum is " + sum);
    }
}
