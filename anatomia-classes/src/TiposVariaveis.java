import java.sql.Date;

public class TiposVariaveis {
    public static void main(String[] args) {
        
        
        byte byteNumber = 127; //1 byte
        short shortNumber = 32767; //2 bytes
        int intNumber = 2147483647; //4 bytes
        long longNumber = 92233720368545864L; //8 bytes
        float floatNumber = 654654F; //4 bytes
        double doubleNumber = 654654656.54; //8 bytes
        boolean isEmpty = true;

        double salarioMinimo = 2500; //e nao 2.500

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 1;
        numero =10;
        System.out.println(numero);


        final int NUMERO_CONST = 25; 

        System.out.println(NUMERO_CONST);

    }
}
