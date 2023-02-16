package Class_Programming;

import java.util.Scanner;

class Route2 {
    String names[];
    int distances[];
    int sum_dis = 0;

    Route2(String names[], int distances[]) {
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

    void summarizeRoute() {
        int sum_dis = 0;
        for (int i = 1; i < names.length; i++) {
            sum_dis += distances[i];
            if (i == 1) {
                System.out.print(names[i] + " ");
            } else if (i == names.length - 1) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.print(sum_dis);
    }

}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route2 data = new Route2(names, distances);
        data.summarizeRoute();
    }
}
