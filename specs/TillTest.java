import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;

public class TillTest{

  Till till;
  ShoppingBasket shoppingBasket;
  Milk milk1;
  Milk milk2;
  Milk milk3;
  Milk milk4;
  Apples apples1;
  Apples apples2;
  Apples apples3;
  BirthdayCake birthdayCake1;
  BirthdayCake birthdayCake2;
  BirthdayCake birthdayCake3;
  DogFood dogFood1;
  DogFood dogFood2;
  DogFood dogFood3;


  @Before 
  public void before(){
    till = new Till();
    shoppingBasket = new ShoppingBasket();
    milk1 = new Milk();
    milk2 = new Milk();
    milk3 = new Milk();
    milk4 = new Milk();
    apples1 = new Apples();
    apples2 = new Apples();
    apples3 = new Apples();
    birthdayCake1 = new BirthdayCake();
    birthdayCake2 = new BirthdayCake();
    birthdayCake3 = new BirthdayCake();
    dogFood1 = new DogFood();
    dogFood2 = new DogFood();
    dogFood3 = new DogFood();
  }

  @Test
  public void testCanGetItemsTotalPrice(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(apples1);
    assertEquals(700, till.getItemsTotalPrice(shoppingBasket));
  }


  @Test
  public void testBOGOFDiscount(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(apples1);
    assertEquals(500, till.applyBOGOFDiscount(shoppingBasket));
  }

  @Test
  public void testBOGOFDiscountNotApplied(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(apples1);
    shoppingBasket.addItem(apples2);
    shoppingBasket.addItem(birthdayCake1);
    assertEquals(1800, till.applyBOGOFDiscount(shoppingBasket));
  }

  @Test
  public void testBOGOFDiscountThreeBOGOFItems(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(milk3);
    assertEquals(400, till.applyBOGOFDiscount(shoppingBasket));
  }

  @Test
  public void testBOGOFDiscountFourBOGOFItems(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(milk3);
    shoppingBasket.addItem(milk4);
    assertEquals(400, till.applyBOGOFDiscount(shoppingBasket));
  }

  @Test
  public void testBOGOFDiscountMultipleBOGOFClasses(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(milk3);
    shoppingBasket.addItem(dogFood1);
    shoppingBasket.addItem(dogFood2);
    shoppingBasket.addItem(dogFood3);
    assertEquals(3400, till.applyBOGOFDiscount(shoppingBasket));
  }

  @Test
  public void test10PercentDiscountApplied(){
    assertEquals(2700, till.apply10PercentDiscount(3000));
  }

  @Test
  public void test10PercentDiscountRouning(){
    assertEquals(2704, till.apply10PercentDiscount(3005));
  }

  @Test
  public void test10PercentDiscountNotApplied(){
    assertEquals(2000, till.apply10PercentDiscount(2000));
  }

  @Test
  public void testLoyaltyDiscount(){
    assertEquals(98, till.applyLoyaltyDiscount(100, true));
  }

  @Test
  public void testLoyaltyDiscountNotApplied(){
    assertEquals(100, till.applyLoyaltyDiscount(100, false));
  }

  @Test
  public void testApplyAllDiscountsNoneApply(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(apples1);
    shoppingBasket.addItem(apples2);
    assertEquals(800, till.applyAllDiscounts(shoppingBasket, false));
  }

  @Test
  public void testApplyAllDiscountsBOGOF(){
    shoppingBasket.addItem(milk1);
    shoppingBasket.addItem(milk2);
    shoppingBasket.addItem(apples1);
    assertEquals(500, till.applyAllDiscounts(shoppingBasket, false));
  }

}