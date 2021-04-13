package reviewclass09.demo2;

public class OverloadingDemo {

    public static void main(String[] args) {

        String name="yulia is a good student yulia does her homework on time";
        System.out.println(name.indexOf("yulia"));
        System.out.println(name.indexOf("yulia",10));
    }



    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,double c){
        System.out.println(a+b+c);
    }
}
