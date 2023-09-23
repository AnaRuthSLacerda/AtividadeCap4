import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double produto, divisao, media, diferenca;

        System.out.print ("Informe o primeiro número: ");
        double n1 = scanner.nextDouble ();
        System.out.print ("Informe o segundo número: ");
        double n2 = scanner.nextDouble ();

        System.out.println ("Insira 1 para realizar média entre os números digitados\n2 Diferença do maior pelo menor\n3 Produto entre os números digitados\n4 Divisão do primeiro pelo segundo(o segundo número deve ser diferente de zero)");
        int operacao = scanner.nextInt ();

        switch (operacao){
            case 1:
                media = (n1 + n2) / 2;
                System.out.println ("A média dos dois números é: "+media);
            break;
            case 2: if(n1 > n2){
                diferenca = n1 - n2;
            } else {
                diferenca = n2 - n1;
            }System.out.println ("A diferença dos números é: "+diferenca);
            break;
            case 3:
                produto = n1 * n2;
                System.out.println ("O produto entre os dois números é: "+produto);
            break;
            case 4:
                divisao = n1/n2;
                System.out.println ("A divisão do primeiro pelo segundo é: "+divisao);
            break;
            default:
                System.out.println ("Número inválido");
        }

    }
}
