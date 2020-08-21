public class CreditPayment {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long result = service.calculate(9.99, 36, 1000000);
        System.out.println(result);
    }
}
