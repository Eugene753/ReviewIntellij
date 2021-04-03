package reviewclass7;

public class StaticDemo {
    static int count;


    StaticDemo(){
        count++;
    }

public static  void printTotalObjectCreated(){
    System.out.println(count);
}
}
