package main.homework2.task2;

public class Solution2 {

    public static void main(String[] args) {
        int[][] board = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 0) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = 1;
                }
        }
        System.out.println("Вывод for");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println("Вывод  foreach");
        for (int[] stroka : board) {
            for (int vertikal : stroka)
                System.out.print(vertikal);
            System.out.println();
        }

        System.out.println("Вывод while");
        int i = 0, j = 0;
        while (i < 8) {
            while (j < 8) {
                System.out.print(board[i][j++]);
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}


