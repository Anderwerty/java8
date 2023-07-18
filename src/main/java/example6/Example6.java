package example6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example6 {
    public static void main(String[] args) {
        // int -->Integer
        List<Integer> integers = Arrays.asList(1, 2, 3, 10, -1);

        Stream<Integer> integerStream = integers.stream()
                .map(x -> x * 100);


        List<Integer> collect = integerStream
                .collect(Collectors.toList());

        Set<Integer> collect1 = integerStream.collect(Collectors.toSet());

        System.out.println(collect);
        System.out.println(collect1);
    }
}
