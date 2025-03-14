package Lista1;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioFixo = 1518.00, salario, imposto = 0, salarioComImposto = 0;

		System.out.print("Informe seu salário: ");
		salario = sc.nextDouble();

		if (salario <= salarioFixo * 3) {
			imposto = (salario * 10) / 100;
		} else if (salario <= salarioFixo * 10) {
			imposto = (salario * 20) / 100;
		} else {
			imposto = (salario * 30) / 100;
		}

		salarioComImposto = salario - imposto;

		System.out.printf("Seu salário: R$ %.2f\n", salario);
		System.out.printf("Imposto: R$ %.2f\n", imposto);
		System.out.printf("Seu salário com imposto: R$ %.2f\n", salarioComImposto);

		sc.close();
	}
}
