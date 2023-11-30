import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> fruit = new LinkedList<>();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit);

        fruit.poll();
        System.out.println(fruit);

        System.out.println(fruit.element());

        Iterator iterator = fruit.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

    }
}
