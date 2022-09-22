package segunda.aula;

import java.util.Scanner;

public class Condicionais {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite a primeira nota: ");
        float nota = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota2 = sc.nextFloat();

        float media = nota + nota1 + nota2 / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 4) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
