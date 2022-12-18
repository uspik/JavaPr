package Task1;
import java.util.Scanner;


public class Prac5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;

        for (int i = 1; i <= n; ++i)
            k *= i;

        System.out.println("Факториал:");
        System.out.println(k);
    }
}