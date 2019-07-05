package hackerRankProblems.hacker_rank_problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegularExpression30DaysOfCode {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {    
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	       List<String> strings = new ArrayList<String>();
	        
	        
	        String regex = "^(.+)@gmail.com$";
	         
	        Pattern pattern = Pattern.compile(regex);
	        
	        for (int NItr = 0; NItr < N; NItr++) {
	            String[] firstNameEmailID = scanner.nextLine().split(" ");

	            String firstName = firstNameEmailID[0];

	            String emailID = firstNameEmailID[1];
	            Matcher matcher = pattern.matcher(emailID);
	            if(matcher.matches()) {
	            	strings.add(firstName);
	            }
	        }
	        String[] array = strings.toArray(new String[strings.size()]);
	        Arrays.sort(array);
	        for(int i = 0;i<array.length;i++) {
	        	System.out.println(array[i]);
	        }
	        
	        scanner.close();
	}

}
