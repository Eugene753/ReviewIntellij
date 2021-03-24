package reviewclass5;

import java.util.Scanner;

public class AccountTester {

    public static void main(String[] args) {
        Account yuliasAccount=new Account();
        yuliasAccount.signUp();
        boolean isSuccessful=yuliasAccount.signIn();


            if(isSuccessful) {
                System.out.println("Enter the amount that you want to transfer");
                Scanner scanner = new Scanner(System.in);
                yuliasAccount.withDraw(scanner.nextDouble());
            }



        /*
        add transfer behaviour
         */
    }
}
