package JAVA_practical.pract4;
import java.util.LinkedList;


public class Link {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("java");
        books.add("Python");
        books.add("c++");
        books.addFirst("HTML");
        books.addLast("SQL");

        System.out.println("Book List: " + books);
        books.remove("Python");
        System.out.println("After removal: " + books);
        System.out.println("First book: " + books.getFirst());
        System.out.println("Last book: " + books.getLast());


    }    
}
