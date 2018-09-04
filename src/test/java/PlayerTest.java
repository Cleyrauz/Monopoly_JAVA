import com.example.monopoly.model.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() {
        player = new Player("Cleyra");
    }

    @Test
    public void hasAName(){
      assertEquals("Cleyra", player.getName());
    }

    @Test
    public void hasPocketMoney(){
        assertEquals(1500, player.getPocketMoney(), 0.0);
    }

}
