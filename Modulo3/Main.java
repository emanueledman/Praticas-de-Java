package Modulo3;

public class Main {

    public static void main(String[] args) {
        int [][]mat = new int [5][5];

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j)
                    mat[i][j] = i + j;
                else
                    mat[i][i] = i + 1;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
