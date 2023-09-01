import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        double menorValor, maiorValor;
        
        if (valor1 < valor2) {
            menorValor = valor1;
            maiorValor = valor2;
        } else {
            menorValor = valor2;
            maiorValor = valor1;
        }
        
        System.out.println("Valores em ordem crescente: " + menorValor + ", " + maiorValor);
        
        scanner.close();
    }
}
