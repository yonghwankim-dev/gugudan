package main.java;

public class Range {
    private Positive start;
    private Positive end;

    public Range(Positive start, Positive end) {
        this.start = start;
        this.end = end;
    }

    public int getStartNumber(){
        return start.getNumber();
    }

    public  int getEndNumber(){
        return end.getNumber();
    }
}
