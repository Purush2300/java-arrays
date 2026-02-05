import java.util.Scanner;
public class Pair11 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int i =a.length-1;
        int j=a.length-1;
        while (i>=0) {
            if(a[i]==-1){
                i--;
            }
            else{
                a[j]=a[i];
                i--;
                j--;
               
            }
            
        }
        while (j>=0) {
            a[j]=-1;
            j--;
            
            
        }
        for (int j2 = 0; j2 < a.length; j2++) {
            System.out.println(a[j2]);
        }
    }
}
