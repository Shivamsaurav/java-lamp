package Day1.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetDistinct {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,6,3,5,6,7,8,1);
        List<Integer> distinctList = numbers.stream().distinct().collect(Collectors.toList()); 
        System.out.println(distinctList);
    }
}
