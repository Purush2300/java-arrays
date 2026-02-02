import java.util.Scanner;
public class Pair1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int maxpair=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]*a[j]<maxpair){
                    maxpair=a[i]*a[j];
                }
                
            }
        }
        System.out.println(maxpair);
    }
    
}
