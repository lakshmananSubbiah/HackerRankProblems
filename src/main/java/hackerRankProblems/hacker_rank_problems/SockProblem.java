package hackerRankProblems.hacker_rank_problems;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockProblem {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	        Long time = System.nanoTime();
	        int result1 = sockMerchant(n, ar);
	        System.out.println("Time Taken : "+(System.nanoTime()-time)+" ns");
	        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	        System.out.println("Memory taken: "+(afterUsedMem-beforeUsedMem));
	        System.out.println(result1);
	        beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	        time = System.nanoTime();
	        int result2 = sockMerchant2(n,ar);
	        System.out.println("Time Taken : "+(System.nanoTime()-time)+" ns");
	        afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	        System.out.println("Memory taken: "+(afterUsedMem-beforeUsedMem));
	        System.out.println(result2);
	        beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	        time = System.nanoTime();
	        int result3 = sockMerchant3(n,ar);
	        System.out.println("Time Taken : "+(System.nanoTime()-time)+" ns");
	        afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	        System.out.println("Memory taken: "+(afterUsedMem-beforeUsedMem));
	        System.out.println(result3);
	        
	}
	private static int sockMerchant(int n, int[] ar) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int val: ar) {
			if(!set.add(val)) {
				count++;
				set.remove(val);
			}
		}
		return count;
	}
	private static int sockMerchant3(int n, int[] ar) {
		BitSet bitSet = new BitSet(101);
		bitSet.clear();
		int count = 0;
		for(int val: ar) {
			if(bitSet.get(val)) {
				 count++;
			}
			bitSet.flip(val);
		}
		return count;
	}
	private static int sockMerchant2(int n, int[] ar) {
		int newArr[] = new int[101];
        int pairCount = 0;
        for(int i=0;i<n;i++) {
            newArr[ar[i]]++;
            if(newArr[ar[i]] % 2 ==0) {
                pairCount++;
            }
        }
        return pairCount;
	}
	
}
