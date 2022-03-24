package capitulo3;
// Usa múltiplas variáveis de controle em um laço for.
public class MultiLooVars {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j= 10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}
