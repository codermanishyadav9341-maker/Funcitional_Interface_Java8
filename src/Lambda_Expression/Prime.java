package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Prime {
    void isPrime(int num);
}

class Result30{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Prime pp = (num) -> {

            boolean isPrime = true;


            for (int i = 2; i <= Math.sqrt(num); i++) {
                      if(num%i == 0){
                         isPrime = false;
                         break;

                      }

            }

            if(isPrime){
                System.out.println(num+ " is Prime number");
            }
             else{
                 System.out.println(num+ " is not prime number");
            }
        };

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        pp.isPrime(num);
    }
}