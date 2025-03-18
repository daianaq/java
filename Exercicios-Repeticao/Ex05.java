package Lista2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, menor = -1;

		System.out.println("Informe um número: ");
		n = sc.nextInt();

		if ((n == 0) || (n < 0)) {
			System.out.println("O número deve ser maior que 0.");
		} else {
			menor = n;
			do {
				System.out.println("Informe um número ou 0 para sair: ");
				n = sc.nextInt();
				if ((n < menor) && (n > 0)) {
					menor = n;
				}
			} while (n != 0);
			System.out.println("O menor valor positivo digitado foi: " + menor);
		}

		sc.close();
	}
}