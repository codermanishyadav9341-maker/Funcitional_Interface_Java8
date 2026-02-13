package Functional_Interface;

public interface cube {

    int cube(int n);
}

class Result1 implements cube{
  public  int cube(int n){
        return (n*n*n);
    }

    public static void main(String[] args){
      Result1  rr = new Result1();
      rr.cube(3);

      System.out.println("Cube:- " +rr.cube(3));
    }
}
