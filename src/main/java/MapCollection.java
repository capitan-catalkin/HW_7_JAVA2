import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapCollection {
    Map<String, Integer> book = new HashMap<>();

    public void addBook(String str, Integer i) {
        book.put(str, i);
    }

    public void deleteBook(String str) {
        book.remove(str);
    }

    public void getBook(String str) {
        System.out.println(book.get(str));
    }

    public boolean searchElement(String str) {
        return book.containsKey(str);
    }

    public void listOfBooks() {
        Iterator<Map.Entry<String, Integer>> iterator = book.entrySet().iterator();
        do {
            Map.Entry<String, Integer> entry = iterator.next();
            String titleBooks = entry.getKey();
            Integer quantityOfBooks = entry.getValue();
            System.out.println("Название книги: " + titleBooks + ", Кол-во книг: " + quantityOfBooks);
        } while (iterator.hasNext());
    }

}
