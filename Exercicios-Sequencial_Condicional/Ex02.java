package Lista1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double postoUm, postoDois, postoTres, mediaPostos;

		System.out.print("Informe o preço do 1º posto: R$");
		postoUm = sc.nextDouble();
		System.out.print("Informe o preço do 2º posto: R$");
		postoDois = sc.nextDouble();
		System.out.print("Informe o preço do 3º posto: R$");
		postoTres = sc.nextDouble();
		
		mediaPostos = (postoUm + postoDois + postoTres)/3;
		
		System.out.printf("A média dos três postos é: R$ %.2f\n", mediaPostos);
	
		sc.close();
	}

}
