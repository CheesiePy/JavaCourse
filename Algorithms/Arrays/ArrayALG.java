package Algorithms.Arrays;

public class ArrayALG{

    private int arr[];

    public ArrayALG() {
        
        System.out.println("ArrayALG is init..");
    }



    public ArrayALG(int[] arr) {
        this.arr = arr;
        System.out.println("ArrayALG is init..");
    }

    // gettes & settes

    public int[] getArr() {
        return arr;
    }

    public void reverse() {
        int[] B = new int[this.arr.length];
        for (int i = this.arr.length -1; i >= 0; i--){
            B[this.arr.length -1 - i] = this.arr[i];
        }
        this.arr = B;
    }

    public int sum(){
        return 1;
    }



    
}
