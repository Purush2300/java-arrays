import java.util.Scanner;
public class First3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
           int n=scan.nextInt();
      int  []a =new int [n];
      for (int i = 0; i < a.length; i++) {
        a[i]=scan.nextInt();
        
    }
    int count=0;
    int max=a[0];
    int min=a[0];
     for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j < a.length-1; j++) {
                count+=a[j];
                System.out.println(count);

        
            }
        
      }
    
    





}
      
     
}

