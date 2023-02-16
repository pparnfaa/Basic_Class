package Class_Programming;

import java.util.Scanner;

class Dept {
    int N;
    int K;
    int ministryBudge;
    int eduFee;
    int serviceFee;
    int donation;

    Dept(int N, int K) {
        this.N = N;
        this.K = K;
    }

    void computeIncome(int N, int K) {
        ministryBudge = (N * 500000) + (K * 3000);
        eduFee = K * 5000;
        serviceFee = 300000;
        donation = 100000;
        System.out.println("ministry budget = " + ministryBudge);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        Dept data = new Dept(N, K);
        data.computeIncome(N, K);
    }
}
