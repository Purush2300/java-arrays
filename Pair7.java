import java.util.Scanner;
public class Pair7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first array length");
        int a=scan.nextInt();
        System.out.println("enter first array value");
        
        int[]ar1=new int [a];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i]=scan.nextInt();
        }

 System.out.println("enter second array length");
  int b=scan.nextInt();
        
        System.out.println("enter first array value");

       
         int[]ar2=new int [b];
          for (int i = 0; i < ar2.length; i++) {
            ar2[i]=scan.nextInt();
        }
        int i=0;
        int j=0;
        while(j<ar2.length && i<ar1.length){
            if(ar1[i]==ar2[j]){
                System.out.println(ar1[i]+"values");
                i++;
                j++;}


            
            else if(ar1[i]>ar2[j]){
                j++;

            }
            else{
                i++;
            }
            
        }
         
    
    }
    
}
