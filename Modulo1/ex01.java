package Modulo1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = iScanner.nextLine();

        System.out.println("Informe a Suaidade");
        int id = iScanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ id);
    }
}
