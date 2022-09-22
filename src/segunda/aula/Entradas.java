package segunda.aula;

import java.util.Scanner;

public class Entradas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite seu peso: ");
        float peso = sc.nextFloat();
        sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite seu estado: ");
        String estado = sc.nextLine();

        System.out.printf("A idade do(a) %s é %d anos, ele(a) mora em %s, estado de(o) %s e pesa %.2f kilos.", nome, idade, cidade, estado, peso);
        sc.close();
    }
}
