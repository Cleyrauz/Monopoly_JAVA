import com.example.monopoly.model.board.space.GoToJail;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoToJailTest {

    GoToJail goToJail;

    @Before
    public void setUp(){
        goToJail = new GoToJail("Go to Jail", "Just visiting");
    }

    @Test
    public void hasName(){
        assertEquals("Go to Jail", goToJail.getName());
    }

    @Test
    public void hasText(){
        assertEquals("Just visiting", goToJail.getText());
    }
}
