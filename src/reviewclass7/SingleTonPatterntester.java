package reviewclass7;

public class SingleTonPatterntester {
    public static void main(String[] args) {


        Singletonpattern singletonpattern = Singletonpattern.getObj();
        Singletonpattern.getObj();
        Singletonpattern.getObj();
        Singletonpattern.getObj();
        System.out.println(Singletonpattern.sum);

    }
}
