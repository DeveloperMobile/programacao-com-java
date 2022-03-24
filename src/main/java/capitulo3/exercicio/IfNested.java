package capitulo3.exercicio;

public class IfNested {
    public static void main(String[] args) {
        int idade = 26;
        if (idade < 18) {
            System.out.println("Não pode beber e nem tirar carta.");
        } else if (idade < 21) {
            System.out.println("Pode meber mas, não pode tirar carta.");
        } else if (idade < 25) {
            System.out.println("Pode beber e tirar carta");
        } else {
            System.out.println("Está tudo liberado");
        }
    }
}
