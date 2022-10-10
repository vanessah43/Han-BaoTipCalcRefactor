public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator (int party, int percent) {
        numPeople = party;
        tipPercentage = percent;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public void setTotalBillBeforeTip(double bill) {
        totalBillBeforeTip = bill;
    }
    public double tipAmount() {
        double tip = totalBillBeforeTip * tipPercentage / 100;
        return tip;
    }

    public double totalBill () {
        return (totalBillBeforeTip + tipAmount());
    }

    public double perPersonCostBeforeTip() {
        return (totalBill() / numPeople);
    }

    public double perPersonTipAmount() {
        return (tipAmount() / numPeople);
    }

    public double perPersonTotalCost() {
        return (perPersonCostBeforeTip() + perPersonTipAmount());
    }


}
