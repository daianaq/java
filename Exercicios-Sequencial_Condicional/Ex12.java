package Lista1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroUm, numeroDois, numeroTres, maior;

		System.out.println("Informe o 1º número: ");
		numeroUm = sc.nextInt();

		System.out.println("Informe o 2º número: ");
		numeroDois = sc.nextInt();

		System.out.println("Informe o 3º número: ");
		numeroTres = sc.nextInt();

		maior = numeroUm;
		
		if ((numeroUm > numeroDois) && (numeroUm > numeroTres)) {
			maior = numeroUm;
		} else {
			if ((numeroDois > numeroUm) && (numeroDois > numeroTres)) {
				maior = numeroDois;
			} else {
				if ((numeroTres > numeroUm) && (numeroTres > numeroDois)) {
					maior = numeroTres;
				}
			}
		}

		System.out.println("O maior é: " + maior);

		sc.close();
	}

}