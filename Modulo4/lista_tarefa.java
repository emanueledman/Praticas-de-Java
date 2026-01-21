package Modulo4;

import java.util.ArrayList;
import java.util.Scanner;

public class lista_tarefa {
    public static void main(String[] args) {
        ArrayList <String> tarefa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Lista de tarefas\n");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar Tarefas");
        System.out.println("3 - remover tarefa");
        System.out.println("4 - Marcar com concluido");
        System.out.println("5 - Sair");


        String nome;
        switch (input.nextInt()) {
            case 1:
                System.out.println("Digite o nome da tarefa");
                input.nextLine();
                nome = input.nextLine();
                tarefa.add(nome);
                for (String tarefas : tarefa) {
                    System.out.println("Lista de tarefas disponiveis");
                    System.out.println(tarefas);
                }
                break;
            case 2:

                for (String tarefas : tarefa) {
                    System.out.println("Lista de tarefas disponiveis");
                }
                break;
            case 3:
                tarefa.remove(input.nextInt());
                break;
            case 4:
                tarefa.get(input.nextInt());
            default:
                break;
        }

    }
}
