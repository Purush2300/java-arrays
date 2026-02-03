import java.util.Scanner;
public class Pair6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int res=0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]-a[i]!=1){
                res=a[i]+1;
                
            }
            
        }
        System.out.println(res);

    }

    
}