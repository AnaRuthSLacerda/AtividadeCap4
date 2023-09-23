import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Informe a idade do nadador: ");
        int idade = scanner.nextInt ();

        if (idade < 5){
            System.out.println ("Não categorizado");
        } else if (idade >= 5 && idade <= 7) {
            System.out.println ("Categoria: Infantil");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println ("Categoria: Juvenil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println ("Categoria: Adolescente");
        } else if (idade >= 16 && idade <= 30) {
            System.out.println ("Categoria: Adulto");
        }else {
            System.out.println ("Categoria: Sênior");
        }

        scanner.close ();
    }
}
