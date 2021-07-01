public class MaxNumber_v2{
    /** Returns the maximum value from m. */
    public static int max(int[] m){
        int max = 0;
        for (int k = 0; k < m.length; k = k + 1){
            if (m[k] > max){
                max = m[k];
            }
        }
        return max;
     }
     public static void main(String[] args){
         int[] number = new int[]{9, 2, 15, 2, 22, 10, 6};
         System.out.println(max(number));
     }
}
