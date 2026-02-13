package Functional_Interface;

@FunctionalInterface
public interface DefaultAdd {

    void so();

    default void sum(){
        System.out.println("1st Default");
    }

    default void sum1(){
        System.out.println("2nd Default");
    }

}

class Result15 implements DefaultAdd{
    public void so(){
        System.out.println("Access Interface");
    }

    public static void main(String[] args){
        Result15 rr = new Result15();
        rr.so();rr.sum();rr.sum1();
    }
}
