import java.util.Scanner;
public class New2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        // int [][][]a=new int [2][][];
        // a[0]=new int[3][];
        // a[1]=new int[4][];
        // a[0][0]=new int[2];
        // a[0][1]=new int[3];
        // a[0][2]=new int[4];
        // a[1][0]=new int[2];
        // a[1][1]=new int[3];
        // a[1][2]=new int[2];
        // a[1][3]=new int[4];
        
        // for (int k2 = 0; k2 < a.length; k2++) {
        //     for (int i = 0; i < a[k2].length; i++) {
        //         for (int j = 0; j < a[k2][i].length; j++) {
        //             System.out.println("unit " + k2+" college "+ i+" tech "+j);
        //             a[k2][i][j]=scan.nextInt();
                    
        //         }
                
        //     }
            
        // }
        // System.out.println("details are");
        //  for (int k2 = 0; k2 < a.length; k2++) {
        //     for (int i = 0; i < a[k2].length; i++) {
        //         for (int j = 0; j < a[k2][i].length; j++) {
        //             System.out.print(a[k2][i][j] + " ");
                  
                    
        //         }
        //         System.out.println();
                
        //     }
        //     System.out.println();
            
        // }
        int a=scan.nextInt();
        int b=scan.nextInt();
     multiply(a,b);
    }
    static void multiply(int x,int y){
        int result=1;
        for(int i=1;i<=y;i++){
            result*=x;
        }
        System.out.println(result);

    }
}
