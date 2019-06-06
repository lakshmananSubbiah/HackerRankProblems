package hackerRankProblems.hacker_rank_problems;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
class CountingValleysTest {
 	@Test
 	public void countValleysValidTestCase() {
 		int valleys = CountingValleys.countingValleys(8, "UDUDUDUD");
 		assertThat(valleys,equalTo(0));
 	}
}
