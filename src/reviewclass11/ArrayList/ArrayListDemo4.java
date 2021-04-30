package reviewclass11.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo4 {

    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        cities.add("New York");
        ListIterator<String> stringListIterator=cities.listIterator();
        System.out.println(stringListIterator.next());
        System.out.println(stringListIterator.previous());
    }
}
