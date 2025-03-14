package Lista1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double km, m;
		
		System.out.println("Informe a velocidade: ");
		km = sc.nextInt();
		
		m = km*3.6;
		
		System.out.println(km+"km/h são "+m+"m/s.");
		
		sc.close();
	}

}
