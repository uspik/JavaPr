package Task7.BookMag;

import static Task7.BookMag.Book.printBooks;
import static Task7.BookMag.Magazine.printMagazines;

public class DemoTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Magazine("Magazine1"),
                new Magazine("Magazine2"),
                new Book("Ivan Ivanov", "Book35"),
                new Magazine("Magazine3")};

        printMagazines(printables);
        System.out.println();
        printBooks(printables);
    }
}