package domain;

public non-sealed class Salesman extends Employee{

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String code,
                    String name,
                    String address,
                    int age,
                    double salary,
                    double percentPerSold,
                    double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    @Override
    public double getfullSalary() {
        return this.salary + (soldAmount*percentPerSold)/100;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }
    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }
    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" | Percent per Sold: %.2f%% | Sold Amount: %.2f", percentPerSold, soldAmount);
    }
}
