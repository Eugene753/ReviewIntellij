package reviewclass7;

public class MethodDemo2 {

    static void methodWithStaticModifier(){
        System.out.println("you can call me just by writing the name of the class");
        //instanceMethod() need to create the object of this class
    }
    void instanceMethod(){
        System.out.println("You need an object of my class if you want to call me outside of this class or in the static methods");
        methodWithStaticModifier();// I can call it because static members belong to the class not instance/object
    }

    void instanceMethod2(){
        methodWithStaticModifier();
        instanceMethod();
    }

    public static void main(String[] args) {
        methodWithStaticModifier();
    }
}
