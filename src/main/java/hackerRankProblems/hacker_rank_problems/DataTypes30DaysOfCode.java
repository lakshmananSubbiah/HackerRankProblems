package hackerRankProblems.hacker_rank_problems;

import java.util.Scanner;

public class DataTypes30DaysOfCode {
	// Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip_prc = tip_percent * 0.01;
        double tax_prc = tax_percent * 0.01;
        
        double tip = meal_cost*(tip_prc);
        double tax =meal_cost*(tax_prc);
        
        System.out.println(Math.round(tip+tax+meal_cost));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
