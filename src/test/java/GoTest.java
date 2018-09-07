import com.example.monopoly.model.Go;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoTest {

    Go go;

    @Before
    public void setUp(){
        go = new Go("Go", "Collect M200 salary as you pass!");
    }

    @Test
    public void hasAName(){
      assertEquals("Go", go.getName());
    }
    
    @Test
    public void hasText(){
        assertEquals("Collect M200 salary as you pass!", go.getText());

    }
}
