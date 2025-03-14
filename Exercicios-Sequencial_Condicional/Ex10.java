package Lista1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;
		String categoria = null;

		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();

		if ((idade >= 8) && (idade <= 10)) {
			categoria = "infantil";
		} else {
			if ((idade >= 11) && (idade <= 13)) {
				categoria = "juvenil A";
			} else {
				if ((idade >= 14) && (idade <= 17)) {
					categoria = "juvenil B";
				} else {
					if (idade >= 18) {
						categoria = "sênior";
					}else {
						System.out.println("A idade tem que ser superior a 7.");
					}
				}
			}

		}
		System.out.println("A categoria do nadador é " + categoria);

		sc.close();
	}

}