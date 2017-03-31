import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class ItemTest{

  Milk milk1;

  @Before
  public void before(){
    milk1 = new Milk();
  }

  @Test
  public void testItemHasName(){
    assertEquals("Skimmed Milk", milk1.getName());
  }

}