package Task1;

import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        final var strings = List.of("Mike", "Soyer", "Dezmond", "Jack", "Ben", "John", "Kate");
        final var stringHashSet = new HashSet<>(strings);

        System.out.println("Our HashSet is: ");
        stringHashSet.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
