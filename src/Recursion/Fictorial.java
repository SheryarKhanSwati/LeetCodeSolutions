package Recursion;

public class Fictorial {

    public static void main(String[] args) {
        System.out.println(calculateFictorial(5));

    }

    static int calculateFictorial(int n){
        if(n ==1 || n ==0){
            return 1;
        }
          int fact_nm1=      calculateFictorial(n-1);
          int fact = n * fact_nm1;

          return fact;
    }

}
