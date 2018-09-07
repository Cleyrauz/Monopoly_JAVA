import com.example.monopoly.model.Street;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StreetTest {

    Street street;

    @Before
    public void setUp(){
        street = new Street("Piccadilly", "M260");
    }

    @Test
    public void hasAName(){
        assertEquals("Piccadilly", street.getName());
    }

    @Test
    public void hasAText(){
        assertEquals("M260", street.getText());
    }

}
