package Strings;

import java.io.PrintStream;

public class StringMemoryDemo {
   public StringMemoryDemo() {
   
   }

   public static void main(String[] args) {
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String("Hello");
      String s4 = new String("Hello");
      System.out.println("s1 == s2 : " + (s1 == s2));
      System.out.println("s3 == s4 : " + (s3 == s4));
      System.out.println("s1 == s3 : " + (s1 == s3));
      PrintStream var10000 = System.out;
      boolean var10001 = s1.equals(s3);
      var10000.println("s1.equals(s3) : " + var10001);
      var10000 = System.out;
      var10001 = s1.equals(s2);
      var10000.println("s1.equals(s3) : " + var10001);
      String s5 = s3.intern();
      System.out.println("s1 == s5 : " + (s1 == s5));
   }
}
