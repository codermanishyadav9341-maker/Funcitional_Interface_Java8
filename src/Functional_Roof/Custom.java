package Functional_Roof;

@FunctionalInterface
public interface Custom {
    void so();
}

class Result1 implements Custom{

    @Override
    public void so(){
        System.out.println("Sleeping........");
    }

    public static void main(String[] args){
        Result1 rr = new Result1();
        rr.so();


    }
}