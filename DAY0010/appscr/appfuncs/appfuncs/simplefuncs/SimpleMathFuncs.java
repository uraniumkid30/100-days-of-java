package DAY0010.appscr.appfuncs.appfuncs.simplefuncs;

public class SimpleMathFuncs {
    public static boolean isFactor(int a, int b){
        return a % b == 0;
    }
    public static int lcf(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = 2; i <= min/2; i++){
            if (isFactor(i, a) && isFactor(i, b)){
                return i;
            }
        }
        return 1;
    }
}
