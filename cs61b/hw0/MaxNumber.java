public class MaxNumber{
    /** Returns the maximum value from m. */
    public static int max(int[] m){
        int k = 0;
        int max = 0;
        while (k < m.length){
            if (m[k] > max){
                max = m[k];
            }
            k = k + 1;
        }
        return max;
     }
     public static void main(String[] args){
         int[] number = new int[]{9, 2, 15, 2, 22, 10, 6};
         System.out.println(max(number));
     }
}
