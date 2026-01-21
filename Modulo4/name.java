package Modulo4;
import java.util.ArrayList;


public class name {
    public static void main(String[] args){
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Emanuel");
        nome.add("Zassala Mario");
        nome.add("Claudio pascoal");
        nome.add("Cahanda Cassule");
        nome.add("Madalena Paulo");
        System.out.println("Lista completa");
        for(String nomes: nome)
        {
            System.out.println(nomes);
        }

        nome.remove(2);

        Boolean ex = nome.contains("Emanuel");
        System.out.println(ex);
        System.out.println("O tamanho da lista " + nome.size());

    }
}
