package chapter04;

public class ArgsTest {
  public static void main(String[] args) {
    ArgsTest test = new ArgsTest();
    test.print(1, 2, 3, 4, 5);
    test.print(1, 2);
  }
  

  // 可变参数 <T> ...args
  public void print(int ...nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }

  // public void print(int i, int ...nums) {
  //   System.out.println(i);
  //   for (int j = 0; j < nums.length; j++) {
  //     System.out.println(nums[j]);
  //   }
  // }

  /**
   * String sql = "update t_user set name = ? where id = ?";
   *
   * public void update(String sql, Object ...params) {}
   *
   */
}