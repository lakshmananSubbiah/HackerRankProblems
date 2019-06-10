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

       Long time = System.nanoTime();
        int result = countingValleys(n, s);
        System.out.println("The time taken - "+(System.nanoTime()-time)+" ns");
        System.out.println(result);
        time = System.nanoTime();
        int result2 = countingValleys2(n,s);
        System.out.println("The time taken - "+(System.nanoTime()-time)+" ns");
        System.out.println(result2);

        scanner.close();
    }
    
	public static int countingValleys2(int n, String s) {
		int lvl = 0;
		int valleys = 0;
		for(char c : s.toCharArray()) {
			if(c == 'U') ++lvl;
			if(c == 'D') --lvl;
			
			if(lvl ==0 && c== 'U')
				valleys++;
		}
		return valleys;
	}
    
}





    
