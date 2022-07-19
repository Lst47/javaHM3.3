public class CreditPaymentService {
    public double calculate(int a, double b, int c) {
        //double summPay;
        //double f;
        double percentM = b / (100 * 12);
        //double math = Math.pow(1+percentM,c);
        // summPay = (percentM*math)/(math-1);
        //f = summPay * a;
        double math = a * (percentM / (1 - (Math.pow((1 + percentM), -c))));
        return math;
    }
}
