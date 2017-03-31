package shopping_basket;

public class Milk implements Item {

  String name;
  int price;
  boolean bogof;

  public Milk(){
    this.name = "Skimmed Milk";
    this.price = 200;
    this.bogof = true;
  }

  public String getName(){
    return this.name;
  }

  public int getPrice(){
    return this.price;
  }

  public boolean isBOGOF(){
    return this.bogof;
  }

}