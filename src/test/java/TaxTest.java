import com.example.monopoly.model.board.space.Tax;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaxTest {

    Tax tax;

    @Before
    public void setUp(){
        tax = new Tax("Super Tax", "Pay M100");
    }

    @Test
    public void hasAName(){
        assertEquals("Super Tax", tax.getName());
    }

    @Test
    public void hasText(){
        assertEquals("Pay M100", tax.getText());
    }
}
