import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

    List<String> list = new ArrayList<>();

    public void addList(String str) {
        list.add(str);
    }

    public void removeList(String str) {
        list.remove(str);
    }

    public void getList(int index) {
        System.out.println(list.get(index));
    }


    public void checkRemoveElement(String str) {
        if (list.contains(str) == false) {
            System.out.println("Предмет удален: " + str);
        } else {
            System.out.println("Предмет не удалён: " + str);
        }
    }
}
