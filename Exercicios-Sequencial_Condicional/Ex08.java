package Lista1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double altura, pesoIdeal = 0;
		char sexo;

		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();

		System.out.println("Informe seu sexo (f-feminino ou m-masculino): ");
		sexo = sc.next().charAt(0);

		if (sexo == 'f') {
			pesoIdeal = (62.1 * altura) - 44.7;
		}else {
			if(sexo == 'm'){
				pesoIdeal = (72.7 * altura) - 44.7;
			}else {
				System.out.println("Caracter inválido.");
			}
		}

		System.out.printf("Seu peso ideal é: %.2f\n", pesoIdeal);
		
		sc.close();
	}

}
