import java.util.*;

public class Main{
public static int[] Array(int a1[], int a2[]){
    int l1 = a1.length;
    int l2 = a2.length;
    int l3 = Math.max(l1,l2)+1;
    int a3[] = new int[l3];
    int i = l1 -1 , j= l2 - 1, k =l3 -1,carry = 0;
    while(k >= 0){
        int num = carry;
        if(i>=0){
            num += a1[i];
            i--;
        }
        if(j>=0){
            num += a2[j];
            j--;
        }
        a3[k] = num%10;
        k--;
        carry = num/10;
    }
    return a3;
    }
    public static void main(String[] args){
        int[] a1 = {9,9,9};
        int[] a2 = {1};
        int[] result = Array(a1,a2);
        System.out.print(Arrays.toString(result));
    }
}
