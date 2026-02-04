import java.util.Scanner;
public class Pair8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("first array length");
        int a=scan.nextInt();
        System.out.println("first array values");
        int []ar1=new int[a];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i]=scan.nextInt();
            
        }
          System.out.println("second array length");
        int b=scan.nextInt();
        
        int []ar2=new int[b];
        System.out.println("second array values");
        for (int i = 0; i < ar2.length; i++) {
            ar2[i]=scan.nextInt();
            
        }
        int c=ar1.length+ar2.length;
        int [] result=new int[c];

        int i=0;
        int j=0;
        int k=0;
        while (j<ar2.length && i<ar1.length) {
            if(ar2[j]<ar1[i]){
                result[k]=ar2[j];
                j++;
                k++;

            }
            else{
                result[k]=ar1[i];
                i++;
                k++;
            }
        }
        while (j<ar2.length) {
            result[k]=ar2[j];
            k++;
            j++;
        }
        while (i<ar1.length) {
            result[k]=ar1[i];
            k++;
            i++;
        }
        for (int k2 = 0; k2 < result.length; k2++) {
            System.out.println(result[k2]);
            
        }
    }
    
}
