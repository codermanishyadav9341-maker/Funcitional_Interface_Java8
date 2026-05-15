package Java8_Roof;


public class Hello{
    public static void main(String[] args){

        Runnable r = () -> System.out.println("Hello");

        r.run();
    }
}