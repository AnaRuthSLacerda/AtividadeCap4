import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Informe a senha: ");
        int senha = scanner.nextInt ();

        switch (senha){
            case 4531:
                System.out.println ("Acesso permitido!");
            break;
            default:
                System.out.println ("Acesso negado!");
        }

    }
}
