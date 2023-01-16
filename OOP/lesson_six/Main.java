package OOP.lesson_six;

public class Main {
    


    public static void main(String[] args) {
        char[] student = new char[5];

        char a = 'a';




        student[0] = 'O';
        student[1] = 's';
        student[2] = 'h';
        student[3] = 'r';
        student[4] = 'i';

        myString ms = new myString(student);
        myString ms2 = new myString(student);

        String a = "hello";
        String b = "world";

        System.out.println(ms.add(ms2));

}
