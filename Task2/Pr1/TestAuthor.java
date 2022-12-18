package Task2.Pr1;

public class TestAuthor {
    public  static void main(String[] args){
        Author Aut = new Author("Jake Peterson", "gugugu@mail.ru", 'M');
        System.out.println(Aut);
        System.out.println(Aut.getName());
        System.out.println(Aut.getEmail());
        System.out.println(Aut.getGender());
        Aut.setEmail("kuku@gmail.com");
        System.out.println(Aut.getEmail());
    }
}
