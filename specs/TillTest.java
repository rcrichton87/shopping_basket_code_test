import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class TillTest{

  Till till;
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
    till = new Till();
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
  public void testCanGetItemsTotalPrice(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(apples1);
    assertEquals(700, till.getItemsTotalPrice(shoppingBasket));
  }

}