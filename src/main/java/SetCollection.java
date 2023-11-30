import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Vasa");
        set.add("Peta");
        set.add("Vera");
        set.add("Ekaterina");
        System.out.println(set);

        set.remove("Vasa");
        System.out.println(set.size());

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            if (element.equals("Peta")) {
                System.out.println(element + " ???");
            } else {
                System.out.println(element);
            }
        }
    }
}
