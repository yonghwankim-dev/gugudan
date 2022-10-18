package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Input {

    private Input(){

    }

    public static int inputDan() {
        int dan;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            dan = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("정수를 입력해주세요. " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dan;
    }
}
