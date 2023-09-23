package Array;
import java.util.*;
public class subArray {
    public static void Subarrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(arr[i]+" ");
                }
            }
        }
        
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int result= Arrays.subArray(Subarrays(arr));
                
    }
}
