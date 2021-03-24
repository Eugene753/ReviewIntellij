package reviewclass5;

import java.util.Scanner;

public class Account {

    String userName;
    String password;
    double balance;

    void signUp(){
        System.out.println("Welcome to Bank of America");
        System.out.println("Chose your usrName");
        Scanner scanner=new Scanner(System.in);
        userName=scanner.next();
        System.out.println("Please choose a password");
        password=scanner.next();
        System.out.println("Enter the money you want to deposit");
        balance=scanner.nextDouble();
    }
    boolean signIn(){
        System.out.println("Please enter your userName");
        Scanner scanner=new Scanner(System.in);
        String enterUsername=scanner.next();
        System.out.println("Please enter you password");
        String enteredPassword=scanner.next();
        if(enterUsername.equals(userName)&&enteredPassword.equals(password)){
            System.out.println("Welcome to the bank");
            return true;
        }else{
            System.out.println("Either username or password is not correct");
            return false;
        }
    }
    void withDraw(double amountToWithDraw){
        if(amountToWithDraw>balance){
            System.out.println("Not enouhg balance");
        }else{
            balance=balance=amountToWithDraw;
            System.out.println("Operation Successful");
        }
    }
}
