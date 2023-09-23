import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double saldo, credito;

        System.out.print ("Informe o saldo médio: ");
        saldo = scanner.nextDouble ();

        if (saldo <= 200.0) {
            credito = saldo * 0.10;
        } else if (saldo <= 300.0) {
            credito = saldo * 0.20;
        } else if (saldo <= 400.0) {
            credito = saldo * 0.25;
        } else {
            credito = saldo * 0.30;
        }

        System.out.println("Saldo Médio: R$ " + saldo);
        System.out.println("Valor do Crédito Especial: R$ " + credito);

        scanner.close();
    }
}
