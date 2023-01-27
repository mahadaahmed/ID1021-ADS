public class Item{
  private ItemType type;
  private int value = 0;
  
  public ItemType getType(){
    return this.type;
  }

  public int getValue(){
    return this.value;
  }

  public Item (ItemType type, int value){
    this.value = value;
    this.type = type;
  }
}