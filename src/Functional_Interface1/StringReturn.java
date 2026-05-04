package Functional_Interface1;

@FunctionalInterface
public interface StringReturn {
    String getName();
}

class Test15 implements StringReturn{

    @Override
    public String getName(){
        return "Manish";
    }

    public static void main(String[] args){
        StringReturn rr = new Test15();
        rr.getName();

        System.out.println("Student Name:- " +rr.getName());

    }

}