package reviewclass11;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo2 {

    public static void main(String[] args) {

        List<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        cities.add("New York");
        int index=cities.indexOf("Virginia");
        cities.add(index+1,"New York");
        cities.add(0,"Alexandria");
        cities.add(0,"Lahore");
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.contains("Lahore"));
        System.out.println(cities.indexOf("Chicago"));
        System.out.println(cities.lastIndexOf("Chicago"));
        System.out.println(cities.set(0,"Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);
        //System.out.println(cities.remove(20)); RE
        System.out.println("====sublist======");
        int firstIndex=2;
        int lasIndex=4;
        System.out.println(cities.subList(firstIndex,lasIndex));

       /* if(cities.subList(0,1) instanceof ArrayList){
            System.out.println("Posible ");
        }else{
            System.out.println("Not a child ");
        }
        ArrayList<String> limitiedCities=(ArrayList<String>) cities.subList(firstIndex,lasIndex);//why class cast error
        ArrayList<String> limitedCities=new ArrayList<>();
        System.out.println(limitedCities.getClass());*/
        //System.out.println(cities.subList(0,1).getClass());
        ArrayList<String> limitiedCities1=new ArrayList<>(cities.subList(firstIndex,lasIndex));
        System.out.println(limitiedCities1);
    }
}
