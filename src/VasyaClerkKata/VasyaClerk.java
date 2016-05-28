package VasyaClerkKata;


public class VasyaClerk {
    private int twentyFiveTickets = 0;

    private int fiftyTickets = 0;

    public String Tickets(int[] peopleMoney) {
        for (int person = 0; person < peopleMoney.length; person++) {
            if (!gotChange(peopleMoney[person])) return "NO";
        }
        return "YES";
    }

    private boolean gotChange(int peopleMoney) {
        updateTickets(peopleMoney);
        return isPossiblyToChange(peopleMoney);
    }

    private void updateTickets(int peopleMoney) {
        if (peopleMoney == 25) addTwentyFiveTicket();
        if (peopleMoney == 50) addFiftyTicket();

    }

    private void addTwentyFiveTicket() {
        this.setTwentyFiveTickets(this.getTwentyFiveTickets() + 1);
    }
    private void addFiftyTicket() {
        this.setFiftyTickets(this.getFiftyTickets() + 1);
    }

    private boolean isPossiblyToChange(int peopleMoney) {

        if (peopleMoney == 50) return gotChangeForFifty();
        if (peopleMoney == 100) return gotChangeForOneHundred();
        return true;
    }

    private boolean gotChangeForOneHundred() {
        if (gotEnoughTwentyFiveTickets(2)) return makeChangeWithTwentyFive(3);

        if (gotEnoughTwentyFiveTickets(0) && gotEnoughFiftyTickets(0)) return makeChangeWithTwentyFiveAndFifty();

        return false;
    }

    private boolean gotEnoughFiftyTickets(int amount) {
        return this.getFiftyTickets() > amount;
    }

    private boolean gotEnoughTwentyFiveTickets(int amount) {
        return this.getTwentyFiveTickets() > amount;
    }

    private boolean makeChangeWithTwentyFiveAndFifty() {
        reduceTwentyFiveTickets(1);
        reduceFiftyTickets(1);
        return true;
    }

    private void reduceFiftyTickets(int amount) {
        this.setFiftyTickets(this.getFiftyTickets() - amount);
    }

    private boolean gotChangeForFifty() {
        if (this.getTwentyFiveTickets() > 0) return makeChangeWithTwentyFive(1);
        return false;
    }

    private boolean makeChangeWithTwentyFive(int amount) {
        reduceTwentyFiveTickets(amount);
        return true;
    }

    private void reduceTwentyFiveTickets(int amount) {
        this.setTwentyFiveTickets(this.getTwentyFiveTickets() - amount);
    }





    public int getFiftyTickets() {
        return fiftyTickets;
    }

    public void setFiftyTickets(int fiftyTickets) {
        this.fiftyTickets = fiftyTickets;
    }

    public int getTwentyFiveTickets() {
        return twentyFiveTickets;
    }

    public void setTwentyFiveTickets(int twentyFiveTickets) {
        this.twentyFiveTickets = twentyFiveTickets;
    }


}
