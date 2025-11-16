package domain;

public non-sealed class Manager extends Employee {

    private String login;

    private String password;

    private double commission;

    public Manager(String code, String name, double salary,
                   String login, String password, double commission) {
        super(code, name, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    public Manager() {
    }

    @Override
    public String getCode() {
        return "MN" + super.getCode();
    }

    @Override
    public double getfullSalary() {
        return getSalary() + commission;
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" | Login: %s | Commission: %.2f", login, commission);

    }
}