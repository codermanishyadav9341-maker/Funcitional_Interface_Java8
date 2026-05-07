package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class VowelCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<String,Integer> vowels = str ->{
            int count = 0;
                    for(char ch : str.toLowerCase().toCharArray()){
                        if("aeiou".indexOf(ch) != -1)
                            count++;
                    }

                    return count;
        };

        System.out.print("Enter Letter:- ");
        String str = scan.nextLine();

        System.out.println("Vowel counts:- " +vowels.apply(str));

    }
}
