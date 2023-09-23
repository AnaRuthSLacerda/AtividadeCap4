import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double n1, n2, n3;

        System.out.print ("Informe o primeiro número: ");
        n1 = scanner.nextDouble ();
        System.out.print ("Informe o segundo número: ");
        n2 = scanner.nextDouble ();
        System.out.print ("Informe o terceiro número: ");
        n3 = scanner.nextDouble ();

        double maior = n1;

        if (n2 > maior){
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println ("O maior número dentre os três que você citou é: "+maior);

        scanner.close ();
    }

}
