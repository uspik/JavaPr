package Task2.Pr8;

public class Repl {
    public static void main(String[] args) {
        String[] str = new String[12];
        for (int i = 0; i< 12; i++){
            str[i] = "" + (i + 1);
        }

        for(int i = 0; i < str.length/2; i++){
            String t = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = t;
        }

        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
