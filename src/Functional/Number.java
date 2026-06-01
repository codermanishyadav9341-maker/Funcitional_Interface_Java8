package Functional;

@FunctionalInterface
public interface Number {
    void display(int num);
  default void display(){

  }

  static void print(){

  }
}

class Result4 implements Number{

    @Override
    public void display(int num){
        System.out.println("Value:- " +num);
    }

    public static void main(String[] args){
        Result4 r4 = new Result4();
        r4.display(10);
    }
}
