package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface Square {
    void square(int num);
}

class Result1 implements Square{
    Scanner scan = new Scanner(System.in);

    @Override
    public void square(int num){

    }
}
