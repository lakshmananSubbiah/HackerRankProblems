package hackerRankProblems.hacker_rank_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers = br.readLine();
		System.out.println(hIndex(numbers));
	}
	
	public static int hIndex(String numbers) {
		if(numbers == null || numbers.length() ==0) {
			return 0;
		}
		int[] citations = getArrayOfNumbers(numbers);
		Arrays.sort(citations);
        int count = 0;
        int result = 0;
        for(int i = citations.length-1;i>=0;i--){
            count++;
            if(citations[i]>=count){
            result = count;
            }else{
                break;
            }
        }
        return result;
	}

	private static int[] getArrayOfNumbers(String numbers) {
		String[] split = numbers.split(",");
		int[] array = new int[split.length];
		for(int i =0; i<split.length;i++) {
			array[i] = Integer.parseInt(split[i]);
		}
		return array;
	}
}
