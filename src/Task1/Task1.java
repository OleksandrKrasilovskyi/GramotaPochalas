package Task1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        Stream.of("Amazon", "Merge", "Kamaz", "Margo", "Amur", "Moroz", "Carrot")
                .filter(e -> e.startsWith("A") || e.endsWith("z"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
