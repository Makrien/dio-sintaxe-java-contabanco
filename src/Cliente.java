public class Cliente {
    private String name;
    private int number;
    private String agency;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void registerClient() {
        setName(IO.getString("Nome do cliente: "));
        setNumber(IO.getInt("Número: "));
        setAgency(IO.getString("Agência: "));
        setBalance(IO.getDouble("Saldo: "));
        System.out.printf("Olá %s, obrigado por criar sua conta em nosso banco!\n\nSua agência é %s, conta nº %d e seu saldo de R$%.2f já está disponível para o saque.\n\n", getName(), getAgency(), getNumber(), getBalance());
    }
}












