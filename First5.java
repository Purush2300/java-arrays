import java.util.Scanner;
public class First5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=scan.nextInt();
        System.out.println("enter the target value");
        int target=scan.nextInt();
        int [] a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int count=0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target){
                count++;
            }
        }
        System.out.println("output is");
        System.out.println(count);
    }
    
}
