package Functional_Interface;

@FunctionalInterface
public interface DefaultOverride {

    void so();

    default void eat(){
        System.out.println("eating......");
    }
}

class Result16 implements DefaultOverride{

    @Override
   public  void so(){
       System.out.println("Sleeping") ;
    }

    public void eat(){
        System.out.println("Override Class");
    }

    public static void main(String[] args){
        Result16 rr = new Result16();

        rr.so();
        rr.eat();

    }
}