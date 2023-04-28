package chapter04;

public class ValueTransfer {
  public static void main(String[] args) {
    // 1. 基本数据类型传递
    int a = 1;
    int b = a;
    System.out.println("a = " + a + ", b = " + b);
    ++a;
    System.out.println("a = " + a + ", b = " + b);

    // 2. 引用数据类型传递
    int[] arr1 = new int[]{1, 2, 3};
    int[] arr2 = arr1;

    arr2[0] = 10;
    System.out.println("arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);
  }
}
