
public class TaxCalculator {

    private double totalTaxes;

    public void record(Taxable t) {
        double value = t.getTaxAmount();
        this.totalTaxes += value;
    }

    public double getTaxAmount(){
        return totalTaxes;
    }

}