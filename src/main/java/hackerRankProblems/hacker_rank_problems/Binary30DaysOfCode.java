package hackerRankProblems.hacker_rank_problems;

import java.util.Scanner;

public class Binary30DaysOfCode {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String base2value = Integer.toString(n,2);
        System.out.println(base2value);
        int counter = 0;
        int count =0;
        for(int i=0;i<base2value.length();i++){
            char c = base2value.charAt(i);
            if(c == '1'){
                counter++;
            }
            else{
                if(count<counter){
                    count = counter;
                }
                counter=0;
            }
        }
        if(count<counter) {
        	count = counter;
        }
        System.out.println(count);
        scanner.close();
    }
}
