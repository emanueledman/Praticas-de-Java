package Modulo2;

import java.util.*;

public class Soma {
    public static int soma(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Informe o valor de a");
        int a = iScanner.nextInt();

        System.out.println("Informe o valor de b");
        int b = iScanner.nextInt();

        int res = soma(a, b);

        System.out.println("A soma entre " + a + " e " + b + " é " + res);
    }

}
