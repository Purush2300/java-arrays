import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int k=5;
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int i=0;
         for ( i = 0; i < a.length; i++) {
            if(a[i]==k){
                System.out.println(i);
                return;
            }
            
               
              
            
           
          
        }
         System.out.println("-1");
        
        
       

    }
    
}
