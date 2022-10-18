package test;

import main.java.GugudanMenu;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class GugudanMenuTest {

    private static ByteArrayOutputStream outputMessage;

    @Before
    public void setUpStreams(){
        outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));
    }

    @After
    public void restoresStreams(){
        System.setOut(System.out);
    }

    @Test
    public void testShow(){
        GugudanMenu.show();
        String expected = "1. 구구단 출력" + System.lineSeparator();
        expected += "2. 종료" + System.lineSeparator();
        String actual = outputMessage.toString();

        assertThat(actual).isEqualTo(expected);
    }

}