package Lambda_Expression;

@FunctionalInterface
public interface Parameter {
    void so();
}

class Result2{
    public static void main(String[] args){

        Parameter pp = () -> System.out.println("Without Parameter");

        pp.so();

    }
}
