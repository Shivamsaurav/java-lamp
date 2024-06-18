package Day1.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntList {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,1,9,7,3);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }
}
