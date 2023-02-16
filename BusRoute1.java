package Class_Programming;

import java.util.Scanner;

class Route {
    String names[];
    int distances[];

    Route(String names[], int distances[]) {
        this.names = names;
        this.distances = distances;
    }

    void getStopInfo(int target) {
        if (target <= 0 || target > names.length - 1) {
            System.out.println("invalid number");
        } else {
            System.out.println(names[target] + " " + distances[target]);
        }
    }

}

public class BusRoute1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route data = new Route(names, distances);
        final int K = scan.nextInt();
        for (int i = 1; i < K + 1; ++i) {
            int target = scan.nextInt();
            data.getStopInfo(target);
        }
    }
}
