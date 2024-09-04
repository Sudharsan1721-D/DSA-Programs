import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int t=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("NO");
    }
}
