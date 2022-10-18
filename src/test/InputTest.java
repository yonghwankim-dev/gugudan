package test;

import main.java.Input;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class InputTest {

    @Test
    public void testInputDan(){
        //given
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        //when
        int dan = Input.inputDan();
        //then
        assertThat(dan).isEqualTo(2);
    }

    @Test(expected = NumberFormatException.class)
    public void testInputDan_wheninIsChracter_thenNumberFormatException(){
        //given
        ByteArrayInputStream in = new ByteArrayInputStream("a".getBytes());
        System.setIn(in);
        //when
        int dan = Input.inputDan();
        //then
        fail("이 테스트는 실패해야 합니다. dan은 정수여야합니다.");
    }

}