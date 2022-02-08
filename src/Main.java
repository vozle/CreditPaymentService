public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment12month = (int) service.calculate(1000000,12, 9.99f);
        System.out.println("Ваш ежемесячный платёж составляет: " + monthlyPayment12month + " рублей");

        int monthlyPayment24month = (int) service.calculate(1000000, 24, 9.99f);
        System.out.println("Ваш ежемесячный платёж составляет: " + monthlyPayment24month + " рублей");

        int monthlyPayment36month = (int) service.calculate(1000000,36, 9.99f);
        System.out.println("Ваш ежемесячный платёж составляет: " + monthlyPayment36month + " рублей");
    }
}