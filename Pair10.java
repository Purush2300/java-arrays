import java.util.Scanner;
public class Pair10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array lenght");
        int a=scan.nextInt();
        System.out.println("enter subarray length");
        int n=scan.nextInt();
        int []ar=new int [a];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=scan.nextInt();
            
        }
        for (int i = 0; i < ar.length-n; i++) {
            for (int j = i; j < i+n; j++) {
                System.out.print(ar[j]+" ");
                
            }
            System.out.println();
        }
    }
    
}
