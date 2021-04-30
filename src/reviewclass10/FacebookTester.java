package reviewclass10;

public class FacebookTester {

    public static void main(String[] args) {
        FacebookAccount facebookAccount=new FacebookAccount("s@Dfsdfg","wdsf3423");
        facebookAccount.email="asadfsdfsdfgrgsf";

        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.getBalance("adssdfgfdsg"));

        int age=(10>12)?50:100;

        int var1=10;
        if(var1>20){
            age=100;
        }else{
            age=50;
        }

        age=(var1>20)?100:50;
        System.out.println(age);

    }
}
