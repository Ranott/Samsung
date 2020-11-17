package First_lesson;

import java.util.Scanner;

public class qwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int[n][n];

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; j++) {
                if(i + j + 1== n) {
                    mas[i][j] = 1;
                } else {
                    if (i + j + 1 < n) {
                        mas[i][j] = 0;
                    } else {
                        mas[i][j] = 2;
                    }
                }
            }
        }
        

        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; i++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

    }
}