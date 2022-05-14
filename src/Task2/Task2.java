package Task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        final var strings = new HashSet<>(Arrays.asList("one", null, "three", null, "five"));

        System.out.println("Filter HashSet: ");

        final var result = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(String::length, Function.identity()));

            System.out.println(result);
    }
}

