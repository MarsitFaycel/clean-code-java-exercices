package no.nerdschool.uglycode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HltchkTest {

    @Test
    public void addOperator() {
        String word = "1 + 3";
        //Do stuff here
        assertEquals(Hltchk.parseExpression(word), 4);
    }

    @Test
    public void substractOperator() {
        String word = "9 - 4";
        //Do stuff here
        assertEquals(Hltchk.parseExpression(word), 5);
    }

    @Test
    public void multiplyOperator() {
        String word = "3 * 5";
        //Do stuff here
        assertEquals(Hltchk.parseExpression(word), 15);
    }

    @Test
    public void divideOperator() {
        String word = "5 / 3";
        //Do stuff here
        assertEquals(Hltchk.parseExpression(word), 1);
    }

    @Test
    public void divideOperator_with_ZERO() {
        String word = "5 / 0";
        //Do stuff here
        try {
            Hltchk.parseExpression(word);
        } catch (RuntimeException ex) {
            assertEquals(ex.getMessage(), Hltchk.ERROR_MESSAGE_DIVIDE_BY_ZERO);
        }
    }
}
