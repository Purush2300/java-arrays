import java.util.Scanner;
public class Leet4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] num1={111,222,333,0,0,0};
        int m=3;
        int []num2={211,411,511};
        int n=3;
        int[] result =new int[m+n];
        int a=0,b=0 ,index=0;
        while(a<m && b<n){
            if(num1[a]<num2[b]){
                result[index]=num1[a];
                a++;
            }
            else{
                result[index]=num2[b];
                b++;
            }
            index++;
            
        }
        while (a<m) {
                result[index]=num1[a];
                a++;
                index++;
            }
             while (b<n) {
                result[index]=num2[b];
                b++;
                index++;
            }
        for (int i = 0; i < result.length; i++) {
            num1[i]=result[i];
            System.out.println(num1[i]);
                }















    }
    
}
