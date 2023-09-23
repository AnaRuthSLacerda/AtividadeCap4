import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double n1, n2, n3, n4, media;

        System.out.print ("Informe a primeira nota: ");
        n1 = scanner.nextDouble ();
        System.out.print ("Informe a segunda nota: ");
        n2 = scanner.nextDouble ();
        System.out.print ("Informe a terceira nota: ");
        n3 = scanner.nextDouble ();
        System.out.print ("Informe a quarta nota: ");
        n4 = scanner.nextDouble ();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println ("Sua média é: "+media);

        if (media >= 7){
            System.out.println ("Você foi aprovado! " +media);
        } else {
            System.out.println ("Você foi reprovado! "+media);
        }

        scanner.close ();
    }
}
