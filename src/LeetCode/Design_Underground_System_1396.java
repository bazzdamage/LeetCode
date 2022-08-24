package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

class UndergroundSystem {

    HashMap<String, int[]> routes;
    HashMap<Integer, String[]> onWay;

    public UndergroundSystem() {

        this.routes = new HashMap<>();
        this.onWay = new HashMap<>();

    }

    public void checkIn(int id, String stationName, int t) {

        this.onWay.put(id, new String[]{stationName, String.valueOf(t)});
    }

    public void checkOut(int id, String stationName, int t) {

        var temp = this.onWay.get(id);
        this.onWay.remove(id);

        String route = Arrays.toString(new String[]{temp[0], stationName});

        this.routes.putIfAbsent(route, new int[2]);

        var time = this.routes.get(route);
        time[0] += t - Integer.parseInt(temp[1]);
        time[1] += 1;

        this.routes.put(route, time);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = Arrays.toString(new String[]{startStation, endStation});
        int[] time = this.routes.get(route);

        return (double) time[0] / time[1];

    }
}
