import java.util.Scanner;

public class CotaçãoDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double doacao, cotacao;

        System.out.println("Qual o valor da doação em dolar($)");
        doacao = sc.nextDouble();

        System.out.println("qual o custo de conversão do Dolar?");
        cotacao = sc.nextDouble();

        double valorReal = doacao * cotacao;

        System.out.println("O valor da doação é R$" + valorReal);
    }
}
