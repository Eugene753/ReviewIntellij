package reviewclass11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);
        numbers.add(13);
        numbers.add(110);
        numbers.add(2);

        System.out.println(numbers);
        int index=numbers.indexOf(110);
        numbers.remove(new Integer(110));
        System.out.println(numbers);

        ArrayList<String> list1=new ArrayList<>();

        list1.add("hi");
        list1.add("yo");
        list1.add("sup");
        list1.add("yolo");
        list1.add("boop");




        /*Iterator<String> iterator=list1.iterator();

        while(iterator.hasNext()){

        }*/


    }
}
