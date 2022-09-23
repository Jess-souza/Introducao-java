package terceira.aula;

import java.util.Scanner;

public class SwitchCaseEnum {
    public static void main(String[] args) {
        System.out.println("Informe uma linguagem");
        Scanner sc = new Scanner(System.in);
        String entradaDados = sc.next();
        sc.close();

        entradaDados = entradaDados.toUpperCase();
        Linguagem lg = Linguagem.valueOf(entradaDados);

        switch (lg) {
            case JAVA:
            case KOTLIN:
                System.out.println("A linguagem é compilada");
                break;
            case PHP:
            case JAVASCRIPT:
                System.out.println("A versão é interpretada");
                break;
            default:
                System.out.println("A linguagem não foi encontrada");
        }
    }
}
