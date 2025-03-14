package Lista1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroUm, numeroDois, maior = 0, menor = 0;

		System.out.println("Informe o 1º número: ");
		numeroUm = sc.nextInt();

		System.out.println("Informe o 2º número: ");
		numeroDois = sc.nextInt();

		if (numeroUm > numeroDois) {
			maior = numeroUm;
			menor = numeroDois;
		} else {
			if (numeroUm < numeroDois) {
				maior = numeroDois;
				menor = numeroUm;
			} else {
				System.out.println("Os números são iguais.");
			}
		}

		System.out.println("Ordem ascendente: " + maior + " - " + menor);

		sc.close();
	}

}
