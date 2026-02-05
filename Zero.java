import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
            
        }
        int i=0;
        int j=0;
        while (i<a.length) {
            if(a[i]==0){
                i++;
            }
            else{
                a[j]=a[i];
                i++;
                j++;
            }
            
        }
        while (j<a.length) {
            a[j]=0;
            j++;

        }
        for (int j2 = 0; j2 < a.length; j2++) {
            System.out.println(a[j2]);
        }

    }
    
}
