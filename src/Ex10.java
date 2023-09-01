import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = scanner.nextDouble();
        
        final double limiteComissao1 = 1500.0;
        final double taxaComissao1 = 0.03;
        final double taxaComissao2 = 0.05;
        
        double comissao;
        
        if (valorVendas <= limiteComissao1) {
            comissao = valorVendas * taxaComissao1;
        } else {
            double comissao1 = limiteComissao1 * taxaComissao1;
            double comissao2 = (valorVendas - limiteComissao1) * taxaComissao2;
            comissao = comissao1 + comissao2;
        }
        
        double salarioTotal = salarioFixo + comissao;
        
        System.out.println("Salário total do vendedor: R$ " + salarioTotal);
        
        scanner.close();
    }
}
