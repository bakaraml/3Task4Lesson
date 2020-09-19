public class CreditPayment {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double total = service.calculate(1000000, 9.99, 12);
        int result = (int) Math.round(total);
        System.out.println("Ежемесячный платеж составит " + result + " рублей");

        double total1 = service.calculate(1000000, 9.99, 24);
        int result1 = (int) Math.round(total1);
        System.out.println("Ежемесячный платеж составит " + result1 + " рублей");

        double total2 = service.calculate(1000000, 9.99, 36);
        int result2 = (int) Math.round(total2);
        System.out.println("Ежемесячный платеж составит " + result2 + " рублей");
    }

}



