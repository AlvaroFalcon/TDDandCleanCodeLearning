package PerfectSquareKata;

import static java.lang.Math.*;

public class PerfectSquare {
    public static boolean isPerfectSquare(int n){
        return (sqrt(n) * sqrt(n)) == n;
    }
}
