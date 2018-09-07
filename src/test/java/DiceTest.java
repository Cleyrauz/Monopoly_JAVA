import com.example.monopoly.model.Dice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class DiceTest {

    Dice dice;

    @Before
    public void setUp() {
        dice = new Dice(1);
    }

    @Test
    public void diceValueStartsInZero(){
        assertEquals(0, dice.getDiceValue());
    }

    @Test
    public void canRollTheDice(){
        dice.roll();
            assertTrue("roll() is true, if the value after throws the dice is different to 0",
                    dice.getDiceValue() != 0);
    }

    @Test
    public void canCheckIsDouble(){
        dice.roll();
        assertTrue(dice.isDouble());
    }

    @Test(expected = IllegalArgumentException.class)
    public void diceValueIsNotZero(){
        dice = new Dice(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void diceValueGraterThanSix(){
        dice = new Dice(7);
    }

}
