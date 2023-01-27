

class Main{

    public static void main(String[] args) {
        Map map = new Map("trains.csv");
        //map.printNeighbours();

        /*int i = 0;
        while (map.cities[map.hash("Stockholm")].neighbors[i] != null) {
            System.out.println(map.cities[map.hash("Stockholm")].neighbors[i].city.name);
            i++;
        }*/
         Paths path = new Paths();
        PathsImproved imp = new PathsImproved();
        String[] args1 = {"Malmö", "Göteborg", "200"};
       // Naive.main(args1);
        path.main(args1);
        imp.main(args1);

     

        }
    }
