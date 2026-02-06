import java.util.Scanner;
public class Leet2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        int index=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           if(a[i]!=0){
             int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
            index++;
           }
             
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
       
    }
    
}
