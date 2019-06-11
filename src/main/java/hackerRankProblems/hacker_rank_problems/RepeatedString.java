package hackerRankProblems.hacker_rank_problems;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
	 // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	if(s.length() == 1 && s.equals('a')) {
    		return n;
    	}
    	long occurenceOfA = findMaxOccurenceOfA(s);
    	long totalOccurence = ( n/s.length() * occurenceOfA);
    	int remainder =(int) (n%s.length());
    	long remainderOccurence = findMaxOccurenceOfA(s.substring(0,remainder));
    	return (totalOccurence+remainderOccurence);
    }

    private static long findMaxOccurenceOfA(String s) {
		long count=0;
    	for(char c: s.toCharArray()) {
			if(c == 'a') {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();

        long result = repeatedString(s, n);
        System.out.println(result);

        scanner.close();
    }
}
