package OOP.lesson_six;

public class myString{
    
    // primitives
    private char data[];
    int size;

    public myString(char arr[]){
        this.size = arr.length;
        this.data = arr;
    }

    // Getter & Setter

    public char[] getData(){
        return this.data;
    }

    public char charAt(int index){
        return this.data[index];
    }

    public int length(){
        return this.size;
    }

    public myString add(myString a){
        char[] dest = new char[this.length() + a.length()];
        
        for(int i = 0; i < this.length(); i++){
            dest[i] = this.charAt(i);
        }  
        for(int i = this.length(); i < a.length()+this.length(); i++){
            dest[i] = a.charAt(i - this.length());
        }
        myString s = new myString(dest);
        return s;
    }


    // methods 

    public String toString(){
        return new String(this.data);
    }
    

    
}
