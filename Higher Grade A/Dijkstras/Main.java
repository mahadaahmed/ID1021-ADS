class Main{

    public static void main(String[] args) {
      Paths path = new Paths();
      PathsImproved imp = new PathsImproved();
      Dijkstras dijkstras = new Dijkstras();
      String[] args1  ={"Stockholm", "Kiruna", "10000"};
      //path.main(args1);
      dijkstras.main(args1);

    }

}


