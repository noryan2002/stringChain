package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class AUnitTest {
	
	@Test
	public void testAWithBStub() {
		BStub bStub = new BStub();
		A a = new A(bStub);
		String result = a.process("");
		assertEquals("H", result);
	}
}