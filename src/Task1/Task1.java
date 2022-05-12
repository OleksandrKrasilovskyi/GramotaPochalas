package Task1;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
   public static void main(String[] args) {
               
       final var strings = List.of("Amazon", "Merge", "Kamaz", "Margo", "Amur", "Moroz", "Carrot");

        strings.stream()
                .filter(e -> e.startsWith("A") || e.endsWith("z"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
