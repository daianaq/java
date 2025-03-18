package Lista2;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, soma = 1, aux1 = 0, aux2 = 1;

		System.out.println("Informe o número de termos da sequência de Fibonacci que deseja gerar:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(soma + " ");
			soma = aux1 + aux2;
			aux1 = aux2;
			aux2 = soma;
		}

		sc.close();
	}
}