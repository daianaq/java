package Lista2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, soma = 0;

		System.out.print("Informe o valor de a: ");
		a = sc.nextInt();
		System.out.print("Informe o valor de b: ");
		b = sc.nextInt();

		if (a >= b) {
			System.out.println("O valor de A deve ser menor que o de B.");
		} else {
			for (int i = a + 1; i < b; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
			System.out.println("A soma dos números ímpares no intervalo de " + a + " até " + b + " = " + soma);
		}

		sc.close();
	}
}