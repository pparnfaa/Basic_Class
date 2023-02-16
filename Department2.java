package Class_Programming;

import java.util.Scanner;

class Dept2 {
    int N;
    int K;
    int ministryBudge;
    int eduFee;
    int serviceFee;
    int donation;
    int salary;
    int elec;
    int eduCost;
    int total_income = 0, total_exp = 0;

    Dept2(int N, int K) {
        this.N = N;
        this.K = K;
    }

    int computeIncome(int N, int K) {
        this.ministryBudge = (N * 500000) + (K * 3000);
        this.eduFee = K * 5000;
        this.serviceFee = 300000;
        this.donation = 100000;
        total_income = ministryBudge + eduFee + serviceFee + donation;
        return total_income;
    }

    int computeExpense(int N, int K) {
        this.salary = N * 600000;
        this.elec = (N + K) * 2000;
        this.eduCost = K * 4000;
        total_exp = salary + elec + eduCost;
        return total_exp;
    }

    void printReport() {
        System.out.println("ministry budget = " + ministryBudge);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        Dept2 data = new Dept2(N, K);
        System.out.println("total income = " + data.computeIncome(N, K));
        System.out.println("total expense = " + data.computeExpense(N, K));
        System.out.println("income - expense = " + (data.computeIncome(N, K) - data.computeExpense(N, K)));
        data.printReport();
    }
}
