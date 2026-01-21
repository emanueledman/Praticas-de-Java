package Modulo4;
 import java.util.*;

public class ArryLis {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for (int index = 0; index < 50; index++) {
            if (index % 5 == 0)
                num.add(index);
        }

        System.out.println("O tamanho do Arry list e " + num.size());
        System.out.println("O terceiro ele mento e " + num.get(2));

        num.set(1, 99);
        num.remove(num.size() - 1);

        for (Integer integer : num) {
            System.out.println(integer);
        }

    }
}
