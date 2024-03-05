package Recursion;

public class FibonachiNumber {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    static int fibo(int n){
        if(n<5){
            return n;
        }
       return fibo(n-1)+fibo(n-2);
    }
}
