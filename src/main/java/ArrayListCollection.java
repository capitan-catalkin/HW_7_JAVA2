import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
       List<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");
        array.add("3");

        System.out.println(array);

        array.set(0, "0");
        System.out.println(array.get(0));
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.add("4");
        array.add("2");
        array.add("6");

        for (int i = 0; i < array.size(); i++){
            System.out.println("Number " + array.get(i));
        }
    }
}
