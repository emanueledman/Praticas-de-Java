package Modulo3;

public class diag {
    public static void main(String[] args) {
        
        int [][]mat = new int[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || j == 0) {
                    mat[i][j] = 1;
                }
                else
                    mat[i][j] = 0;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

    }
}
