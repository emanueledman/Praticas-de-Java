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
                case 2:
                    System.out.println("Informe o valor da base");
                    int bas = 1; 
                    int base = input.nextInt();
                    System.out.println("Informe o valor da potencia");
                    int pot = input.nextInt();
                    while (pot > 0) {
                        bas *= base;
                        pot--;
                    }
                    System.out.println("A potencia e : " + bas);
                case 3:
                    System.out.println("informe o numero");
                    int p = input.nextInt();
                    while(n != 0)
                    {
                        n /= 10;
                    }
                default:
                    break;
            }
        } while (n >= 4 || n <= 1);
    }
}
