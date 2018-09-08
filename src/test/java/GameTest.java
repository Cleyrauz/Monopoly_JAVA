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
    }

    @Test
    public void canSetUpPlayers(){
        assertEquals(2, game.setUpPlayers("Cleyra", "Cheche").length);
    }

//    @Test
//    public void canDeterminateWhoPlayFirst(){
//
//    }


}
