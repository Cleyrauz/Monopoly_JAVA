import com.example.monopoly.model.Dice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
