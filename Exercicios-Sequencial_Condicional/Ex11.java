package Lista1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe um número: ");
		numero = sc.nextInt();

		if(numero%2==0) {
			System.out.println("O número "+numero+" é par.");
		}else {
			System.out.println("O número "+numero+" é ímpar.");
		}
		
		sc.close();
	}

}
