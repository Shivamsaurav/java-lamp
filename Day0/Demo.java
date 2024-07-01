package Day0;

import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // interger input
        int n = scanner.nextInt();
        System.out.println("Your entered : "+n);

        // character input
        char ch = scanner.next().charAt(0);
        System.out.println("Your entered : "+ch);

        // String input
        String str = scanner.nextLine();
        System.out.println("Your entered : "+str);
        // Integer array input.

        scanner.close();
    }
}
