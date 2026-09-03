package main.dosw.semana_1.streams;

public class Transaction {
    private String id;
    private double amount;
    private boolean approved;

    public Transaction(String id, double amount, boolean approved){
        this.id = id;
        this.amount = amount;
        this.approved = approved;
    }

    public String getId(){return id;}
    public double getAmount(){return amount;}
    public boolean isApproved(){return approved;}

    @Override
    public String toString() {
        return "Transaction{" + "id='" + id + '\'' + ", amount=" + amount + ", approved=" + approved +'}';
    }
}
