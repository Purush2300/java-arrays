import java.util.Scanner;
public class First2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
      int  []a =new int [n];
      for (int i = 0; i < a.length; i++) {
        a[i]=scan.nextInt();
        
      }
      int max =a[0];
      int index=0;
       for (int i = 0; i < a.length; i++) {
       
        if(a[i]<max){
            max=a[i];
            index=i;
        }
       
    }

    System.out.println(index);
    
    }
    
}
