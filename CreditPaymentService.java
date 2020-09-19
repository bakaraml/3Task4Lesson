public class CreditPaymentService {
    public double calculate (long amount, double procent, long mounth) {

        double procent1 = procent / 100 / 12;

        double total = amount * (procent1 + (procent1 / ((Math.pow((1 + procent1), mounth)) - 1)));

        return total;
    }
}
