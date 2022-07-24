public class CreditPaymentService {
    public double calculate(int summ, double percent, int year) {
        double percentM = percent / (100 * 12);
        double math = summ * (percentM / (1 - (Math.pow((1 + percentM), -year))));
        return math;
    }
}
