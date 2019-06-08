package hackerRankProblems.hacker_rank_problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {
	


	    // Complete the jumpingOnClouds function below.
	    static int jumpingOnClouds(int[] c) {
	    	//Initializing Index with the starting point
	    	int index = 0;
	    	
	    	//Initializing the number of steps
	    	int numberOfSteps = 0;
	    	
	    	while(true) {
	    		if(index == c.length -1 ) {
	    			break;
	    		}
	    		if(index<=c.length-3 && c[index+2]== 0) {
	    			index = index+2;
	    			numberOfSteps++;
	    		}
	    		else if( index <= c.length-2 ) {
	    			index=index+1;
	    			numberOfSteps++;
	    		}
	    	}
	    	return numberOfSteps;
	    }

	  

	    public static void main(String[] args) throws IOException {

	        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
	    	int n = Integer.parseInt(scanner.readLine());

	        int[] c = new int[n];

	        String[] cItems = scanner.readLine().split(" ");

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            c[i] = cItem;
	        }

	        int result = jumpingOnClouds(c);

	        System.out.println(result);
	        scanner.close();
	    }
	}

