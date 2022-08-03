package main.java;

public class Gugudan {
    private final int dan;

    public Gugudan(int dan) {
        this.dan = dan;
    }

    public int[] calc(){
        int[] result = new int[9];
        for(int i = 0; i < result.length; i++){
            result[i] = dan * (i+1);
        }
        return result;
    }

    public void print(){
        for(int i = 0; i < 9; i++){
            System.out.printf("%d * %d = %d\n", dan, i+1, dan * (i+1));
        }
    }
 }
