public class City {

    String name;
    Connection[] neighbors;

    public City(String name){
        this.name = name;
        neighbors = new Connection[51];
    }

    public void addConnection(City destination, Integer distance){
        Connection Connection = new Connection(destination, distance);
        for (int i = 0; i < neighbors.length; i++) {
            if(neighbors[i] == null){
                neighbors[i] = Connection;
                return;
            }
        }
    }
    public void connectBidirectionally(City city, Integer distance) {
        this.addConnection(city, distance);
        city.addConnection(this, distance);
    }


}
