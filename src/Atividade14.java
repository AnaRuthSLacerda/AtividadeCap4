import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        double novoSalario;

        if (salarioAtual <= 300.0) {
            novoSalario = salarioAtual + (salarioAtual * 0.50);
        } else if (salarioAtual > 300.0 && salarioAtual <= 500.0) {
            novoSalario = salarioAtual + (salarioAtual * 0.40);
        } else if (salarioAtual > 500.0 && salarioAtual <= 700.0) {
            novoSalario = salarioAtual + (salarioAtual * 0.30);
        } else if (salarioAtual > 700.0 && salarioAtual <= 800.0) {
            novoSalario = salarioAtual + (salarioAtual * 0.20);
        } else if (salarioAtual > 800.0 && salarioAtual <= 1000.0) {
            novoSalario = salarioAtual + (salarioAtual * 0.10);
        } else {
            novoSalario = salarioAtual + (salarioAtual * 0.05);
        }

        System.out.println("Novo Salário: R$ " + novoSalario);

        scanner.close();
    }
}
