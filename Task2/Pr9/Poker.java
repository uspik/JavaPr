package Task2.Pr9;

import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"Сlub", "Spade", "Diamond", "Heart"};
        String[] ranks = {" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K", " A" };

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во игроков: ");
        int n = sc.nextInt();


        boolean[][] deck = new boolean[suits.length][ranks.length];

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                deck[i][j] = false;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 5; ++j) {
                int s = Math.abs(random.nextInt()) % suits.length;
                int r = Math.abs(random.nextInt()) % ranks.length;

                while(deck[s][r]) {
                    s = Math.abs(random.nextInt()) % suits.length;
                    r = Math.abs(random.nextInt()) % ranks.length;
                }
                System.out.println(ranks[r] + " " + suits[s]);
                deck[s][r] = true;
            }
            System.out.println();
        }
    }
}
