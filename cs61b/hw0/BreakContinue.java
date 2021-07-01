public class BreakContinue{
    public static void windowPosSum(int[] a, int n){
        for (int i = 0; i < a.length; i += 1){
            if (a[i] < 0){
                continue;
            }
            for (int j = 1; j <= n; j += 1){
                if (i + j >= a.length){
                    break;
                }
                a[i] = a[i] + a[i + j];
            }
        }
    }

    public static void main(String[] args){
        int[] a = {1, -1, -1, 10, 5, -1};
        int n = 2;
        windowPosSum(a, n);

        System.out.println(java.util.Arrays.toString(a));
    }
}
