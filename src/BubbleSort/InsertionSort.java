package BubbleSort;

public class InsertionSort {

    public static void sort(int[] arr){

        for(int i =1 ; i <arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }
    }


    public static void main(String[] args) {
        int[] arr = {9,4,5,23,121,1};

        sort(arr);

        for(int i : arr){
            System.out.println(i);
        }

    }


}
