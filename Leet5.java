public class Leet5 {

    public static void main(String[] args) {
        int []a={-1,-2,3,4,5,6};
      int l=0;
      int r=1;
      while (r<a.length) {
        if(a[l]<0){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
           


        } 
        r++;
        
      }
      for (int num : a) {
    System.out.print(num + " "); 
}



    }
}