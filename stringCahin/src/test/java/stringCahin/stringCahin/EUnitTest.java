package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class EUnitTest {
	
	@Test
	public void testE() {
		E e = new E();
		String result = e.process("");
		assertEquals("O", result);
	}
	
	@Test
	public void testEWithPrefix() {
		E e = new E();
		String result = e.process("HELL");
		assertEquals("HELLO", result);
	}
}
