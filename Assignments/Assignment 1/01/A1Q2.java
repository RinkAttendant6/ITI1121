import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * It checks for adjacent duplicate values in the array
 */
public class A1Q2
{
  public static <T extends Comparable<T>> boolean hasLengthTwoRun(T[] array) {
    return IntStream.range(0, array.length - 1).anyMatch(i -> array[i].compareTo(array[i + 1]) == 0);
  }
  
  public static boolean hasLengthTwoRun(double[] array) {
    Double[] arr = Arrays.stream(array).boxed().toArray(Double[]::new);
    return hasLengthTwoRun(arr);
  }
}
