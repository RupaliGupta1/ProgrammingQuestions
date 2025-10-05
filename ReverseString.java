// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static Scanner sc;
  public static String reverseString(String str){
      char[] strArr=str.toCharArray();
      String rev="";
      for(char c:strArr)
      {
          rev=c+rev;
      }
      return rev;
  }
    public static void main(String[] args) {
        System.out.println("Enter the String ");
         sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(reverseString(str));
    }
}
