package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class Integration_B_CTest {

	@Test
	public void testIntegration_BtoC_withDStub() {
		DStub dStub = new DStub();
		C realC = new C(dStub);
		B realB = new B(realC);
		String result = realB.process("H");
		assertEquals("HEL", result);
	}
}

