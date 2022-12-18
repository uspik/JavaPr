package Task2.Pr10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inp = sc.nextLine();

        int c = 0;

        if(inp.length() != 0){
            c++;
            for (int i = 0; i < inp.length()-1; i++) {
                if(inp.charAt(i) == ' '){
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}
