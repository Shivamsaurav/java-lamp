package Day1.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,6,8,9);
        Optional<Integer> anyElements = numbers.stream().findAny();
        System.out.println(anyElements);
    }
}

//findAny potentially returns any element from the stream, wrapped in an Optional.