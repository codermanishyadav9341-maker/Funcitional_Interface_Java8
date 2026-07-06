package LambdaPracticeSet;

import java.util.Scanner;
@FunctionalInterface
public interface Palindrome {
    boolean checkPalindrome(String str);
}
class Result9{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Palindrome palindrome = (str) ->{
                String reverse = new StringBuilder(str).reverse().toString();
                return str.equals(reverse);
            };

            System.out.print("Enter Characters:- ");
            String str = scan.nextLine();


            if(palindrome.checkPalindrome(str)){
                System.out.println("Palindrome");
            }
             else{
                 System.out.println("Not Palindrome");
            }
        }
        catch (Exception e){
            System.out.println("Sometime went wrong");
        }
    }
}