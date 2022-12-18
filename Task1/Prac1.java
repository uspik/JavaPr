package Task1;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, sum = 0;
        System.out.print("Введите количество элементов массива: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int[] mas = new int[n];
        for(int i = 0; i<n ;i++){
            int t = 0;
            System.out.print("Введитецелоечисло: ");
            if (sc.hasNextInt()) {
                t = sc.nextInt();
            }
            mas[i] = t;
            sum += t;
        }
        System.out.print("Сумма равна: " + sum + "\n");
        System.out.print("Среднее арифметическое равно: " + (float)sum/n + "\n");
    }
}