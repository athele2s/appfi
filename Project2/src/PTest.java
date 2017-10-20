import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PTest {
	Project2 example;
	
	 @Before
	  public void setUp(){
		 example = new Project2(new String[][]{{"A", "B"}, {"B", "C"}});
	 }

	@Test
	public void test_example_1() {
		assertTrue(example.isWellSorted(new String[]{"A","B","C"}));
	}
	
	@Test
	public void test_example_2(){
		assertFalse(example.isWellSorted(new String[]{"C","B","A"}));
	}

}