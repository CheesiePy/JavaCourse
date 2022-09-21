package OOP.lesson_five;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Matrix m = new Matrix(5);
//        Object o = new Object();
//        Object o1 = new Object();
////        System.out.println(o);
////        System.out.println("--------------------");
////        System.out.println(o1);
//        System.out.println(m);
//        int n = 3;
//        for(int i = 0; i < n; i++){ // this loop will run n of time
//            System.out.println(i);
//            for(int j = 0; j < n; j++){ // this loop will run n x n time
//                System.out.println(j);
//                for(int w = 0; w < n; w++){
//
//                }
//            }
//        }

        int n = 5;
        int[] arry = new int[2];
        int[][] matrix = new int[2][2];
        arry[0] = 18;
        arry[1] = 9;

        matrix[0] = arry;
        matrix[1] = arry;

        for(int i=0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
