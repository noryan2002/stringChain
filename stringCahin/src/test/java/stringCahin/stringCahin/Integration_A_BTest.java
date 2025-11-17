package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class Integration_A_BTest {

	@Test
	public void testIntegration_AtoB_withCStub() {
		CStub cStub = new CStub();
		B realB = new B(cStub);
		A realA = new A(realB);
		String result = realA.process("");
		assertEquals("HE", result);
	}
}
