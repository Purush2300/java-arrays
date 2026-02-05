import java.util.Scanner;
public class Zero1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int sum=1 ,max=0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]-a[i]==1){
                sum++;
               
                
            }
            
            else{
                if(sum>max){
                    max=sum;
                }
                
                sum=1;

            }
            
        }
        if(sum>max){
                    max=sum;
                }
                
    System.out.println(max);
       
    }
    
}
