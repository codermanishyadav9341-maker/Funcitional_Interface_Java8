package Functional_Interface;


public interface Default1 {

    default void sleep(){
        System.out.println("Sleeping.......");

    }

    private void helper(){
        System.out.println("Helps......");
    }

}

class Result20 implements Default1{
    public static void main(String[] args){
        Result20 rr = new Result20();
        rr.sleep();

    }
}