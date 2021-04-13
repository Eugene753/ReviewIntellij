package reviewclass7.reviewclass08;

import reviewclass08.constructor.ConsDemo;

public class Test extends ConsDemo{

    Test(){
        super("name","address");
        //super.name="test"; default access can not access it
        super.address="Test";
        method2();
        method4();

    }

    public static void main(String[] args) {
        ConsDemo consDemo=new ConsDemo();
        consDemo.phoneNumber="4545";
        consDemo.method4();
        //ConsDemo consDemo1=new ConsDemo("Salam");CE cannot call constructor with default access modifier from different package
        //ConsDemo consDemo=new ConsDemo();Can not create object of protected constructor
        //ConsDemo consDemo1=new ConsDemo("name","address");
    }
}
