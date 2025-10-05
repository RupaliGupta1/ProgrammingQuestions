// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static Scanner sc;
  public static void perfectNumber(int num){
      int sum=0;
      for(int i=1;i<=num/2;i++){
          if(num%i==0){
              sum+=i;
          }
      }
      if(sum==num){
          System.out.println("It is perfect number");
      }
      else{
          System.out.println("It is not a perfect number");
      }
  }
    public static void main(String[] args) {
        System.out.println("Enter the number ");
         sc=new Scanner(System.in);
        int num=sc.nextInt();
        perfectNumber(num);
    }
}
