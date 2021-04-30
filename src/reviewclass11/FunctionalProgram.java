package reviewclass11;

import java.util.ArrayList;

public class FunctionalProgram {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("DC");
        cities.add("Kiev");
        cities.add("Moscow");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("LA");
        cities.add("Miami");
        cities.add("New York");
        System.out.println(cities);

        /*int counter=0;

        for(String city:cities){
            if(city.contains("M")){
                counter++;
            }
        }
        System.out.println(counter);*/
        System.out.println(cities.stream().filter(city->city.contains("M")).count());

    }
}
