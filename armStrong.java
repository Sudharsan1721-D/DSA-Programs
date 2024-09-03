// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int num=temp;
        int c=0;
        int rem=0;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+(int)Math.pow((double)rem,(double)c);
            num=num/10;
        }
        System.out.println(sum);
    if(sum==n){
        System.out.print("It is Armstrong");
    }
    else{
        System.out.print("It is not a Armstrong");
    }
        
    }
    
}
