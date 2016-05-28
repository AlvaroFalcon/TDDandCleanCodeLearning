package VasyaClerkKata;

import java.util.Arrays;

public class VasyaClerk {
    public static String Tickets(int[] peopleMoney) {
        for (int i = 0; i < peopleMoney.length; i++) {
            if (!gotChange(peopleMoney, i)) return "NO";
        }
        return "YES";
    }

    private static boolean gotChange(int[] peopleMoney, int i) {
        int[] vasyaChange = Arrays.copyOfRange(peopleMoney, 0, i);
        if (gotChangeForFifty(vasyaChange)) return true;
        if (gotChangeForOneHundred(vasyaChange)) return true;
        return false;
    }

    private static boolean gotChangeForFifty(int[] vasyaChange) {
        return false;
    }

    private static boolean gotChangeForOneHundred(int[] vasyaChange) {
        return false;
    }

}
