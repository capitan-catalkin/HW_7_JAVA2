import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListCollection list = new ArrayListCollection();
        list.addList("Алгебра");
        list.addList("Геометрия");
        list.addList("ОБЖ");
        list.addList("ИН.яз.");
        list.addList("Литература");
        list.addList("Физика");

        list.getList(2);
        list.removeList("ИН.яз.");
        list.removeList("Литература");

        list.checkRemoveElement("Литература");
        System.out.println("_____________________");

        MapCollection mapBook = new MapCollection();
        mapBook.addBook("Война и мир", 3);
        mapBook.addBook("Горе от ума", 5);
        mapBook.addBook("Идиот", 2);
        mapBook.addBook("Морфий", 7);
        System.out.println(mapBook);

        System.out.println(mapBook.searchElement("Идиот"));
        mapBook.deleteBook("Идиот");
        System.out.println(mapBook.searchElement("Идиот"));
        mapBook.getBook("Морфий");

        mapBook.listOfBooks();
        System.out.println("_____________________");

        SetCollection set = new SetCollection();
        set.addSet("Vasa");
        set.addSet("Peta");
        set.addSet("Vera");
        set.listSet();

        set.deleteSet("Vera");
        System.out.println("Поиск удалённого элемента: " + set.searchSet("Vera"));
        System.out.println("_____________________");

        QueueCollection queue = new QueueCollection();
        queue.addFruit("apple");
        queue.addFruit("pear");
        queue.addFruit("orange");
        queue.addFruit("lemon");
        queue.allFruit();

        queue.deleteFruit();
        queue.allFruit();


    }
}
