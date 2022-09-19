package OOP.lesson_five;

public class Square {
    private Object symbol;

    public Square() {
        this.symbol = "0";
    }

    public Square(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol.toString();
    }

    // Getters and Setters
    public Object getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
