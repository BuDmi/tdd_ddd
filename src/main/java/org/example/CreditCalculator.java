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

    private float calcAnnuity(float monthlyPercent) {
        return (float) ((monthlyPercent * Math.pow(1 + monthlyPercent, creditMonthsNum)) /
            (Math.pow(1 + monthlyPercent, creditMonthsNum) - 1));
    }

    public float calcMonthlyPayment() {
        return creditAmount * calcAnnuity(monthlyPerCent);
    }

    public float calcWholeRemainingSum() {
        return creditAmount * (calcAnnuity(monthlyPerCent) * creditMonthsNum);
    }

    public float calcOverpayment() {
        return calcWholeRemainingSum() - creditAmount;
    }
}
