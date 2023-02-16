package Class_Programming;

import java.util.Scanner;

class Route3 {
    String names[];
    int distances[];
    int sum_dis = 0;

    Route3(String names[], int distances[]) {
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

    void getTripInfo(int target, int target2) {
        int count = 0;
        int sum_dis = 0;
        for (int i = 1; i < names.length; i++) {
            if (target > target2 || target == target2 || target < 1 || target >= names.length || target2 < 1
                    || target2 >= names.length) {
                count = 0;
            } else {
                count++;
                if (i == target) {
                    System.out.print(names[i] + " ");
                }
                if (i == target2) {
                    System.out.print(names[i] + " ");
                }
                if (i > target && i <= target2) {
                    sum_dis += distances[i];
                }
            }
        }
        if (count == 0) {
            System.out.println("invalid number");
        } else {
            System.out.println(sum_dis);
        }

    }
}

public class BusRoute3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route3 data = new Route3(names, distances);
        final int K = scan.nextInt();
        for (int i = 1; i < K + 1; ++i) {
            int target = scan.nextInt();
            int target2 = scan.nextInt();
            data.getTripInfo(target, target2);
        }
    }
}
