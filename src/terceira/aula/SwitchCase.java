package terceira.aula;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Informe uma linguagem");
        Scanner sc = new Scanner(System.in);
        String linguagem = sc.next();
        sc.close();

        switch (linguagem) {
            case "JAVA":
                System.out.println("A versão é 17");
                break;
            case "KOTLIN":
                System.out.println("A versão é 11");
                break;
            case "PHP":
                System.out.println("A versão é 5");
                break;
            case "JAVASCRIPT":
                System.out.println("A versão é 2.2");
            default:
                System.out.println("A linguagem não foi encontrada");
                break;
        }
    }
}
