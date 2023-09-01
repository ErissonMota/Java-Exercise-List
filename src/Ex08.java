
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();
        
        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();
        
        int duracao;
        
        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }
        
        System.out.println("A duração do jogo é de " + duracao + " horas.");
        
        scanner.close();
    }
}
