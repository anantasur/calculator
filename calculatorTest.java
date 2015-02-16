import org.junit.Test;
import static org.junit.Assert.*;
public class calculatorTest{

  @Test
  public void sum_gives_sum_of_two_numbers(){
    Calculator c = new Calculator();
    assertEquals(10,c.sum(4,6));
  }

  @Test
  public void difference_gives_difference_of_two_numbers(){
    Calculator c = new Calculator();
    assertEquals(2,c.difference(4,6));
  }

  @Test
  public void multiplication_gives_product_of_two_numbers(){
    Calculator c = new Calculator();
    assertEquals(8,c.multiplication(4,2));
  }

  @Test
  public void division_gives_quoteient_of_two_numbers(){
    Calculator c = new Calculator();
    assertEquals(1,c.division(2,2));
  }

  @Test
  public void operation_does_the_calculation_based_on_the_operand_passed(){
    Calculator c = new Calculator();
    assertEquals(10,c.operation(4,6,'+'));
  }
}
