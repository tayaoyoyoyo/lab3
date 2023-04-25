import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversedInPlace2(){
    int[] input1 = { 1,2,3 };
    assertArrayEquals( new int[]{ 3,2,1 }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReveresedNonEmpty(){
    int[] input1 = { 1,2,3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals( new int[]{ 3,2,1 }, input1);
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = { 1.0,2.0 ,3.0 };
    double[] input2 = { };
    double[] input3 = { 7.0 };
    double[] input4 = { 1, 1, 2 };
    double[] input5 = { 3.0, 3.0 };
    double[] input6 = { 3.0, 4.0 };
 
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1),0.1);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0.1);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input3), 0.1);
    // honestly idk
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input4), 0.1);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input5), 0.1 );
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input6), 0.1 );
  }
}
