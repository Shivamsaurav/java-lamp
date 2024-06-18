package Day1.Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(12,3,45,66,47);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
