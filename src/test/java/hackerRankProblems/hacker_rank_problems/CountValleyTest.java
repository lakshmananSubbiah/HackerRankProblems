package hackerRankProblems.hacker_rank_problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;




class CountValleyTest {

	
	
	@Test
	void countValleysValidTestCase() {
 		int valleys = CountingValleys.countingValleys(8, "UDUDUDUD");
 		assertThat(valleys,equalTo(0));
 	}
	
	@Test
	void countValleysValidTestCaseHighNumberOfValleys() {
		int valleys = CountingValleys.countingValleys(10, "DUDUDUDUDU");
		assertThat(valleys,equalTo(5));
	}
	
	@Test
	void countValleysHigherThanGivenLength() {
		assertThrows(RuntimeException.class, () -> {
			 CountingValleys.countingValleys(5, "DUDUDU");
		});
	}

	@Test
	void countValleysNullString() {
		RuntimeException exception = assertThrows(RuntimeException.class,()->{
			CountingValleys.countingValleys(5, null);
		});
		assertThat(exception.getMessage(),equalTo("The string is null"));
	}

	@Test
	void countValleysEmptyString() {
		int valleys = CountingValleys.countingValleys(0, "");
		assertThat(valleys,equalTo(0));
	}
	
	@Test
	void countValleysDifferentCharacterInString() {
		RuntimeException exception = assertThrows(RuntimeException.class,()->{
			 CountingValleys.countingValleys(6, "DUBLIN");
		});
		assertThat(exception.getMessage(),equalTo("Different Characters Present in String"));
	}
}
