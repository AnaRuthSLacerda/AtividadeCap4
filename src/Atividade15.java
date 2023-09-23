import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de investimento (1 para Poupança, 2 para Fundos de renda fixa): ");
        int tipoInvestimento = scanner.nextInt();

        System.out.println("Digite o valor do investimento: ");
        double valorInvestimento = scanner.nextDouble();

        double rendimentoMensal;

        if (tipoInvestimento == 1) {
            rendimentoMensal = 0.03;
        } else if (tipoInvestimento == 2) {
            rendimentoMensal = 0.04;
        } else {
            rendimentoMensal = 0;
            System.out.println("Tipo de investimento inválido.");
        }

        double valorCorrigido = valorInvestimento * (1 + rendimentoMensal);

        System.out.println("Valor Corrigido após um mês de investimento: R$ " + valorCorrigido);

        scanner.close();
    }
}
