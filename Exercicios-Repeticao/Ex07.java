package Lista2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, fatorial = 1;

		System.out.println("Informe o número para calcular o fatorial:");
		n = sc.nextInt();

		while (n > 1) {
			fatorial *= n;
			n--;
		}

		System.out.println("O fatorial é " + fatorial);

		sc.close();
	}
}