package reviewclass5;

import java.util.Locale;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        //How would you swap  2 strings without a temporary variable?

        String str1, str2;


        str1="Hello";
        str2="Bye";
        System.out.println("String str1: "+str1);
        System.out.println("String str2: "+str2);

        str1=str1+str2;
        str2=str1+str2;
        System.out.println(str1);

        for(int i=0;i<5;i++){
            str2+=str1.charAt(i);
        }
        System.out.println(str2);



        str1=str1.substring(5);
        str2=str2.substring(3);

        System.out.println("String str1: "+str1);
        System.out.println("String str2: "+str2);


        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //leave above alone!  write your code below
        String str="";
        for(int i=0;i<arr.length;i++){
            str=input.next();
            arr[i]=str.toLowerCase();
            System.out.print(arr[i].substring(0,3));
        }

    }
}
