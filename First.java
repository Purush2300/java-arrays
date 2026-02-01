 import java.util.Scanner;
public class First {
   

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        int [] a = new int [n];
        System.out.println("you are entering values ");
        for (int i = 0; i <a.length; i++) {
            a[i]=scan.nextInt();
            
        }

        System.out.println("your values is");
        int count=1;
         for (int i = 0; i <a.length; i++) {
            count*=a[i];
            
        }
        System.out.println(count);
        
    }
    
}

