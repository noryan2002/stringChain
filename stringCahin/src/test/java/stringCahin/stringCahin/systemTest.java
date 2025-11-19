package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class systemTest {
	
	@Test
	public void testCompleteChain() {
		ChainMain runner = new ChainMain();
		String result = runner.run();
		assertEquals("HELLO", result);
	}
	
	@Test
	public void testManualChainSetup() {
		E e = new E();
		D d = new D(e);
		C c = new C(d);
		B b = new B(c);
		A a = new A(b);
		String result = a.process("");
		assertEquals("HELLO", result);
	}
	Public void testSystem_negative(){
		E e = new E();
		D d = new D(e);
		C c = new C(d);
		B b = new B(c);
		A a = new A(b);
		String initialInput="123";
		Stering result =a.process(initialInput);
		assertEquals("123HELLO",result);}
	
		
}
