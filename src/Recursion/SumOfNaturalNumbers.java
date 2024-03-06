package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {


        naturalNumbers(1,5,0);
    }
    static void naturalNumbers(int i,int n,int sum){
        if (i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;

        naturalNumbers(i+1,n,sum) ;
    }
}
