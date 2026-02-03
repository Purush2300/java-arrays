import java.util.Scanner;
public class Pair5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        for (int i=a.length-2; i >0; i--) {
            if(a[i]==a[i+1]){
                System.out.println(a[i]);
                break;
            }
           
        }
    }
    
}
