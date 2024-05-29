package Day1;

import java.util.Scanner;

public class SecondLargest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int result = sec_largest_elements(arr,n);
        System.out.println("Second Largest Element : "+result);
        scanner.close();
    }

    static int sec_largest_elements(int arr[],int n){
        int largest = arr[0];
        int sec_largest = Integer.MIN_VALUE;

        for(int i = 1; i<n; i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sec_largest){
                sec_largest = arr[i];
            }
        }

        return sec_largest;
    }
}
