import java.util.function.*;
import java.util.ArrayList;
public class LEWithBuiltInFI {
    public static void main(String[] args) {

        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        Predicate<Integer> lessThan5 = x -> x > 5;
        System.out.println(lessThan5.test(5));

        Function<Integer,Integer> add = a -> a + 5;
        System.out.println(add.apply(3));

        Supplier<Double> Random = () -> Math.random();
        System.out.println(Random.get());


    }
}
