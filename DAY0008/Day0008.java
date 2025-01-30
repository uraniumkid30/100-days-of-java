package DAY0008;
class NonIntResultException extends Exception {
    int n;
    int d;
    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer";
    }
}

public class Day0008 {
    public static void main(String[] args) {
        
    }
}
