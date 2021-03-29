package reviewclass6;

public class StringClassReview {

    public static void main(String[] args) {
        String abd=new String("Sasmple");
        String bdf=new String();
        //abd.equals();
    }

    public void test2(){
        test();
    }

    public static void test(){
        //test2();CE because that method is instance method and we need to create
        //an object of that class before we can access it
        System.out.println("Testing123");
    }
}
