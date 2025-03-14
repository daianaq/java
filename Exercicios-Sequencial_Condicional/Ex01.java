package Lista1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int numeroUm, numeroDois, resultado;
        
        System.out.print("Informe o primeiro número: ");
        numeroUm = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        numeroDois = sc.nextInt();
        
        resultado = numeroUm+numeroDois;
        
        System.out.print(numeroUm+" + "+numeroDois+" = "+resultado);
        
    	sc.close();
	}

}
