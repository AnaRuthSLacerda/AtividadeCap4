import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco, novoPreco; int aumento; String classificacao;

        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        if (preco <= 50.0) {
            aumento = 5;
        } else if (preco > 50.0 && preco <= 100.0) {
            aumento = 10;
        } else {
            aumento = 15;
        }

        novoPreco = preco + (preco * aumento / 100);

        if (novoPreco <= 80.0) {
            classificacao = "Barato";
        } else if (novoPreco <= 120.0) {
            classificacao = "Normal";
        } else if (novoPreco <= 200.0) {
            classificacao = "Caro";
        } else {
            classificacao = "Muito caro";
        }

        System.out.println("Novo Preço: R$ " + novoPreco);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
