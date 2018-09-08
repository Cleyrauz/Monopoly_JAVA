import com.example.monopoly.controller.Game;
import com.example.monopoly.model.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void setUp(){
        game = new Game();
        game.setUpPlayers("Cleyra","Cheche");
    }

    @Test
    public void canSetUpPlayers(){
        assertEquals(2, game.setUpPlayers("Cleyra", "Cheche").length);
    }

    @Test
    public void canDeterminateWhoPlayFirst(){
        assertEquals("Cleyra", game.whoPlayFirst(12,6).getName());
    }

    @Test
    public void canNotDeterminateWhoPlayFirst(){
        assertEquals(null, game.whoPlayFirst(6,6));
    }


}
