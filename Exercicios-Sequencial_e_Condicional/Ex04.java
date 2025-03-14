package Lista1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double acervo, totalFitasP, totalFitasI, fitasNaLojaP, fitasNaLojaI, qtdFitasComClientesP, qtdFitasComClientesI,
				percentualComClientes;

		System.out.println("Informe o total de acervo de fitas existente" + "(Será divididas igualmente):");
		acervo = sc.nextDouble();

		totalFitasP = (int) (acervo / 2);
		totalFitasI = (int) (acervo / 2);

		System.out.println("Informe quantas fitas existem no momento na loja de" + "Pituba:");
		fitasNaLojaP = sc.nextDouble();
		System.out.println("Informe quantas fitas existem no momento na loja de" + "Itapuã:");
		fitasNaLojaI = sc.nextDouble();

		qtdFitasComClientesP = totalFitasP - fitasNaLojaP;
		qtdFitasComClientesI = totalFitasI - fitasNaLojaI;
		percentualComClientes = ((qtdFitasComClientesP + qtdFitasComClientesI) / (totalFitasP + totalFitasI)) * 100;

		System.out.println("A quantidade de fitas com os clientes da Pituba é:" + " " + (int) qtdFitasComClientesP);
		System.out.println("A quantidade de fitas com os clientes de Itapuã é:" + " " + (int) qtdFitasComClientesI);
		System.out.printf("O percentual total de fitas com clientes é: %.2f%%\n", percentualComClientes);

		sc.close();
	}

}
