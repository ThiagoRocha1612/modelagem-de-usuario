public non-sealed class Manager extends Employee{

    private String login;

    private String password;

    private double commission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassaword() {
        return password;
    }

    public void setPassaword(String passaword) {
        this.password = passaword;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
