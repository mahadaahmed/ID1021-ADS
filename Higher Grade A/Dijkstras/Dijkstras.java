import java.util.*;

class Dijkstras {
  private PriorityQueue<Integer> pq;
  Integer dist[];
  public Set<Integer> settled;
  Map map;

  public Dijkstras() {
    map = new Map("trains.csv");
    dist = new Integer[52];
    settled = new HashSet<Integer>();
    pq = new PriorityQueue<Integer>();
  }

  public void dijkstras (int from, int to ){

    for (int i = 0; i < dist.length; i++)
      dist[i] = Integer.MAX_VALUE;
    dist[from] = 0;

    pq.add(from);

    while (!pq.isEmpty()){
      City current = getCityWithNumber(pq.poll());
      settled.add(current.number);

      if (current == getCityWithNumber(to))
        break;

      for (Connection conn: current.neighbors){
        if(conn != null){
          if (!pq.contains(conn.city.number) && !settled.contains(conn.city.number)){
            pq.add(conn.city.number);
            dist[conn.city.number] = dist[current.number] + conn.distance;
          }
          else{
            if (dist[current.number] + conn.distance < dist[conn.city.number])
              dist[conn.city.number] = dist[current.number] + conn.distance;
          }
        }
      }
    }

    for (int i: settled){
      System.out.println("Snabbaste vägen till staden " + getCityWithNumber(i).name + " från staden " + getCityWithNumber(from).name + " är " + dist[i] + " lång");
    }

  }

  public City getCityWithNumber (int cityNumber){
    for (int i = 0; i < map.cities.length; i++)
      if(map.cities[i] != null)
        if (map.cities[i].number == cityNumber)
          return map.cities[i];
    return null;
  }

  public int getNumberWithCity(String cityName){
    for (int i = 0; i < map.cities.length; i++)
      if(map.cities[i] != null)
        if (map.cities[i].name.equals(cityName))
          return map.cities[i].number;
    return -1;
  }

public void main(String[] args1) {
}

  /*public void computePath(City sourceCity) {
    sourceVertex.setMinDistance(0);
    PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(sourceVertex);

    while (!priorityQueue.isEmpty()) {
      Vertex vertex = priorityQueue.poll();

      for (Edge edge : vertex.getEdges()) {
        Vertex v = edge.getTargetVertex();*/
//                Vertex u = edge.getStartVertex();
        /*double weight = edge.getWeight();
        double minDistance = vertex.getMinDistance() + weight;

        if (minDistance < v.getMinDistance()) {
          priorityQueue.remove(vertex);
          v.setPreviosVertex(vertex);
          v.setMinDistance(minDistance);
          priorityQueue.add(v);
        }
      }
    }
  }*/
 

   

   

   

  
}