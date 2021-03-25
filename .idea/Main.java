
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Main {


    public static void main(String[] args) {


        doTask1();
        System.out.println("");

        doTask2();
        System.out.println("");

        doTask3(5);
        System.out.println("");

        doTask4();

    }

    static void doTask1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
    }

    static void doTask2() {
        Set<String> values = new HashSet<>(Arrays.asList("One", "Two", "Three"));

        forItem(values, System.out::println);

    }

    static void forItem(Set<String> values, Consumer<String> consumer) {
        for (String item : values) {
            consumer.accept(item);
        }

    }

    static void doTask3(int i) {

        doubleUp(i, () -> 2);

    }

    static void doubleUp(int i, Supplier<Integer> integer) {
        System.out.println(integer.get() * i);

    }

    static void doTask4() {

        System.out.println(findAllChars("fffffreestyler", 'f'));

    }

    static Optional<String> findAllChars(String target, char toFind) {
        StringBuilder result = new StringBuilder();
        char[] chars = target.toCharArray();
        for (char aChar : chars) {
            if (aChar == toFind) {
                result.append(aChar);
            }
        }
        if (result.length() > 0) {
            return Optional.of(result.toString());
        } else return Optional.empty();

    }
}






