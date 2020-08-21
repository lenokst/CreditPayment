public class CreditPaymentService {
    public long calculate (double interestRate, int month, long creditAmount) {
        double interestRate_month = interestRate / 12 / 100;
        double annuityRate = interestRate_month + interestRate_month / (Math.pow((1 + interestRate_month), month)- 1);
        double result = creditAmount * annuityRate;
        return (int)result;
    }
}
