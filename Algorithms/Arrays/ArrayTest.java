package Algorithms.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 6, 7, 8, 9, 10};

        ArrayALG arrALG = new ArrayALG(arr);


        // reverse arry
        arrALG.reverse();
        int sum = arrALG.sum();
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arrALG.getArr()[i] + " ");

        }
        System.out.println(sum); // 57
    }
}
