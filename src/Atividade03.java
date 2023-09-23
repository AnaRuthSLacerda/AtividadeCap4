import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double n1, n2;

        System.out.print ("Informe o primeiro número: ");
        n1 = scanner.nextDouble ();
        System.out.print ("Informe o segundo número: ");
        n2 = scanner.nextDouble ();

        if (n1<n2){
            System.out.println (n1);
        } else if (n2<n1) {
            System.out.println (n2);
        }else {
            System.out.println ("Os números que você informou são iguais");
        }

        scanner.close ();
    }
}
