import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []a=new int [5];
        int i;
        for ( i = 0; i <5; i++) {
            System.out.println("enter your age");
            a[i]=scan.nextInt();
        }
        System.out.println("your ages are");
        for ( i= 0; i<5; i++) {
            System.out.println(a[i]);
            
        }
    }
    
}
