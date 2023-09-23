import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double n1, n2, media;

        System.out.print ("Informe a primeira nota: ");
        n1 = scanner.nextDouble ();
        System.out.print ("Informe a segunda nota: ");
        n2 = scanner.nextDouble ();

        media = (n1 + n2) / 2;

        System.out.println ("Sua média é: "+media);

        if (media <3){
            System.out.println ("Reprovado");
        } else if (media >=3 && media <7) {
            System.out.println ("Exame");
        }else {
            System.out.println ("Aprovado");
        }

        scanner.close ();
    }
}
