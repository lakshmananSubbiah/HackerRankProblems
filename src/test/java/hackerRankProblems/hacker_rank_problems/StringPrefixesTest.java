package hackerRankProblems.hacker_rank_problems;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class StringPrefixesTest {

	@Test
	public void calculatePrefixTest() {
		String prefixFinding = StringPrefixes.calculatePrefix("geke", "gemp");
		assertThat(prefixFinding,equalTo(prefixFinding));
	}
	
	@Test
	public void calculatePrefixTestNull() {
		String prefixFinding = StringPrefixes.calculatePrefix(null, null);
		assertThat(prefixFinding,equalTo(""));
	}
	
	@Test
	public void calculatePrefixTestEmpty() {
		String prefixFinding = StringPrefixes.calculatePrefix("", "");
		assertThat(prefixFinding,equalTo(""));
	}

	@Test
	public void calculatePrefixTestIgnoring() {
		String prefixFinding = StringPrefixes.calculatePrefix("Max", "High");
		assertThat(prefixFinding,equalTo(""));
	}
	
	@Test
	public void findPrefixNull() {
		String prefix = StringPrefixes.findPrefix(null);
		assertThat(prefix,equalTo(""));
	}
	
	@Test
	public void findPrefixEmpty() {
		String[] str = new String[1];
		str[0] = "";
		String prefix = StringPrefixes.findPrefix(str);
		assertThat(prefix,equalTo(""));
	}
	
	@Test
	public void findPrefixSingle() {
		String[] str = new String[1];
		str[0] = "abc";
		String prefix = StringPrefixes.findPrefix(str);
		assertThat(prefix,equalTo("abc"));
	}
	
	@Test
	public void findPrefixMultiple() {
		String[] str = new String[3];
		str[0] = "abc";
		str[1] = "abdc";
		str[2] = "abaisojeowejowje";
		String prefix = StringPrefixes.findPrefix(str);
		assertThat(prefix,equalTo("ab"));
	}
	
	@Test
	public void findPrefixMultipleFailure() {
		String[] str = new String[3];
		str[0] = "abc";
		str[1] = "mac";
		str[2] = "imx";
		String prefix = StringPrefixes.findPrefix(str);
		assertThat(prefix,equalTo(""));
	}
}
