package test;


import main.java.Gugudan;
import static org.assertj.core.api.Assertions.*;
import org.junit.After;

import org.junit.Assert;
import org.junit.Test;


public class GugudanTest {

    private Gugudan gugudan;
    private int[] values;

    @After
    public void print(){
        gugudan.print();
    }

    @Test
    public void test1(){
        //given
        gugudan = new Gugudan(0);
        int[] expected = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};

        //when
        values = gugudan.calc();

        //then
        assertThat(values).isEqualTo(expected);
    }

    @Test
    public void test2(){
        //given
        gugudan = new Gugudan(2);
        int[] expected = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18};

        //when
        values = gugudan.calc();

        //then
        assertThat(values).isEqualTo(expected);
    }

    @Test
    public void test4(){
        //given
        gugudan = new Gugudan(2, 1, 8);
        int[] expected = {2, 4, 6, 8, 10, 12, 14, 16};

        //when
        values = gugudan.calc();

        //then
        assertThat(values).isEqualTo(expected);
    }
}
