package capitulo3;
// Retira mais uma parte do laço for.
public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // move a inicialização ara fora do laço
        for (; i < 10;) {
            System.out.println("Pass #" + i);
            i++; // incrementa a variável de controle de laço
        }
    }
}
