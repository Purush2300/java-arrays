import java.util.Scanner;
public class Zero1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]-a[i]==1){
                System.out.print(a[i]+" ");
            }
            else{
                System.err.print(a[i]);
                System.out.println();

            }
            
        }
        System.out.println(a[a.length-1]);
    }
    
}
