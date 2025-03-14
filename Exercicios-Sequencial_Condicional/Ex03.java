package Lista1;

public class Ex03 {

	public static void main(String[] args) {

		double totalFitasP = 2000, totalFitasI = 2000, fitasNaLojaP = 1620, fitasNaLojaI = 1710, qtdFitasComClientesP,
				qtdFitasComClientesI, percentualComClientes;

		qtdFitasComClientesP = totalFitasP - fitasNaLojaP;
		qtdFitasComClientesI = totalFitasI - fitasNaLojaI;
		percentualComClientes = ((qtdFitasComClientesP + qtdFitasComClientesI)/(totalFitasP + totalFitasI))*100;

		System.out.println("A quantidade de fitas com os clientes da Pituba é: "+qtdFitasComClientesP);
		System.out.println("A quantidade de fitas com os clientes de Itapuã é: "+qtdFitasComClientesI);
		System.out.println("O percentual total de fitas com clientes é: "+percentualComClientes+"%");

	}

}
