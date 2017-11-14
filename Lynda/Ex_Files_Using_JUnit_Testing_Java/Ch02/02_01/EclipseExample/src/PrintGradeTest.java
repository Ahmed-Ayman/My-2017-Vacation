import static org.junit.Assert.*;

import org.junit.Test;

public class PrintGradeTest {

	@Test
	public void test() {
		PrintGrade pg = new PrintGrade();
		String result = pg.print(95);
		assertEquals("You got a B!", result);
	}

}
