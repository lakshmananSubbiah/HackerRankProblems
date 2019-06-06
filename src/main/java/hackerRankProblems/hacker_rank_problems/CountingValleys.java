package hackerRankProblems.hacker_rank_problems;

import java.io.*;
import java.util.*;

public class CountingValleys {

		public static int countingValleys(int n, String s) {
			int valleys=0, currentStream=0, height =0;
			if(s== null) {
				throw new RuntimeException("The string is null");
			}
			if(s.length() != n) {
				throw new RuntimeException("The string is greater than given Length");
			}
		
			for(char c : s.toCharArray()) {
				if(c == 'U') {
					if(currentStream == 0) {
						currentStream = 1;
						height++;
					}
					else if(currentStream < 0) {
						height++;
						currentStream = height == 0? 0: currentStream;
					}
					else {
						height ++;
					}
				}
				else if(c == 'D') {
					if(currentStream == 0) {
						valleys ++;
						currentStream = -1;
						height --;
					}
					else if( currentStream > 0 ) {
						height--;
						currentStream = height==0? 0 : currentStream;
					}
					else {
						height --;
					}
				}
				else {
					throw new RuntimeException("Different Characters Present in String");
				}
			}
			return valleys;
		}

    
	private static final Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}





    
