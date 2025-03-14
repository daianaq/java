package Lista1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int nUm = sc.nextInt();
		System.out.println("Informe a opereção: ");
		char operacao = sc.next().charAt(0);
		System.out.println("Informe o segundo número: ");
		int nDois = sc.nextInt();

		double resultado = 0;

		switch (operacao) {
		case '+':
			resultado = nUm + nDois;
			break;
		case '-':
			resultado = nUm - nDois;
			break;
		case '*':
			resultado = nUm * nDois;
			break;
		case '/':
			resultado = nUm / nDois;
			break;
		default:
			System.out.println("Operação inválida.");
		}
		System.out.println(nUm + " " + operacao + " " + nDois + " = " + resultado);
		sc.close();
	}

}
