import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;
import java.util.*;

public class ShoppingBasketTest{

  ShoppingBasket shoppingBasket;
  Milk milk1;
  Milk milk2;
  Milk milk3;
  Apples apples1;
  Apples apples2;
  Apples apples3;
  BirthdayCake birthdayCake1;
  BirthdayCake birthdayCake2;
  BirthdayCake birthdayCake3;
 

  @Before
  public void before(){
    shoppingBasket = new ShoppingBasket();
    milk1 = new Milk();
    milk2 = new Milk();
    milk3 = new Milk();
    apples1 = new Apples();
    apples2 = new Apples();
    apples3 = new Apples();
    birthdayCake1 = new BirthdayCake();
    birthdayCake2 = new BirthdayCake();
    birthdayCake3 = new BirthdayCake();
    
  }

  @Test
  public void testShoppingBasketStartsEmpty(){
    assertEquals(0, shoppingBasket.getContents().size());
  }

  @Test 
  public void testCanAddItemToBasket(){
    ArrayList<Item> expected = new ArrayList<Item>();
    expected.add(milk1);
    shoppingBasket.addItem(milk1);
    assertEquals(expected, shoppingBasket.getContents());
  }

  @Test
  public void testCanAddMultipleTypesToBasket(){
    ArrayList<Item> expected = new ArrayList<Item>();
    expected.add(apples1);
    expected.add(birthdayCake1);
    shoppingBasket.addItem(apples1);
    shoppingBasket.addItem(birthdayCake1);
    assertEquals(expected, shoppingBasket.getContents());
  }

  @Test
  public void testContentsValueStartsZero(){
    assertEquals(0, shoppingBasket.getContentsValue());
  }

}