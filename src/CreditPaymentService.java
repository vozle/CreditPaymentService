public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, float loanRate) {
        float monthlyRate = loanRate / 100 / 12;
        double pow = Math.pow(1+monthlyRate,loanTerm);
        double monthlyPayment = (loanAmount * (monthlyRate + (monthlyRate / (pow - 1))));
        return monthlyPayment;
    }
}

