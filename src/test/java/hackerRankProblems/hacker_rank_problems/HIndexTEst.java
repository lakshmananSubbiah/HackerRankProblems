package hackerRankProblems.hacker_rank_problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class HIndexTEst {

	@Test
	public void testEmptyString() {
		int empty = HIndex.hIndex("");
		assertThat(empty,equalTo(0));
	}
	
	@Test
	public void testNullString() {
		int empty = HIndex.hIndex(null);
		assertThat(empty,equalTo(0));
	}
	
	@Test
	public void properStrings() {
		int empty = HIndex.hIndex("2,3,4,5,6,6");
		assertThat(empty,equalTo(4));
	}

	
	@Test
	public void negativeproperStrings() {
		int empty = HIndex.hIndex("-3,-4,-2,-2,-1");
		assertThat(empty,equalTo(0));
	}
	
}
