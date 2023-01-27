class Main {
  public static void main(String[] args) {
    LinkedListPrioAdd list = new LinkedListPrioAdd ();

    list.add(3);
    list.add(1);
    list.add(2);
    list.add(6);

    Node temp = list.first;
    while (temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
    System.out.println("Den vi removade " + list.remove());

    temp = list.first;
    while (temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
    System.out.println("Här är den andra");
    LinkedListPrioRemove lista = new LinkedListPrioRemove();

    lista.add(3);
    lista.add(2);
    lista.add(2);
    lista.add(6);
    lista.add(1);
    
    temp = lista.first;
    while (temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
    System.out.println("Den vi removade " + lista.remove());

    temp = lista.first;
    while (temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
  }
}