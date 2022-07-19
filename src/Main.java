import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1000000;
        double percent = 9.99;
        int year = 12;
        double pay = (double) service.calculate(summ,percent,year);
        System.out.println("При сроке кридита в 12 месяцев, платеж - "+pay);

        year = 24;
        pay = (double) service.calculate(summ,percent,year);
        System.out.println("При сроке кридита в 24 месяцев, платеж - "+pay);

        year = 36;
        pay = (double) service.calculate(summ,percent,year);
        System.out.println("При сроке кридита в 36 месяцев, платеж - "+pay);


    }
}
