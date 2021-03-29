package reviewclass6;

public class MultipleTasksAtsametime {

    public static void main(String[] args)throws InterruptedException {

        /*googleChrome();
        intelliJ();
        slack();
         */




    }

    public static void googleChrome() throws InterruptedException {
        System.out.println(" google chrome is running");
        Thread.sleep(1000);
    }

    public static void intelliJ() throws InterruptedException{
        System.out.println(" intelliJ chrome is running");
        Thread.sleep(5000);
    }

    public static void slack() throws InterruptedException{
        System.out.println(" slack chrome is running");
        Thread.sleep(3000);
    }
}
