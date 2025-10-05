// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static double calElectricityBill(int n)
    {
        int units;
        if(n>0 && n<=100){
            return 1.50*n;
        }
        else if(n>=101 && n<=200)
        {
            return 2*n;
        }
        else if(n>=201 && n<=300)
        {
            return 3*n;
        }
        else{
            return 5*n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the unit consumed by the customer");
        Scanner sc=new Scanner(System.in);
        System.out.println("Electricity bill will be :"+  calElectricityBill(sc.nextInt()));
    }
}
