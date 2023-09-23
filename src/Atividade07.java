import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double salario, novoSalario;

        System.out.print ("Informe o seu salário total: ");
        salario = scanner.nextDouble();

        if (salario < 500) {
            novoSalario = salario + (salario * 0.30);
            System.out.println ("Você tem direito ao aumento de 30%");
            System.out.println ("Seu novo salário é de R$"+novoSalario);
        }else {
            System.out.println ("Você não tem direito ao aumento");
        }

        scanner.close ();
    }
}
