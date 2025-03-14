package Lista1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double real, dolar = 1.87, libra = 3.05, peso = 1.40, conversao = 0;
		int moeda;

		System.out.print("Informe um valor em reais: ");
		real = sc.nextDouble();

		System.out.println("Escolha a moeda para conversão: ");
		System.out.println("1 - Dólar.");
		System.out.println("2 - Libra.");
		System.out.println("3 - Peso.");
		moeda = sc.nextInt();

		switch (moeda) {
		case 1:
			conversao = real / dolar;
			System.out.printf("R$%.2f equivalem a US$%.2f\n", real, conversao);
			break;
		case 2:
			conversao = real / libra;
			System.out.printf("R$%.2f equivalem a £%.2f\n", real, conversao);
			break;
		case 3:
			conversao = real / peso;
			System.out.printf("R$%.2f equivalem a P$%.2f\n", real, conversao);
			break;
		default:
			System.out.println("Opção inválida.");
		}

		sc.close();
	}
}
