import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double altura, pesoIdeal = 0;
        String sexo;

        System.out.print ("Informe sua altura: ");
        altura = scanner.nextDouble ();
        scanner.nextLine ();

        System.out.print ("Informe seu sexo: ");
        sexo = scanner.nextLine ().toLowerCase ();

        if(sexo.equals ("homem")){
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals ("mulher")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        }else {
            System.out.println ("Sexo inválido");
        }

        System.out.println ("Seu peso ideal é: "+pesoIdeal);

        scanner.close ();
    }
}
