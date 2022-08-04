package main.java;

public class Positive {
    private int number;

    public Positive(String number){
        this(Integer.parseInt(number));
    }

    public Positive(int number) {
        if(number < 0){
            throw new RuntimeException();
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
