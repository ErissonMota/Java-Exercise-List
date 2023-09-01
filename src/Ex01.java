import java.util.Scanner;

/*Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, 
  caso contrário 
  escrever NÃO É MAIOR QUE 10! */

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        
        scanner.close();
    }
}