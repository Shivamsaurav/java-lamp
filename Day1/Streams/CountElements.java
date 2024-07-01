package Day1.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElements {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,7,8,4,6,3);
        List<Integer> result = numbers.stream().filter(nums-> nums>5).collect(Collectors.toList());
        long count = result.stream().count();
        System.out.println(result);
        System.out.println(count);
    }
}
