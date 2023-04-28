package chapter04;

public class StringConCatTest {
  public static void main(String[] args) {
    var test = new StringConCatTest();
    System.out.println(test.concat(",", "a", "b", "c"));
    System.out.println(test.concat(" "));
  }

  private String concat(String operator, String ... strs) {
    var sb = new StringBuilder();
    for (int i = 0; i < strs.length; i++) {
      sb.append(strs[i]);
      if (i != strs.length - 1) {
        sb.append(operator);
      }
    }
    return sb.toString();
  }
}
