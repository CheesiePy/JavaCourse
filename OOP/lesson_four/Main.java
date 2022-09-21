package OOP.lesson_four;

public class Main {
    public static void main(String[] args) {
        grandfather saba = new grandfather();
        grandfather father = new father();
        grandfather s[];
        s = new grandfather[5];
        for(int i = 0; i < 5; i++){
            if (i % 2 == 0){
                s[i] = new Son();
            }else{
                s[i] = new father();
            }

        }





        // while(saba.isAlive()){
        //     saba.grow();
        //     System.out.println(saba.getAge());
        // }
    }
}
