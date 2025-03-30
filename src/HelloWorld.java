import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // Conceito basico de programação são 3 comandos Entrada - saida e processamento
        // .Jar é o Bytecode ou seja é o arquivo binario

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");
        System.out.println("boa tarde! \nVamos pegar essa certificação e melhorar nosso currículo Pedro!!!! ");

        //Variável de memória -> espaço na memória RAM que guarda uma informação
        String name;
        int idade;
        System.out.println("Digite seu nome: ");
        name = sc.nextLine(); //leitura de uma string no terminal
        System.out.println("Boa noite! " + name + "\nbem vindo ao Shift FIAP java Expert!!");

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("" + idade);
    }
}
