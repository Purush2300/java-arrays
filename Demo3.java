import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [][] a =new int [2][5] ;
        int i,j;
        for (i = 0; i <a.length; i++) {
            for (j = 0; j <a[i].length; j++) {
                System.out.println("enter your ages "+"class "+i+" student "+j);
                a[i][j]=scan.nextInt();
                
            }
        }
             for (i = 0; i <a.length; i++) {
                    for (j = 0; j <a[i].length; j++) {
                        System.out.print(a[i][j]+" ");
                    }
                     System.out.println();
                }
    
    
    }
}
