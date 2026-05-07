package Function_Interface;

//import java.util.Scanner;
//import java.util.function.Function;
//public class Convert {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        Function<String,Integer> toInt = str -> Integer.parseInt(str);
//
//        System.out.print("Enter your Letter:- ");
//        String str = scan.nextLine();
//
//        System.out.println("String into Integer:- " +toInt.apply(str));
//
//        scan.close();
//
//
//    }
//}




import java.util.*;

 class Main {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1,2,3,4,5);

        list.stream()
                .forEach(System.out::print);
    }
}