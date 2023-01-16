package OOP.lesson_8;

public class Main {
    


    public static void main(String[] args) {
        // Integer i = 1;
        // while(true){
        //     i *= 3;
        //     System.err.println(i);
        //     for (int j = 0; j < 10; j++){
        //         if(j == i){
        //             System.out.println("i've broke the for loop");
        //             continue;
        //         }
        //         System.out.println(j);
        //         if(j == 9){
        //             System.out.println("j maxed out");
        //         }
        //     }

        //     if(i > 100 || i < 0){
        //         System.out.println("i've broke the while loop");
        //         break;
        //     }

        // }

        // int arr[] = new int[5];

        // Object array[] = new Object[5];
        // array[0] = new String("hello");
        // array[1] = 5;
        int size = 1000;
        Animal[] animals = new Animal[size];
        for(int i = 0; i < size; i++){
            if(i%2 == 0){
                animals[i] = new Cat();
                continue;
            }
            animals[i] = new Dog();
        }
        
        Cat a = new Cat();
        a.pour();
        System.out.println(a.getHealth());
        
    
        System.out.println("--------------");
        for(int i = 0; i < size; i++){
             animals[i].roar();
        }
        

    }
}
