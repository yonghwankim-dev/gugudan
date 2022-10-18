package main.java;

public class Gugudan {
    private int dan;
    private int start;
    private int end;

    public Gugudan(int dan){
        this(dan, 1);
    }

    public Gugudan(int dan, int start){
        this(dan, start, 9);
    }

    public Gugudan(int dan, int start, int end){
        this.dan = dan;
        if(isNotPositiveNumber(start)){
            throw new IllegalStateException("단수의 시작은 1이상이어야 합니다.");
        }
        if(isNotPositiveNumber(end)){
            throw new IllegalStateException("단수의 종료는 1이상이어야 합니다.");
        }
        if(start > end){
            throw new IllegalStateException("단수의 시작은 단수의 종료보다 작아야 합니다.");
        }
        this.start = start;
        this.end = end;
    }

    private boolean isNotPositiveNumber(int number){
        return number <= 0;
    }

    public int[] createArrayDan() {
        int size = getArraySize();
        int[] result = new int[size];

        for(int i = start; i <= end; i++){
           result[i - 1] = time(i);
        }

        return result;
    }

    private int getArraySize(){
        return end - start + 1;
    }

    public int time(int multiplier){
        return dan * multiplier;
    }

    public void print(){
        int[] result = createArrayDan();

        for(int i = start; i <= end; i++){
            System.out.printf("%d * %d = %d\n", dan, i, result[i-1]);
        }
    }
}
