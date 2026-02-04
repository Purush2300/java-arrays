import java.util.Scanner;
public class Pair9 {
   public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
    System.out.println("Enter array length first");
    int a=scan.nextInt();
    int []ar1 =new int[a];
    System.out.println("enter the array values");
    for (int i = 0; i < ar1.length; i++) {
        ar1[i]=scan.nextInt();
        }
         System.out.println("Enter array length second");
    int b=scan.nextInt();
    int []ar2 =new int[b];
    System.out.println("enter the array values");
    for (int i = 0; i < ar2.length; i++) {
        ar2[i]=scan.nextInt();
        }
 System.out.println("Enter array length third");
    int c=scan.nextInt();
    int []ar3 =new int[c];
    System.out.println("enter the array values");
    for (int i = 0; i < ar3.length; i++) {
        ar3[i]=scan.nextInt();
        }
        int d=ar1.length+ar2.length+ar3.length;
        int[] res=new int[d];
        int i=0;
        int k=0;
       
        while (k<res.length ) {
            if(i<ar1.length){
                res[k]=ar1[i];
                k++;
            }
             if (i<ar2.length) {
                 res[k]=ar2[i];
                k++;
                
            }
            if (i<ar3.length) {
                 res[k]=ar3[i];
                k++;
                
            }
            i++;

            
        }
for (int j = 0; j < res.length; j++) {
    System.out.print(res[j]+" ");
    
}



   }
    
}
