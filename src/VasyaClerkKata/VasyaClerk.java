package VasyaClerkKata;

import java.util.Arrays;

public class VasyaClerk {
    public static String Tickets(int[] peopleMoney) {
        for (int person = 0; person < peopleMoney.length; person++) {
            if (!gotChange(peopleMoney)) return "NO";
        }
        return "YES";
    }

    private static boolean gotChange(int[] peopleMoney) {
        int numberOfTwentyFive = countTicket(peopleMoney, 25);
        int numberOfFifty = countTicket(peopleMoney, 50);
        int numberOfOneHundred = countTicket(peopleMoney, 100);
        return checkChange(numberOfTwentyFive, numberOfFifty, numberOfOneHundred);
    }

    private static boolean checkChange(int numberOfTwentyFive, int numberOfFifty, int numberOfOneHundred) {
        if (checkFiftyChange(numberOfTwentyFive, numberOfFifty) && checkOneHundredChange(numberOfTwentyFive, numberOfFifty, numberOfOneHundred))
            return true;
        return false;
    }

    private static boolean checkOneHundredChange(int numberOfTwentyFive, int numberOfFifty, int numberOfOneHundred) {
        if (numberOfOneHundred == 0) return true;
        if (numberOfTwentyFive >= 3 * numberOfOneHundred) return true;
        if ((numberOfTwentyFive >= numberOfOneHundred) && (numberOfFifty >= numberOfOneHundred)) return true;

        return false;
    }

    private static boolean checkFiftyChange(int numberOfTwentyFive, int numberOfFifty) {
        if (numberOfFifty == 0) return true;
        if (numberOfTwentyFive >= numberOfFifty) return true;
        return false;
    }

    private static int countTicket(int[] peopleMoney, int ticket) {
        int ticketCount = 0;
        for (int j = 0; j < peopleMoney.length; j++) {
            if (peopleMoney[j] == ticket) ticketCount++;
        }
        return ticketCount;
    }


}
