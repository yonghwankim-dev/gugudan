package test;


import main.java.Gugudan;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class GugudanTest {
    
    @Test
    public void testTime(){
        Gugudan gugudan = new Gugudan(2);
        assertThat(gugudan.time(5)).isEqualTo(10);
    }

    @Test
    public void testTime_danIsZero(){
        Gugudan gugudan = new Gugudan(0);
        assertThat(gugudan.time(5)).isEqualTo(0);
    }

    @Test
    public void testTime_danIsNegative(){
        Gugudan gugudan = new Gugudan(-1);
        assertThat(gugudan.time(5)).isEqualTo(-5);
    }

    @Test
    public void testCreateArrayDan(){
        Gugudan gugudan = new Gugudan(2);
        assertThat(gugudan.createArrayDan()).isEqualTo(new int[]{2,4,6,8,10,12,14,16,18});
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateArrayDan_startIsZero(){
        Gugudan gugudan = new Gugudan(2, 0);
        fail("이 테스트는 실패해야 합니다. start는 양수여야 합니다.");
    }

    public void testCreateArrayDan_endIsSkip(){
        Gugudan gugudan = new Gugudan(2, 1);
        assertThat(gugudan.createArrayDan()).isEqualTo(new int[]{2,4,6,8,10,12,14,16,18});
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateArrayDan_whenStartIsMoreThanEnd(){
        Gugudan gugudan = new Gugudan(2, 2, 1);
        fail("이 테스트는 실패해야 합니다. start는 end보다 작아야 합니다.");
    }
    
    @Test
    public void testCreateArrayDan_whenStartEqualEnd(){
        Gugudan gugudan = new Gugudan(2, 1, 1);
        assertThat(gugudan.createArrayDan()).isEqualTo(new int[]{2});
    }

    @Test
    public void testCreateArrayDan_whenDanIsNegative(){
        Gugudan gugudan = new Gugudan(-2);
        assertThat(gugudan.createArrayDan()).isEqualTo(new int[]{-2, -4, -6, -8, -10, -12, -14, -16, -18});
    }

    @Test
    public void testPrint(){
        Gugudan gugudan = new Gugudan(2);
        gugudan.print();
    }

}
