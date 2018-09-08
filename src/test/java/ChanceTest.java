import com.example.monopoly.model.board.space.Chance;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChanceTest {

    Chance chance;

    @Before
    public void setUp(){
        chance = new Chance("Chance", "?");
    }

    @Test
    public void hasAName(){
        assertEquals("Chance", chance.getName());
    }

    @Test
    public void hasText(){
        assertEquals("?", chance.getText());
    }
}
