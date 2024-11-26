import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");



        //Variável de memória -> espaço na memoria RAM que guarda uma informação

        String name;
        int idade;
        System.out.println("Digite seu nome: ");
        name = sc.nextLine(); //leitura de uma string no terminal
        System.out.println("Boa noite! " + name + "\nbem vindo ao Shift java!!");

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("");
    }
}
