class HelloWorld {
    public static void main(String[] args) {
        int n=515;
        int temp=n;
        int rem=0;
        int rev=0;
        while(temp>0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==n){
            System.out.print("ArmStrong");
        }
        else{
            System.out.print("Not a ArmStrong");
        }
    }
}
