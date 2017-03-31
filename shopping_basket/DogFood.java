package shopping_basket;

public class DogFood implements Item{

  String name;
  int price;
  boolean bogof;

  public DogFood(){
    this.name = "Premium Dog Food";
    this.price = 1500;
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