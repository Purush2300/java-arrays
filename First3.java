import java.util.Scanner;
public class First3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
           int n=scan.nextInt();
      int  []a =new int [n];
      for (int i = 0; i < a.length; i++) {
        a[i]=scan.nextInt();
        
    }
   int count=0;
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
     for (int i = 0; i < a.length; i++) {
        count+=a[i];
           
    }
    for (int i = 0; i < a.length; i++) {
        if(a[i]>max){
            max=a[i];
        }
        
    }
     for (int i = 0; i < a.length; i++) {
        if(a[i]<min){
            min=a[i];
        }
        
    }
    System.out.println(count);
    System.out.println(max);
    System.out.println(min);
    System.out.println(count-min+" this is max value");
    System.out.println(count-max+" this is min value");
    
    





}
      
     
}

