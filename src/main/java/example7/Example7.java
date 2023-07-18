package example7;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example7 {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("One" ,"tt  werd");

        Stream<String[]> streamOfArrays = lines.stream().map(line -> line.split(" "));

        Stream<List<String>> streamOfList = streamOfArrays.map(Arrays::asList);

        // stream of list in one list

        Stream<Stream<String>> streamOfStreamS = streamOfList.map(Collection::stream);

        // streamOfStreams --> stream of string

       // streamOfStreamS.flatMap()  ???

        Stream<String> streamOfString = null;

        // filter small words here

        streamOfStreamS.collect(Collectors.toMap(x->x, x->1, (oldValue, newValue)-> oldValue+ newValue));

        // Map<String, Integer>

        Map<String, Integer> map = null;

        map.entrySet().stream().filter(x->x.getValue()>4);
    }
}
