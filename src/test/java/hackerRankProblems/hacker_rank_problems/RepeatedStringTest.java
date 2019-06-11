package hackerRankProblems.hacker_rank_problems;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class RepeatedStringTest {

	@Test
	public void findMaxOccurenceOfAValid() {
		long count = RepeatedString.findMaxOccurenceOfA("abc");
		assertThat(count,equalTo(1L));
	}
	
	@Test
	public void findMaxOccurenceOfAMissValid() {
		long count = RepeatedString.findMaxOccurenceOfA("cde");
		assertThat(count,equalTo(0L));
	}
	
	@Test
	public void findMaxOccurenceOfAMissEmpty() {
		long count = RepeatedString.findMaxOccurenceOfA("");
		assertThat(count,equalTo(0L));
	}
	
	@Test
	public void findMaxOccurenceOfAMissNull() {
		long count = RepeatedString.findMaxOccurenceOfA(null);
		assertThat(count,equalTo(0L));
	}
	
	@Test
	public void repeatedStringValidSmall() {
		long count = RepeatedString.repeatedString("abc", 1000);
		assertThat(count,equalTo(334L));
	}
	
	@Test
	public void repeatedStringValidNull() {
		long count = RepeatedString.repeatedString(null, 1000);
		assertThat(count,equalTo(0L));
	}
	
	@Test
	public void repeatedStringValidsingle() {
		long count = RepeatedString.repeatedString("a", 1000000000000L);
		assertThat(count,equalTo(1000000000000L));
	}
	
	@Test
	public void repeatedStringValidsingleFalse() {
		long count = RepeatedString.repeatedString("x", 1000000000000L);
		assertThat(count,equalTo(0L));
	}
	
	@Test
	public void repeatedStringValidBig() {
		long count = RepeatedString.repeatedString("abcadef", 1000000000000L);
		assertThat(count,equalTo(285714285715L));
	}

}
