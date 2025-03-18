package Lista2;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Informe um número para calcular seus divisores: ");
        n = sc.nextInt();

        if (n > 0) {
            System.out.print("Os divisores de " + n + " são: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Informe um número inteiro positivo.");
        }

        sc.close();
    }
}
