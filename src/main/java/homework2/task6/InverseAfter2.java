package homework2.task6;

import java.util.Random;

public class InverseAfter2 {
    public static void main(String[] args) {
        int m = new Random().nextInt(9) + 3;
        int n = new Random().nextInt(9) + 3;
        int[][] sourceMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sourceMatrix[i][j] = new Random().nextInt(2);
            }
        }
        int x = 1 + new Random().nextInt(m - 2);
        int y = 1 + new Random().nextInt(n - 2);
        sourceMatrix[x][y] = 2;
        int inverse = 0;
        int[][] destMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sourceMatrix[i][j] == 2) {
                    destMatrix[i][j] = 2;
                    inverse = 1;
                    continue;
                }
                destMatrix[i][j] = (sourceMatrix[i][j] + inverse) % 2;
            }
        }

        System.out.println("Начальная матрица");
        for (int[] row : sourceMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Изменённая матрица");
        for (int[] row : destMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }

}
