package hackerRankProblems.hacker_rank_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPrefixes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strings = br.readLine();
		System.out.print(findPrefix(strings.split(",")));
		
	}

	private static String findPrefix(String[] split) {
		if(split.length == 0) {
			return "";
		}
		else if(split.length == 1) {
			return split[0];
		}
		
		String prefix = split[0];
		for(int i=1;i<split.length;i++) {
			prefix = calculatePrefix(prefix, split[i]);
		}
		return prefix;
	}

	private static String calculatePrefix(String prefix, String string) {
		int min = Math.min(prefix.length(), string.length());
		int i =0;
		for( i =0; i<min;i++) {
			if(prefix.charAt(i) != string.charAt(i)) {
				return prefix.substring(0, i);
			}
		}
		return prefix.substring(0,i);
	}
	

	
}
