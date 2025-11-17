package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class DUnitTest {
	
	@Test
	public void testDWithEStub() {
		EStub eStub = new EStub();
		D d = new D(eStub);
		String result = d.process("");
		assertEquals("L", result);
	}
}
