public class Leet5 {

    public static void main(String[] args) {
        int []a={1,1,0,1,1,1};
        int count=0;
        int index=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==1){
                count++;
                if(count>index)
                    index=count;
            }
            else{
                count=0;
            }
            
            
        }
        System.out.println(index);

    }
}