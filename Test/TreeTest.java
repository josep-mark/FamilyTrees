import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {
	private Tree testTree;
	
	@Before
	public void setUp() {
	testTree = new Tree();
	}

	@Test
	public void testNotNull() {
		assertNotNull("testTree shouldn't be null", testTree);
	}

}
