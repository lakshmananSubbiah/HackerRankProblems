package hackerRankProblems.hacker_rank_problems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotate {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	int gcdVal = gcd(d,a.length);
    	for(int i=0;i<gcdVal;i++) {
    		int j = i,k;
    		int temp = a[i];
    		while(true) {
    			k = j+d;
    			if(k>=a.length) {
    				k = k-a.length;
    			}
    			if(k == i) {
    				break;
    			}
    			a[j] = a[k];
    			j=k;
    		}
    		a[j]= temp;
    	}
    	return a;
    }
    
   static int gcd(int a,int b) {
    	if( b==0) {
    		return a;
    	}
    	return gcd(b,a%b);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

      for(int ab: result) {
    	  System.out.print(ab);
      }


        scanner.close();
    }
}
