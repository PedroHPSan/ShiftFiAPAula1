import java.util.Scanner;

public class ControleCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da kilometragem inicial ");
        int kmIni = sc.nextInt();
        System.out.println("Insira o valor da Kilometragem ao abastecer: ");
        int kmAba = sc.nextInt();
        System.out.println("Quantos litros foram abastecidos no carro? ");
        int abastecido = sc.nextInt();

        int media = (kmAba - kmIni)/ abastecido;

        System.out.println("A media de consumo do veiculo é: " + media + " Km por litro");
    }
}
