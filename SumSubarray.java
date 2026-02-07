public class SumSubarray {
    static int Arraysum(int[] u,int k){
        int wsum=0;
        int msum=Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            wsum=wsum+u[i];
            
        }
        for (int i = k; i < u.length; i++) {
            wsum=wsum-u[i-k]+u[i];
            msum=Math.max(msum, wsum);
        }
        return msum; 
    }




    public static void main(String[] args) {
        int []a={2,9,31,-4,21,7};
        int k=3;
        System.out.println(Arraysum( a, k));
    }
}
