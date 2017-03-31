import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class ItemTest{

  Milk milk;

  @Before
  public void before(){
    milk = new Milk();
  }

  @Test
  public void testItemHasName(){
    assertEquals("Skimmed Milk", milk.getName());
  }

  @Test
  public void testItemHasPrice(){
    assertEquals(200, milk.getPrice());
  }

  @Test
  public void testItemHasBOGOF(){
    assertEquals(true, milk.isBOGOF());
  }

}