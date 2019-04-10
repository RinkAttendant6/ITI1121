/**
 * It counts the positive number in the array
 */ 
public class A1Q1
{
  public static int countPositive(double[] array) {
    return (int) Arrays.stream(array).filter(n -> n > 0).count();
  }
}
