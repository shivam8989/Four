package training;
import java.util.*;
public class FOUR {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int arr [] = new int [size];
        for(int i = 1; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array");
        for(int i = 1; i<arr.length; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("The result array");
        for(int i = arr.length; i>0; i++){
            System.out.println(arr[i]);
        }

    }
}
