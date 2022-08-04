package main.java;

import java.util.ArrayList;
import java.util.List;

public class Gugudan {
    private final int dan;
    private final Range range;

    public Gugudan(int dan) {
        this(dan, 1, 9);
    }

    public Gugudan(int dan, int start, int end) {
        this.dan = dan;
        this.range = new Range(new Positive(start), new Positive(end));
    }

    public int[] calc(){
        List<Positive> result = new ArrayList<>();
        int start = range.getStartNumber();
        int end = range.getEndNumber();
        for(int i = start; i <= end; i++){
            result.add(new Positive(dan * (i)));
        }
        return toIntArrays(result);
    }

    public int[] toIntArrays(List<Positive> list){
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i).getNumber();
        }
        return result;
    }

    public void print(){
        int start = range.getStartNumber();
        int end = range.getEndNumber();
        for(int i = start; i <= end; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }
 }
