import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addValue("A");
        list.addValue("B");
        list.addValue("C");
        list.addValue("X");
        list.addValue("Y");
        list.addValue("Z");
        System.out.println(list);
        list.forEach(System.out::println);

    }
}