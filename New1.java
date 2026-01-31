import java.util.Scanner;
public class New1 {
    public static void main(String[] args) {
      Scanner scan=  new Scanner(System.in);
      int [][] a=new int [2][];
      a[0]=new int [2];
      a[1]=new int [3];
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.println("class "+i+" students "+j);
            a[i][j]=scan.nextInt();
            
        }
        
      }
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j]+" ");
            
            
        }
        System.out.println();
        
      }
      


    }
    
}
