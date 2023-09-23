import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double percentAumento ,aumento, salario, novoSalario;

        System.out.print ("Informe o seu salário atual: ");
        salario = scanner.nextDouble ();

        if (salario <= 300){
            percentAumento = 0.15;
        } else if (salario > 300 && salario < 600) {
            percentAumento = 0.10;
        } else if (salario >= 600 && salario <= 900) {
            percentAumento = 0.05;
        }else {
            percentAumento = 0.0;
        }

        if (percentAumento > 0.0){
            aumento = salario * percentAumento;
            novoSalario = salario + aumento;
            System.out.println("Percentual de Aumento: " + (percentAumento * 100) + "%");
            System.out.println("Valor do Aumento: R$" + aumento);
            System.out.println("Novo Salário: R$" + novoSalario);
        }else {
            System.out.println ("Você não tem direito ao aumento");
        }

        scanner.close ();
    }
}
