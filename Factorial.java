Factorial of the number:

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int factorial(int n)
    {
        int prod=1;
       while(n>0)
       {
           prod=prod*n;
           n--;
       }
       return prod;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Factorial is :"+  factorial(sc.nextInt()));
    }
}
