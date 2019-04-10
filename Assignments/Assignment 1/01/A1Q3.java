/**
 * It checks the longest run of a number in an array.
 */
public class A1Q3
{
  public static <T extends Comparable<T>> int getLongestRun(T[] array) {
    if (array.length == 0) {
      return 0;
    }
    
    int longest = 1;
    
    for (int current = 1, i = 1; i < array.length; ++i) {
      current = array[i].compareTo(array[i-1]) == 0 ? current + 1 : 1;
      
      if (current > longest) {
        longest = current;
      }
    }
    
    return longest;
  }
  
  public static int getLongestRun(double[] array) {
    Double[] arr = Arrays.stream(array).boxed().toArray(Double[]::new);
    return getLongestRun(arr);
  }
  
  public static int getLongestRun(int[] array) {
    Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
    return getLongestRun(arr);
  }
}
