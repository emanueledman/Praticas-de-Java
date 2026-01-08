package Modulo1;

import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        while (n > 0){
            if (n%2 != 0)
            {
                System.out.println("Numero: " + n);
            }
            n--;
        }
    }
}
