import java.util.HashSet;


public class SetCollection {
    HashSet<String> setName = new HashSet<>();

    public void addSet(String str) {
        setName.add(str);
    }

    public void deleteSet(String str) {
        setName.remove(str);
    }

    public boolean searchSet(String str) {
        return setName.contains(str);
    }

    public void listSet() {
        for (String element : setName) {
            System.out.println(element);
        }
    }
}
