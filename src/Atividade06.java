import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double res;

        System.out.print ("Informe o primeiro número: ");
        double n1 = scanner.nextDouble ();
        System.out.print ("Informe o segundo número: ");
        double n2 = scanner.nextDouble ();

        System.out.println ("Digite:\na) primeiro número elevado ao segundo\nb) raiz quadrada de cada um dos números\nc) raiz cúbica de cada um dos números");
        char opcao = scanner.next().toLowerCase().charAt(0);

        switch (opcao){
            case 'a':
                res = Math.pow (n1, n2);
                System.out.println ("O primeiro número elevado ao segundo é: "+res);
                break;
            case 'b':
                res = Math.sqrt (n1);
                System.out.println ("A raiz quadrada do primeiro é: "+res);
                res = Math.sqrt (n2);
                System.out.println ("A raiz quadrada do segundo é: "+res);
                break;
            case 'c':
                res = Math.cbrt (n1);
                System.out.println ("A raiz cúbica do primeiro é: "+res);
                res = Math.cbrt (n2);
                System.out.println ("A raiz cúbica do segundo é: "+res);
                break;
            default:
                System.out.println ("Opção inválida");
                break;
        }

        scanner.close ();
    }
}
