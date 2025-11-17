package stringCahin.stringCahin;

import static org.junit.Assert.*;
import org.junit.Test;

public class Integration_C_DTest {

	@Test
	public void testIntegration_CtoD_withEStub() {
		EStub eStub = new EStub();
		D realD = new D(eStub);
		C realC = new C(realD);
		String result = realC.process("");
		assertEquals("LL", result);
	}
}

