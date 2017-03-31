package shopping_basket;

public class Apples implements Item{

  String name;
  int price;
  boolean bogof;

  public Apples(){
    this.name = "12 pack of Apples";
    this.price = 300;
    this.bogof = false;
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