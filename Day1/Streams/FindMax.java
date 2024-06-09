package Day1.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(78,34,91,55,79,81,97);
        Optional<Integer> max =  numbers.stream().max(Integer::compare);

        System.out.println(max);

    }
}
