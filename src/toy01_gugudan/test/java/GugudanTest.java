package toy01_gugudan.test.java;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import toy01_gugudan.main.java.Gugudan;

public class GugudanTest {

    private Gugudan gugudan;
    private int[] values;

    @After
    public void print(){
        gugudan.print();
    }

    @Test
    public void test1(){
        int[] expected = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        gugudan = new Gugudan(0);
        values = gugudan.calc();
        Assert.assertArrayEquals(expected, values);
    }

    @Test
    public void test2(){
        int[] expected = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18};
        gugudan = new Gugudan(2);
        values = gugudan.calc();
        Assert.assertArrayEquals(expected, values);
    }

    @Test
    public void test3(){
        int[] expected = new int[] {-2, -4, -6, -8, -10, -12, -14, -16, -18};
        gugudan = new Gugudan(-2);
        values = gugudan.calc();
        Assert.assertArrayEquals(expected, values);
    }
}
