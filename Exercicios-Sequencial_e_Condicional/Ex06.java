package Lista1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, parteUm, parteDois, parteTres, numeroI;

		System.out.println("Informe um número de 3 algarismo: ");
		numero = sc.nextInt();

		parteUm = numero / 100;
		parteDois = (numero / 10) % 10;
		parteTres = numero % 10;

		numeroI = (parteTres * 100) + (parteDois * 10) + parteUm;

		System.out.println("O número " + numero + " inverto é: " + numeroI);

		sc.close();
	}

}
