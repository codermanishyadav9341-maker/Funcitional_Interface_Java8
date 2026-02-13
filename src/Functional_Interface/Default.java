package Functional_Interface;

@FunctionalInterface
public interface Default {

    void msg();

    default void msg1(){
        System.out.println("Hello Java8");
    }


}

class Result14 implements Default{

    @Override
    public void msg(){
        System.out.println("Hello Interface");
    }

    static void sleep(){
        System.out.println("Sleeping.....");
    }

    public static void main(String[] args){

        Result14 rr = new Result14();

        rr.msg();
        rr.msg1();
       sleep();

    }
}


