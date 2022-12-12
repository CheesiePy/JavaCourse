package Algorithms.Arrays;

public class ArrayALG{

    private int arr[];
    private int size;

    public ArrayALG(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
        System.out.println("ArrayALG is init..");
    }

    // gettes & settes

    public int[] getArr() {
        return arr;
    }

    public void reverse() {

        int[] B = new int[size];

        for (int i = size -1; i >= 0; i--){
            B[size -1 - i] = this.arr[i];
        }

        this.arr = B;

    }

    public int sum(){

        int sum = 0;

        for( int i = 0; i < size; i++){
            sum += this.arr[i];
        }

        return sum;
    }



    public int max(){
        return 1;
    }

    public int min(){
        int min = this.arr[0];

        for(int i = 0; i < size ; i++){
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    public int instanceOf(int a){
        // return the number of time a appeard in the array.
        return 1;
    }



    
}
