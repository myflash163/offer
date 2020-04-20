public class 构建乘积数组 {
    public class Solution {
        public int[] multiply(int[] A) {
            if(A== null || A.length<1) return null;
            int B[] = new int[A.length];
            B[0] = 1;
            for(int i=1;i<A.length;i++){
                B[i] = A[i-1]*B[i-1];
            }
            int temp = 1;
            for(int i=A.length-1;i>=0;i--) {
                B[i]=temp*B[i];
                temp=A[i]*temp;
            }
            return B;

        }
    }

}
