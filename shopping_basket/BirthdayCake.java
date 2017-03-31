package shopping_basket;

public class BirthdayCake implements Item{

  String name;
  int price;
  boolean bogof;

  public BirthdayCake(){
    this.name = "Birthday Cake";
    this.price = 1000;
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