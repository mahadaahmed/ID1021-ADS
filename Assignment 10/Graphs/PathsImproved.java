public class PathsImproved {
    City[] path;
    int sp;
    public PathsImproved() {
        path = new City[54];
        sp = 0;
    }

    public void main(String[] args) {
        Map map = new Map("trains.csv");
        String from = args[0];
        String to = args[1];

        Integer max = Integer.valueOf(args[2]);
        long t0 = System.nanoTime();
        Integer dist = shortest(map.lookup(from), map.lookup(to), max);
        long time = (System.nanoTime() - t0)/1_000_000;
        System.out.println("shorest: " + dist + " min (" + time + " ms)");
    }

    private Integer shortest(City from, City to, Integer max) {

        if (max < 0)
            return null;
        if (from == to)
            return 0;

        for (int i = 0; i < sp; i++) {
            if (path[i] == from)
                return null;
        }
        path[sp++] = from;

        Integer shrt = null;

        for (int i = 0; i < from.neighbors.length; i++) {
            if (from.neighbors[i] != null) {
                Connection conn = from.neighbors[i];
                Integer dist = shortest(from.neighbors[i].city, to, max - conn.distance);
                if (dist != null){
                    dist += conn.distance;
                    if (shrt == null || dist < shrt)
                        shrt = dist;
                    if (max > shrt && (shrt != null))
                        max = shrt;
                }
            }
        }

        path[sp--] = null;
        return shrt;
    }
}
