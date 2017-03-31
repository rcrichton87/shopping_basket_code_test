import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class ShoppingBasketTest{

  ShoppingBasket shoppingBasket;

  @Before
  public void before(){
    shoppingBasket = new ShoppingBasket();
  }

  @Test
  public void testShoppingBasketStartsEmpty(){
    assertEquals(0, shoppingBasket.getContents().size());
  }

}