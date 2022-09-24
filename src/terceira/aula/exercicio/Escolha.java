package terceira.aula.exercicio;

import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) {
        System.out.println("Escolha uma opção de pagamento: ");
        System.out.println("1- Dinheiro");
        System.out.println("2- Cartão de crédito");
        System.out.println("3- Cartão de débito");
        System.out.println("4- A prazo");
        System.out.println("5- Pix");


        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        sc.close();

        FormaDePagamento es = FormaDePagamento.values()[--escolha];

        switch (es) {
            case DINHEIRO:
                System.out.println("A forma de pagamento escolhida foi dinheiro");
                break;
            case CARTAO_DE_CREDITO:
                System.out.println("A forma de pagamento escolhida foi cartão de crédito");
                break;
            case CARTAO_DEBITO:
                System.out.println("A forma de pagamento escolhida foi cartão de débito");
                break;
            case A_PRAZO:
                System.out.println("A forma de pagamento escolhida foi a prazo");
                break;
            case PIX:
                System.out.println("A forma de pagamento escolhida foi pix");
                break;
        }
    }
}
