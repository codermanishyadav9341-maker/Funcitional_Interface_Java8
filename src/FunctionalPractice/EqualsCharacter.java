package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
@FunctionalInterface
public interface EqualsCharacter {
    boolean checkEquals(String str1,String str2);
}

class EqualsImpl implements EqualsCharacter{

    @Override
    public boolean checkEquals(String str1, String str2){
        return Objects.equals(str1,str2);
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter your first Character:- ");
            String str1 = scan.nextLine();

            System.out.print("Enter your Second Character:- ");
            String str2 = scan.nextLine();

            EqualsCharacter equalsCharacter = new EqualsImpl();

            System.out.println("String equals Check:- " +(equalsCharacter.checkEquals(str1,str2)));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input only for Characters");
        }
    }
}