import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println(" insira o segundo numero: ");
        num2 = leitor.nextInt();

        //processamento

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        // Isso é um cast
        double divisao = (double)num1 / num2;


        System.out.println("O resultado das operações são: " + soma
                            + " é o resultado da soma, " + subtracao
                            + " é o resultado da subtração, " + multiplicacao
                            + " é o resultado da multiplicação, " + divisao
                            + " é o resultado da divisão.");
    }
}
