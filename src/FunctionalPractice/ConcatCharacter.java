package FunctionalPractice;


import java.util.Scanner;
@FunctionalInterface
public interface ConcatCharacter {
    void printConcat(String str1 , String str2);
}

class ConcatImpl implements ConcatCharacter{

    @Override
    public void printConcat(String str1,String str2){
       if(str1 == null || str2 == null){
           System.out.println("String cannot be null");
           return;
       }

        String result = str1.concat(str2);
       System.out.println("Concat characters is:- " +result);
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter first String:- ");
            String str1 = scan.nextLine();

            System.out.print("Enter Second String:- ");
            String str2 = scan.nextLine();

            ConcatCharacter concat = new ConcatImpl();
            concat.printConcat(str1,str2);
        }
//        catch(InputMismatchException e){
//            System.out.println("Invalid Input only for characters or letter");
//        }
    }
}