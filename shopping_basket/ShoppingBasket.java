package shopping_basket;

import java.util.*;

public class ShoppingBasket{

  ArrayList<Item> contents;
  int contentsValue;

  public ShoppingBasket(){
    this.contents = new ArrayList<Item>();
    this.contentsValue = 0;
  }

  public ArrayList<Item> getContents(){
    return this.contents;
  }

  public int getContentsValue(){
    return this.contentsValue;
  }

  public void addItem(Item item){
    this.contents.add(item);
    this.contentsValue += item.getPrice();
  }


}