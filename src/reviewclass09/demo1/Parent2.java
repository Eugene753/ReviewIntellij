package reviewclass09.demo1;

public class Parent2 {

   String name;
   String address;

   public Parent2(String name,String address){
       this.name=name;
       this.address=address;
   }
   void printInfo(){
       System.out.println("Name "+name+" Address");
   }
}
class Child2 extends Parent2{

    public Child2(String name,String address){
        super(name,address);
    }
}
class Main{
    public static void main(String[] args) {
        Child2 child=new Child2("Aziz","1324");
        child.printInfo();
    }
}
