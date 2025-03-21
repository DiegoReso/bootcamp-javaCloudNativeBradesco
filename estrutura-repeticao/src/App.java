import java.util.Random;

public class App {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 5.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
        }
        System.out.println(saldo);    
       

        int nota  = 8;

        if(nota >= 7){
            System.out.println("Aluno aprovado");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Aluno em recuperacao");
        }else{
            System.out.println("Aluno reprovado");
        }


        String sigla = "C";

        switch (sigla) {
            case "P":
                System.out.println("A Sigla eh P");
                break;
            case "C":
                System.out.println("A sigla eh C");
                break;
            default:
                System.out.println("Nem um nem outro");
                break;
        }
         
        //contando carneirinhos

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }
        System.out.println("Joaozinho dormiu!");

        String alunos[] = {"Diego", "Cailania", "Roscana"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno da vez foi: " + alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println("O aluno da vez com foreach: " + aluno);
        }

        for (int i = 0; i < 10; i++) {
            if(i == 3){
                continue;
            }

            System.out.println("Iteracao: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if(i == 3){
                break;
            }

            System.out.println("Iteracao: " + i);
        }

        int j = 0;
        while (j <= 10  ) {
            System.out.println("Iteracao while: " + j);
            j++;
        }

        int k = 0;

        do {
            System.out.println("Iteracao do While");
            k++;
        } while (k < 1);

        

        do {
            System.out.println("Ligando para o Joao");
        } while (tocando());

    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }

    
}
