package OOP.lesson_seven;

public class Board<T>{

    private T[][] matrix;
    private int size;
    private T defaultValue;

    public Board(int size, T defaultValue) {

        matrix = (T[][]) new Object[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = defaultValue;
            }
        }
        this.size = size;
    }

    public T getCordinats(int row, int col){
        return matrix[row][col];
    }

    public void setCordinats(int row, int col, T value){
        matrix[row][col] = value;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size ; i++){
            for(int j = 0; j < size; j++){
                sb.append(matrix[i][j]);
                sb.append(" ");
            }
            sb.append('\n');
        }

        return sb.toString();
    }
    
}
