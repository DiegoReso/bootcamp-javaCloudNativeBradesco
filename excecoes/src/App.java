
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite sua altura");
            double altura  = scanner.nextDouble();

            System.out.println("Ola " + nome + " sua idade eh " + idade + " e sua altura eh " + altura + " !");
        } catch (InputMismatchException e) {
            System.out.println("a idade e altura precisam ser numericos");
        }

        scanner.close();

        try {
            String cepFormatado = formatarCep("23456064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras de negocio");
        }
        
    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "23456-064";
    }
}
