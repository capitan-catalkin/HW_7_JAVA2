import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

    Queue<String> fruit = new LinkedList<>();

    public void addFruit(String str) {
        fruit.add(str);
    }

    public void deleteFruit() {
        fruit.poll();
    }

    public void allFruit() {
        Iterator iterator = fruit.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }
    }

}
