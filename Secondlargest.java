import java.util.*;
 public class Main{
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int n = 5;
        int fl = arr[0];
        for(int i=0;i<n;i++){
            fl = Math.max(arr[i], fl);
        }
        int sl = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] != fl){
                sl=Math.max(arr[i],sl);
            }
        }
        System.out.println("First ->" + fl);
        System.out.println("Second ->" + sl);
    }
}
