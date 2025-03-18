package Lista2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		boolean primo = true;
		
		System.out.println("Informe um número para descobrir se ele é primo ou não: ");
		n = sc.nextInt();
		
		if (n <= 1) {
			primo = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					primo = false;
				}
			}
		}

		if (primo) {
			System.out.println("O número " + n + " é primo.");
		} else {
			System.out.println("O número " + n + " não é primo.");
		}

		sc.close();
	}
}