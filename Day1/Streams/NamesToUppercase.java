package Day1.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesToUppercase {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Sudip","Rina","Shivam","Saumya");
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
