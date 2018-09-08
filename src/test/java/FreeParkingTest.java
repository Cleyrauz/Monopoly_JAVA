import com.example.monopoly.model.board.space.FreeParking;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FreeParkingTest {

    FreeParking freeParking;

    @Before
    public void setUp(){
        freeParking = new FreeParking("FreeParking", "Collect the money located into the center of the board!");
    }

    @Test
    public void hasAName(){
      assertEquals("FreeParking", freeParking.getName());
    }

    @Test
    public void hasText(){
        assertEquals("Collect the money located into the center of the board!", freeParking.getText());
    }
}
