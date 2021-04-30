package reviewclass11;

import java.util.ArrayList;

public class FunctionalProgramming {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("DC");
        cities.add("Kiev");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("LA");
        cities.add("Miami");
        cities.add("New York");
        System.out.println(cities);
       /* for(String city:cities){
            if(city.contains("M")){
                cities.remove(city);
            }
        }*/


        cities.removeIf(city ->city.contains("M"));
        System.out.println(cities);
    }
}
