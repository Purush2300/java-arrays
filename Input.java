import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.err.println("Here we are doing addition");
      System.out.println("enter first value");
      int a= scan.nextInt();
      System.out.println("enter second value");
      int b=scan.nextInt();
      System.out.println("you will get output of a+b");
      int c=a+b;
      System.out.println(c);
    }
    
}
