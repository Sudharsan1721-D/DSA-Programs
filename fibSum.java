import java.util.Scanner;
class HelloWorld {
    public static void fib(int n){
        int a=0,b=1;
        for(int i=1;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}
