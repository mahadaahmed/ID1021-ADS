class Main {
  public static void main(String[] args) {
    Item[] items = new Item[100];
    ItemType typeValue = ItemType.VALUE;
    ItemType typeWMUL = ItemType.WMUL;
    ItemType typeAdd = ItemType.ADD;
    ItemType typeMOD = ItemType.MOD;
    ItemType typeSUB = ItemType.SUB;
    
    
    items[0] = new Item(typeValue, 10);
    
    items[1] = new Item(typeValue, 9);//
    
    items[2] = new Item(typeValue, 2);
    items[3] = new Item(typeWMUL, 0);
    
    items[4] = new Item(typeValue, 4);//
    
    items[5] = new Item(typeAdd, 0);
    
    items[6] = new Item(typeValue, 0);//
    
    items[7] = new Item(typeValue, 2);
    items[8] = new Item(typeWMUL, 0);
    items[9] = new Item(typeAdd, 0);
    
    items[10] = new Item(typeValue, 6);//
    
    items[11] = new Item(typeAdd, 0);
    
    items[12] = new Item(typeValue, 1);//
    
    items[13] = new Item(typeValue, 2);
    items[14] = new Item(typeWMUL, 0);
    items[15] = new Item(typeAdd, 0);
    
    items[16] = new Item(typeValue, 6);//
    
    items[17] = new Item(typeAdd, 0);
    
    items[18] = new Item(typeValue, 0);//
    
    items[19] = new Item(typeValue, 2);
    items[20] = new Item(typeWMUL, 0);
    items[21] = new Item(typeAdd, 0);
    
    items[22] = new Item(typeValue, 3);//
    
    items[23] = new Item(typeAdd, 0);
    
    items[24] = new Item(typeValue, 7);//
    
    items[25] = new Item(typeValue, 2);
    items[26] = new Item(typeWMUL, 0);
    items[27] = new Item(typeAdd, 0);
    items[28] = new Item(typeMOD, 0);
    items[29] = new Item(typeSUB, 0);
    items[30] = new Item(typeMOD, 0);
    
    
    
    
    
    
    DynamicCalculator calc = new DynamicCalculator(items);

    int result = calc.run();
    System.out.println(result);
  }
}