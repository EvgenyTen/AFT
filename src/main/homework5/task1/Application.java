package main.homework5.task1;


import java.util.Random;

public class Application {

    public static void main(String[] args) {
        int m = new Random().nextInt(5) + 5;
        int n = new Random().nextInt(5) + 5;
        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[n][m];

        System.out.println("Dividends :");
        for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(5) + 4;
            System.out.print(dividends[i] + " ");
        }

        System.out.println();
        System.out.println("Dividers:");
        for (int i = 0; i < n; i++) {
            dividers[i] = new Random().nextInt(3);
            System.out.print(dividers[i] + " ");
        }

        System.out.println();
        System.out.println("Result:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    result[j][i] = dividends[i] / dividers[j];
                } catch (ArithmeticException exception) {
                    result[j][i] = -1;
                }
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}

