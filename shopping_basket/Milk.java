package shopping_basket;

public class Milk implements Item {

  String name;
  int value;
  boolean bogof;

  public Milk(){
    this.name = "Skimmed Milk";
    this.value = 200;
    this.bogof = true;
  }

  public String getName(){
    return this.name;
  }

}