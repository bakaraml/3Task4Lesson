public class CreditPaymentService {
    public double calculate (long amount, double percent, long mounth) {

        double percent1 = percent / 100 / 12;

        double total = amount * (percent1 + (percent1 / ((Math.pow((1 + percent1), mounth)) - 1)));

        return total;
    }
}
