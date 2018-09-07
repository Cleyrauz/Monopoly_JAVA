import com.example.monopoly.model.CommunityChest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CommunityChestTest {

    CommunityChest communityChest;

    @Before
    public void setUp(){
      communityChest = new CommunityChest("Community Chest", "Pick a card!");
    }

    @Test
    public void hasName(){
        assertEquals("Community Chest", communityChest.getName());
    }

    @Test
    public void hasText(){
        assertEquals("Pick a card!", communityChest.getText());
    }
}
