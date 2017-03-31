package shopping_basket;

import java.util.*;

public class ShoppingBasket{

  ArrayList<Item> contents;
  int contentsValue;

  public ShoppingBasket(){
    this.contents = new ArrayList<Item>();
  }

  public ArrayList<Item> getContents(){
    return this.contents;
  }

  public void addItem(Item item){
    this.contents.add(item);
  }

  public void removeItem(Item item){
    this.contents.remove(item);
  }

  public void emptyBasket(){
    this.contents.clear();
  }


}