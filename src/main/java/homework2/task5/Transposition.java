package homework2.task5;

import java.util.Random;

public class Transposition {

    public static void main(String[] args) {
        final int m = new Random().nextInt(3) + 3;
        final int n = new Random().nextInt(3) + 3;

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Random().nextInt(9);
            }
        }

        int[][] trmatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trmatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("До транспонирования");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("После транспонирования");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(trmatrix[i][j]);
            }
            System.out.println();
        }
    }
}
