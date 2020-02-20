package CleanCode.CleanCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefineTest {
	private static final double DELTA = 1e-15;
    Define t=new Define();
    
	@Test
	public void testSimple() {
		assertEquals(60.0,t.simple(1000.0,2.0,3.0),DELTA);
	}

	@Test
	public void testCompound() {
		assertEquals(2.0,t.compound(100.0, 2.0, 1.0),DELTA);
	}

}
