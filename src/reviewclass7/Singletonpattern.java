package reviewclass7;

public class Singletonpattern {
    static int sum=0;
    private Singletonpattern(){
    sum++;
    }


    static Singletonpattern getObj(){
    Singletonpattern singletonpattern=new Singletonpattern();
    return singletonpattern;
    }
}