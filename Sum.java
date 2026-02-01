import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
            
        }
        System.out.println("your values are");
        int count=0;
         for (int i = 0; i < a.length; i++) {
            count+=i;
            
        }
        System.out.println(count);
        
    }
    
}
