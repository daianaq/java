package Lista2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, impares = 0, pares = 0;

		do {
			System.out.println("Informe um número ou -1 para sair: ");
			n = sc.nextInt();
			if ((n % 2 == 0) && (n > 0)) {
				pares++;
			} else 
				if((n % 2 != 0) && (n > 0)){
				impares++;
			}else {
				System.out.println("Informe um número maior que zero.");
			}
		} while (n != -1);

		System.out.println("Quantidade de números pares digitados: " + pares);
		System.out.println("Quantidade de números ímpares digitados: " + impares);

		sc.close();
	}
}