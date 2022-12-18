package Task1;

import java.util.Scanner;

public class Prac2 {
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
        }
        int j = 0;
        int maks = mas[0];
        int min = mas[0];
        while(j < n){
            sum += mas[j];
            if(mas[j] > maks){
                maks = mas[j];
            }
            if(mas[j] < min){
                min = mas[j];
            }
            j++;
        }
        System.out.print("Сумма массива равна: " + sum + "\n");
        System.out.print("Минимальный элемент: " + min + "\n");
        System.out.print("Максимальный элемент: " + maks);
    }
}
