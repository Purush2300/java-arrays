import java.util.Scanner;
public class Zero1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }
        int sum=1 ,max=0 ,s=0,e=0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]-a[i]==1){
                sum++;
               
                
            }
            
            else{
                if(sum>max){
                    max=sum;
                    e=i;
                }
                
                sum=1;

            }
            
        }
        if(sum>max){
                    max=sum;
                    e=a.length-1;
                }
                
    s=e-max+1;
    for (int i = s; i <=e; i++) {
        System.out.println(a[i]+" ");
        
    }
       
    }
    
}
