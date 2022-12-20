import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class MyLinkedList implements Iterable {
    List ll = new LinkedList();
    public List<Object> myList = new ArrayList<>();
    List<Object> createList = new ArrayList<>();

    public void addValue(String value) {
        createList.add(value);
        List<Object> valueList = new ArrayList<>();
        List<Object> firstList = new ArrayList<>();
        List<Object> lastList = new ArrayList<>();
        if (createList.size() == 1){
            valueList.add(value);
            valueList.add(value);
            valueList.add(value);
        }
        if (createList.size() == 2) {
            firstList.add(createList.get(0));
            firstList.add(value);
            firstList.add(value);
            myList.set(0, firstList);
            valueList.add(value);
            valueList.add(createList.get(0));
            valueList.add(createList.get(0));
        }
        if (createList.size() > 2) {
            firstList.clear();
            firstList.add(createList.get(0));
            firstList.add(value);
            firstList.add(createList.get(1));
            myList.set(0, firstList);

            lastList.add(createList.get(createList.size()-2));
            lastList.add(createList.get(createList.size()-3));
            lastList.add(createList.get(createList.size()-1));
            myList.set(myList.size()-1, lastList);

            valueList.add(value);
            valueList.add(createList.get(createList.size() - 2));
            valueList.add(createList.get(0));
        }
        myList.add(valueList);
    }

    @Override
    public String toString() {
        return "MyLinkedList" + createList;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<myList.size();
            }

            @Override
            public Object next() {
                return myList.get(index++);
            }
        };
    }
}
