import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Integer> book = new HashMap<>();
        book.put("Война и мир", 3);
        book.put("Горе от ума", 5);
        book.put("Идиот", 2);
        book.put("Морфий", 7);

        System.out.println(book);

        book.put("Морфий", 65);
        System.out.println(book);

        book.putIfAbsent("Морфий", 10);
        System.out.println(book.get("Морфий"));

        book.remove("Горе от ума");
        System.out.println(book);

        System.out.println(book.containsKey("Война и мир"));
    }
}
