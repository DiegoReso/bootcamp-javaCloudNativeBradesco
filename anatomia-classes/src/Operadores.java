public class Operadores {
    public static void main(String[] args) {
        String concatenacao;

        concatenacao = 1 + 1 + 1 + 1 +"1";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 +  "1" + 1;
        
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 +1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 +1);

        System.out.println(concatenacao);

        int a = 10;
        int b = 3;

        int soma  = a + b;
        System.out.println(soma);

        int subtracao = a - b;
        System.out.println(subtracao);

        int multiplicacao = a * b;
        System.out.println(multiplicacao);

        double divisao  = a / b;
        System.out.println(divisao);

        double modulo = a % b;
        System.out.println(modulo);

        
        int numeroPositivo = 5;
        //tornando numero negativo
        numeroPositivo = - numeroPositivo;
        System.out.println(numeroPositivo);

        //tornando numero positivo
        numeroPositivo = numeroPositivo * -1;
        System.out.println(numeroPositivo);

        //incrementar numero
        int incremento = 5;
        incremento++;
        System.out.println(incremento);
        //imprimindo o incremento antecipando, sem necessidade de incrementar antes fora do print
        System.out.println( ++ incremento);


        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);


        //operador ternario e operador relacional com numero
        int c = 5;
        int d  = 5;
        String resultado = c == d ? "igual" : "diferente";
        System.out.println(resultado);

        resultado = c != d ? "diferente" : "igual";
        System.out.println(resultado);

        resultado = c > d ? "eh maior" : "nao eh maior";
        System.out.println(resultado);

        resultado = c < d ? "eh maior" : "Nao eh Menor";
        System.out.println(resultado);

        //operador ternario com String
        String nomeDiegoString = "Diego";
        String nomeDiego2String = "Diego";
        String nomeDiegoObjeto = new String("Diego");

        String resultadoNome = nomeDiegoObjeto.equals(nomeDiegoString) ? "Nomes iguais" : "Nomes nao sao iguais";
        System.out.println(resultadoNome);

        resultadoNome = nomeDiego2String == nomeDiegoString ? "Nomes iguais" : "Nomes nao sao iguais";
        System.out.println(resultadoNome);

        //logicos

        if(c == d || a < b){
            System.out.println("Alguma condicao precisa ser verdadeira");
        }else{
            System.out.println("As duas condicoes sao falsas");
        }

        if(c == d && a > b){
            System.out.println("As duas condicoes precisam ser verdadeiras");
        }else{
            System.out.println("Alguma condicao nao eh verdadeira");
        }
        
    }

}
