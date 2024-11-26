import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Insira o primeiro valor: ");

        valor1 = sc.nextInt();

        System.out.println("insira o segundo valor: ");

        valor2 = sc.nextInt();

        int soma = valor1+valor2;
        int sub = valor1-valor2;
        double div = ( double) valor1/( double) valor2;
        int mult = valor1*valor2;

        System.out.println("Segue o resultado da soma dos valores: " + soma);
        System.out.println("segue o resultado da Subtração dos valores: " + sub);
        System.out.println("segue o resultado da Divisão dos valores: " + div);
        System.out.println("segue o resultado da Multiplicação dos valores: " + mult);


        sc.close();
    }
}
