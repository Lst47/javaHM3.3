import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1000000;
        double percent = 9.99;
        int year = 12;
        int doubleYear = 24;
        int tripleYear = 36;
        int q = (int) service.calculate(summ,percent,year);
        int g = (int) service.calculate(summ,percent,doubleYear);
        int f = (int) service.calculate(summ,percent,tripleYear);

        System.out.println("При сроке кридита в 12 месяцев, платеж - "+q);
        System.out.println("При сроке кридита в 24 месяцев, платеж - "+g);
        System.out.println("При сроке кридита в 36 месяцев, платеж - "+f);
    }
}
