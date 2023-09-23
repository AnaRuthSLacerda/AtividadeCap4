import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double salario, novoSalario;

        System.out.print ("Informe seu salário: ");
        salario = scanner.nextDouble ();

        if (salario <= 300){
            novoSalario = salario + (salario * 0.35);
        }else {
            novoSalario = salario + (salario * 0.15);
        }

        System.out.println ("O seu novo salário é R$"+novoSalario);

        scanner.close ();
    }
}
