// Arrays class and methods demo
import java.util.Arrays;

public class ArrayUtil {
  public static void main(String[] args) {
    // 1. equals  
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    // a == b is false
    System.out.println(a == b);
    // compare the content of a and b
    System.out.println(Arrays.equals(a, b));

    // 2. fill + toString 
    int[] c = new int[5];
    Arrays.fill(c, 5);
    System.out.println(Arrays.toString(c));

    // 3. sort
    int[] d = {3, 1, 2};
    Arrays.sort(d);
    System.out.println(Arrays.toString(d));

    // 4. binarySearch
    int[] e = {1, 2, 3, 4, 5};
    System.out.println(Arrays.binarySearch(e, 3));

    // 5. binary search lower bound 
    int[] f = {1, 2, 2, 2, 2, 3};
    System.out.println(Arrays.binarySearch(f, 2));

    // 6. copyOf
    int[] g = {1, 2, 3};
    int[] h = Arrays.copyOf(g, 5);
    System.out.println(Arrays.toString(h));
  }
}