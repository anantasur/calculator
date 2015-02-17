import org.junit.Test;
import static org.junit.Assert.*;
public class calculatorTest{

  @Test
  public void sum_of_4_and_6_gives_10(){
    Calculator c = new Calculator();
    assertEquals(10,c.sum(4,6));
  }

  @Test
  public void difference_of_6_and_4_gives_2(){
    Calculator c = new Calculator();
    assertEquals(2,c.difference(4,6));
  }

  @Test
  public void multiplication_of_4_and_2_gives_8(){
    Calculator c = new Calculator();
    assertEquals(8,c.multiplication(4,2));
  }

  @Test
  public void division_of_2_and_2_gives_1(){
    Calculator c = new Calculator();
    assertEquals(1,c.division(2,2));
  }

  @Test
  public void operation_does_the_sum_when_4_6_plus_is_passed_and_gives_10(){
    Calculator c = new Calculator();
    assertEquals(10,c.operation(4,6,'+'));
  }

  @Test
  public void operation_does_the_difference_when_4_6_minus_is_passed_and_gives_2(){
    Calculator c = new Calculator();
    assertEquals(2,c.operation(4,6,'-'));
  }
}
