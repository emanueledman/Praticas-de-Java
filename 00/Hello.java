
import java.util.Scanner;

public class Hello {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        char n = 65;
        char l = (char) n;
        System.out.println("Valor: " + nome);
        input.close();
    }
}
