import com.example.monopoly.model.board.space.Service;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ServiceTest {

    Service service;

    @Before
    public void setUp(){
        service = new Service("Kings Cross Station", "M200");
    }

    @Test
    public void hasAName(){
       assertEquals("Kings Cross Station", service.getName());
    }

    @Test
    public void hasText(){
        assertEquals("M200", service.getText());
    }

}
