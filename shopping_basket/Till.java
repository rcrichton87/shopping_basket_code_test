package shopping_basket;

import java.util.*;

public class Till{

  public Till(){

  }

  public int getItemsTotalPrice(ShoppingBasket shoppingBasket){
    int totalPrice = 0;
    for (Item item : shoppingBasket.getContents()){
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }

}