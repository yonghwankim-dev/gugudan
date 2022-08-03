package main.java;

import java.util.ArrayList;
import java.util.List;

public class Gugudan {
    private final int dan;
    private final int end;
    public Gugudan(int dan) {
        this(dan, 9);
    }

    public Gugudan(int dan, int end) {
        this.dan = dan;
        this.end = end;
    }

    public int[] calc(){
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= end; i++){
            result.add(dan * (i));
        }
        return toIntArrays(result);
    }

    public int[] toIntArrays(List<Integer> list){
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public void print(){
        for(int i = 1; i <= end; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }
 }
