import java.util.stream.Stream;
import java.util.ArrayList;

public class StreamDemo {

  private static void f1() {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    // stream.forEach(System.out::println);
    stream.forEach(p -> System.out.println(p));
  }

  private static void f2() {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");

    var stream = list.stream();
    stream.forEach(System.out::println);
  }
  public static void main(String[] args) {
    // f1();
    f2();
  }
}
