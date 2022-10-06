package org.example;

public class CreditCalculator {
    private final int creditMonthsNum;
    private final int creditAmount;
    private final float monthlyPerCent;
    public CreditCalculator(int creditYearsNum, int creditAmount, float perCent) {
        this.creditMonthsNum = creditYearsNum * 12;
        this.creditAmount = creditAmount;
        this.monthlyPerCent = perCent / 12;
    }

    public float calcMonthlyPayment() {
        return 0f;
    }

    public float calcWholeRemainingSum() {
        return 0f;
    }

    public float calcOverpayment() {
        return 0f;
    }
}
