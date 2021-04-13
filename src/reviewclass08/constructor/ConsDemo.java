package reviewclass08.constructor;

public class ConsDemo {
    String name;
    protected
    String address;
    public String phoneNumber;
    public ConsDemo(){

    }
    ConsDemo(String name){
        this.name=name;
    }

    protected ConsDemo(String name,String address){

    }
    void method1(){
        System.out.println("Method with default access");
    }
    protected void method2(){
        System.out.println("Method with default access");
    }
    private void method3(){
        System.out.println("Method with default access");
    }
    public void method4(){
        System.out.println("Method with default access");
    }

}
