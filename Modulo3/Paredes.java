package Modulo3;

public class Paredes {

    public static void main(String[] args) {
        
        int [][]mat = new int[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j < i) {
                    mat[i][j] = 1;
                }
                else if (i < j)
                    mat[i][j] = 2;
                else
                    mat[i][j] = 0;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || i == mat.length - 1 || j == 0 || j == mat[i].length - 1)
                    System.out.print(mat[i][j] + " ");
                else
                    System.out.print("_");
            }
            System.out.println();
        }

    }


}
