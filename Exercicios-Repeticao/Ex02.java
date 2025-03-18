package Lista2;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 0, resultado;
        
        System.out.println("Informe o número da tabuada desejada: ");
        int n = sc.nextInt();
                
        while (i <= 10) {
            resultado = i * n;
            System.out.println(n + " X " + i + " = " + resultado);
            i++;
        }

        sc.close();
    }
}
