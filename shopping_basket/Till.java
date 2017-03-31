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

  public int applyBOGOFDiscount(ShoppingBasket shoppingBasket){
    int totalPrice = this.getItemsTotalPrice(shoppingBasket);

    ArrayList<Item> basketContents = shoppingBasket.getContents();
    Set<Class> itemClasses = new HashSet<Class>();

    for (Item item : basketContents) {
      if (item.isBOGOF() == true ) {
        itemClasses.add(item.getClass()); // get all unique classes of BOGOF items in the basket
      }
    }

    ArrayList<Item> sameClassItems = new ArrayList<Item>();

    for (Class itemClass : itemClasses) { //for each class

      sameClassItems.clear();

      for (Item item : basketContents){
        if (itemClass == item.getClass() ){ //get all items of that class in an ArrayList
          sameClassItems.add(item);
        }
      }

      while (sameClassItems.size() > 1){ // if there are 2 or more BOGOF items left
        Item itemToDiscount = sameClassItems.get(0);
        totalPrice -= itemToDiscount.getPrice(); //subtract the price of one of them
        sameClassItems.remove(0);
        sameClassItems.remove(0); // remove two items, the one paid for + the free one
      }

    }

    return totalPrice;

  }

}