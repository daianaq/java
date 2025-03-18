package Lista2;

public class Ex08 {

    public static void main(String[] args) {

        double numerador = 1, denominador = 1, resultado = 0;

        for (int i = 1; i <= 50; i++) {
            resultado += numerador / denominador;
            numerador += 2;  
            denominador++; 
        }

        System.out.println("O valor de H é: " + resultado);
    }
}