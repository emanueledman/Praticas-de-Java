package Modulo1;

import java.util.*;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Informe o primeiro numeo");
                    int n1 = input.nextInt();

                    System.out.println("Informe o segundo numero");
                    int n2 = input.nextInt();
                    System.out.println("A soma é: " + (n1 + n2));
                    break;
            
                default:
                    break;
            }
        } while (n >= 4 || n <= 1);
    }
}
