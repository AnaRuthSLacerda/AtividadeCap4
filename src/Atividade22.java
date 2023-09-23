import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Informe sua idade: ");
        int idade = scanner.nextInt ();

        System.out.print ("Informe seu peso: ");
        double peso = scanner.nextDouble ();

        int grupoDeRisco;

        if (idade <=20){
            if(peso <= 60){
                grupoDeRisco = 9;
            } else if (peso > 60 && peso <=90) {
                grupoDeRisco = 8;
            }else {
                grupoDeRisco = 7;
            }
        } else if (idade <=50) {
            if (peso <=60){
                grupoDeRisco = 6;
            } else if (peso > 60 && peso <=90) {
                grupoDeRisco = 5;
            }else {
                grupoDeRisco = 4;
            }
        }else {
            if (peso <= 60){
                grupoDeRisco = 3;
            } else if (peso > 60 && peso <=90) {
                grupoDeRisco = 2;
            }else {
                grupoDeRisco = 1;
            }
        }
        System.out.println ("Você faz parte do grupo de risco "+grupoDeRisco);

        scanner.close ();
    }
}
