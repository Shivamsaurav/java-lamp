package Day1.Streams;

import java.util.Arrays;
import java.util.List;

public class ReduceToSum {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,4,3,7,9,5);
        int total = numbers.stream().reduce(0,Integer::sum);
        System.out.println(total);
    }
}
