package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class CUnitTest {
	
	@Test
	public void testCWithDStub() {
		DStub dStub = new DStub();
		C c = new C(dStub);
		String result = c.process("");
		assertEquals("L", result);
	}
}