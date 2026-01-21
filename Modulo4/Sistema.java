package Modulo4;

import java.util.*;

public class Sistema {

  

    public static void add_aluno(ArrayList<String> nome){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if(!nome.contains(name)){
            nome.add(name);
            System.out.println("Aluno " + name + "Adicionado com Sucesso");
        }
        else
            System.out.println("Nao foi possiver adicionar " + name + ", Aluno ja existe");
    }

    public static void listar(ArrayList<String> nome){
        System.out.println("LISTA DE ALUNOS");
        for (String nomes : nome) {
            System.out.println("1 - " + nomes);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();
        System.out.println("==SISTEMA DE NOTAS==");
        System.out.println("1 - Adicionar aluno e nota");
        System.out.println("2 - Listar todos os Alunos");
        System.out.println("3 - Buscar por Aluno");
        System.out.println("4 - Remover aluno");
        System.out.println("5 - Calcular Media da turma");
        System.out.println("6 - Aluno com mair nota");
        System.out.println("7 - Aluno com menor nota");
        System.out.println("8 - Statistica completa");

        int n;

        do {
            n = input.nextInt();
            switch(n){
                case 1:
                    add_aluno(nome);
                    break;
                case 2:
                    listar(nome);
                    break;
            }
        } while (n != 0 || n > 9);
    }
}
