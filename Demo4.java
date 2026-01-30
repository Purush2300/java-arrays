import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [][][]a=new int [2][3][5];
        int i,j,k;
        for (i = 0; i <2; i++) {
            for (j= 0; j <3; j++) {
                for (k = 0; k <5; k++) {
                    System.out.println("enter your ages"+"school "+i+" class "+j+" student "+k);
                    a[i][j][k]=scan.nextInt();
                    
                }
                
            }
            
        }
        System.out.println("your ages are");
        for (i = 0; i <2; i++) {
            for (j= 0; j <3; j++) {
                for (k = 0; k <5; k++) {
                    System.out.print(a[i][j][k]);
                    
                    
                }
                System.out.println();
                
            }
            
        }
    }
    
}
