package Functional_Interface;


@FunctionalInterface
public interface OverrideStatic {
    void so();

    static void eat(){
        System.out.println("Eating........");
    }
}

class Result18 implements OverrideStatic{

    public void so(){
        System.out.println("Sleeping");
    }

    static void eat(){
        System.out.println("Eating.......");
    }


    public static void main(String[] args){
        Result18 rr = new Result18();


        rr.so();
        OverrideStatic.eat();

    }

}
