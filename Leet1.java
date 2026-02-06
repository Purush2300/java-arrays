import java.util.Scanner;
public class Leet1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int target =9;
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
            
        }
        int l=0,r=a.length-1;

       while (r>l) {
         if(a[l]+a[r]==target){
            System.out.println("["+l+" "+r+"]");
        }

        if(a[l]+a[r]>target){
            r--;

        }
        else{
            l++;
        }
        
       }

       
    }
    
}
