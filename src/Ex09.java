import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int horasSemanais = 40;
        final int semanasPorMes = 4;
        final double taxaHoraExtra = 1.5; // Acréscimo de 50% para horas extras
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        double salarioTotal;
        
        if (horasTrabalhadas <= horasSemanais * semanasPorMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            double horasNormais = horasSemanais * semanasPorMes;
            double horasExtras = horasTrabalhadas - horasNormais;
            double salarioNormal = horasNormais * salarioPorHora;
            double salarioHoraExtra = horasExtras * salarioPorHora * taxaHoraExtra;
            salarioTotal = salarioNormal + salarioHoraExtra;
        }
        
        System.out.println("Salário total do funcionário: R$ " + salarioTotal);
        
        scanner.close();
    }
}

