package reviewclass10;

public class BankAccount {

    private double accountbalance;
    private String password="123";

    public double getBalance(String password){
        if(this.password==password){
            return accountbalance;
        }else{
            return -1;
        }
    }

}
