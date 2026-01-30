import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [][][]a=new int [2][3][5];
        int i,j,k;
        for (i = 0; i <a.length; i++) {
            for (j= 0; j <a[i].length; j++) {
                for (k = 0; k <a[i][j].length; k++) {
                    System.out.println("enter your ages"+"school "+i+" class "+j+" student "+k);
                    a[i][j][k]=scan.nextInt();
                    
                }
                
            }
            
        }
        System.out.println("your ages are");
        for (i = 0; i <a.length; i++) {
            for (j= 0; j <a[i].length; j++) {
                for (k = 0; k <a[i][j].length; k++) {
                    System.out.print(a[i][j][k]+" ");
                    
                    
                }
                System.out.println();
                
            }
            System.out.println();
            
        }
    }
    
}
