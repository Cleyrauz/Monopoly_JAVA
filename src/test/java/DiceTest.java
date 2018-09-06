import com.example.monopoly.model.Dice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class DiceTest {

    Dice dice;

    @Before
    public void setUp() {
        dice = new Dice();
    }

    @Test
    public void diceValueStartsInZero(){
        assertEquals(0, dice.getDiceValue());
    }

    @Test
    public void canRollTheDice(){
        assertTrue(String.valueOf(true), dice.roll());
    }

    @Test
    public void canCheckIsDoubles(){
        assertTrue(String.valueOf(true), dice.isDouble());
    }

}
