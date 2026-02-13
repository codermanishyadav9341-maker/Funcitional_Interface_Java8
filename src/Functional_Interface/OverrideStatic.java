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


}
