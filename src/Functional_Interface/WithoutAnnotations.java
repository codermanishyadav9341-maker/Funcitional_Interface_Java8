package Functional_Interface;

public interface WithoutAnnotations {

    void so();
}
class Result21 implements WithoutAnnotations{

    @Override
    public void so(){
        System.out.println("Sleeping......");
    }

    public static void main(String[] args){
        Result21 rr = new Result21();
        rr.so();
    }
}