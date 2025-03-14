package Lista1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nUm, nDois;

        System.out.print("Informe o 1º número: ");
        nUm = sc.nextInt();

        System.out.print("Informe o 2º número: ");
        nDois = sc.nextInt();

        if (nDois == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } else if (nUm % nDois == 0) {
            System.out.println(nUm + " é um múltiplo de " + nDois);
        } else {
            System.out.println(nUm + " não é um múltiplo de " + nDois);
        }

        sc.close();
    }
}
