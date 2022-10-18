package main.java;

public final class GugudanMenu {
    private static final String OUTPUT_GUGUDAN = "1. 구구단 출력";
    private static final String EXIT = "2. 종료";
    private GugudanMenu(){

    }

    public static void show() {
        System.out.println(OUTPUT_GUGUDAN);
        System.out.println(EXIT);
    }
}
