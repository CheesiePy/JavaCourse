package OOP.lesson_five;

public class Matrix{

    Square[][] matrix;
    int size;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new Square[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.matrix[i][j] = new Square();
            }
        }

    }

    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                result += this.matrix[i][j].toString() + " ";
        }
        result += "\n";  
    }
       return result;
}




}