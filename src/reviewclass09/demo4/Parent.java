package reviewclass09.demo4;

public class Parent {

    void method(){
        System.out.println("Implementration from the child class");
        System.out.println("code that is old not needed any more");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Execution done");
    }
}
class Child extends Parent{

    @Override
    void method(){
        System.out.println("Implementation from the child class");
    }
}
class Main{
    public static void main(String[]args){
        Child child=new Child();
        child.method();
    }
}