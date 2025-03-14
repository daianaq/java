package Lista1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, parteUm, parteDois, soma, quadrado;

		System.out.println("Informe um número com 4 algarismo: ");
		numero = sc.nextInt();

		parteUm = numero / 100;
		parteDois = numero % 100;
		soma = parteUm + parteDois;
		quadrado = soma * soma;

		if (numero == quadrado) {
			System.out.println("Esse número possui essa propriedade");
		} else {
			System.out.println("Esse número não possui essa propriedade");
		}

		sc.close();
	}

}
