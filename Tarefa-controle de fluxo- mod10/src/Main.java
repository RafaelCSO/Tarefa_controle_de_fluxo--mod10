import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira nota do primeiro trimestre");
        double nota1 = s.nextDouble();
        System.out.println("Insira nota do segundo trimestre");
        double nota2 = s.nextDouble();
        System.out.println("Insira nota do terceiro trimestre");
        double nota3 = s.nextDouble();
        System.out.println("Insira nota do quarto trimestre");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}