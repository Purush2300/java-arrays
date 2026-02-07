// import java.util.Scanner;
public class SumSubarraymin {


   static int  Minsubarray(int []p,int k){
    int sum=0;
    int wsum=0;
    int maxscore=0;
   
    int nsum=0;
    for (int i = 0; i < p.length; i++) {
        sum+=p[i];
        
    }
    int num=p.length-k;
    if(p.length==k){
        return sum;
    }
    
    System.out.println(num+"length os new subarray");
    
    System.out.println(sum+"total sum");
    for (int i = 0; i <num; i++) {
        wsum+=p[i];
    }
     int minscore=wsum;
    System.out.println(wsum+"first sum");
    
    for (int i = num; i <p.length; i++) {
        wsum=wsum-p[i-num]+p[i];
        System.out.println(wsum+" "+num);
        
        if(wsum<minscore){
            minscore=wsum;
        }
        
    }
    System.out.println(minscore+" minscore");
   
   return maxscore=sum-minscore;
}
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // int n=scan.nextInt();
        int[]a={9,7,7,9,7,7,9 };
        int k=7;
       int result= Minsubarray(a,k);
       System.out.println(result+"final value");
       
    }
}
