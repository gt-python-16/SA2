package core;

import org.testng.annotations.Test;

public class AppTest {
	@Test(enabled = true)
	public void test() {
		org.testng.Assert.assertEquals("abc", "abc","Error message");
	}
}
