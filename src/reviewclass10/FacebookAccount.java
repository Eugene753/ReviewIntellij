package reviewclass10;

public class FacebookAccount {

   String email;
   String password;

    public FacebookAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void resetPassword(){
       System.out.println("An Email has been sent to your email Id "+email+" click on that link to reset your password");
   }

   public void setEmail(String email){
       if(email.contains("@")&&email.contains(".com")){
           this.email=email;
       }else{
           System.out.println("your email is not correct");
       }
   }
}
