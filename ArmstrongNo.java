// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean isArmstrongNo(int n)
    {
       int num=n;
       int sum=0;
       int len=lengthOfNum(num);
       while(n>0)
       {
           int d=n%10;
           sum=sum+powerOfNum(d,len);
           n/=10;
           System.out.println(sum);

       }
       if(sum==num)
       {
           return true;
       }
       else{
           return false;
       }
    }
    public static int powerOfNum(int n,int len)
    {
        int prod=1;
        while(len>0)
        {
            prod*=n;
            len--;
        }
        return prod;
    }
    
    public static int lengthOfNum(int n)
    {
        int count=0;
        while(n>0)
        {
            
            count++;
            n/=10;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        if(isArmstrongNo(sc.nextInt()))
        {
        System.out.println("This is armstrong no");
        }
        else{
        System.out.println("This is not armstrong no");
        }
    }
}
