import java.util.Scanner;

public class Pair3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the array length");
        int n=scan.nextInt();
       
        int []a =new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
         for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j]%3==0){
                    System.out.println("["+a[i]+","+a[j]+"]");
                }
                
            }
        }
    }
    
}
