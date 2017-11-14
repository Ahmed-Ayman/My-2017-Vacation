import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void checkSum() {
    Calculator calculator = new Calculator();
	int[] numbers = {1,2,3};
    int sum = calculator.summation(numbers);
    assertEquals(6, sum);
  }
}