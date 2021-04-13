package reviewclass08.inheritance;

public class ParentTester {

    public static void main(String[] args) {
        Child child=new Child("132456","Safiet");
        child.method2();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        GrandChild grandChild=new GrandChild("hjdfhjdhf","dfjhdjfhjd");
        grandChild.method2();
    }
}
