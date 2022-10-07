package compte;

import client.Client;

public class Compte {
    private int balance;
    private Client client;

    public Compte(int balance, Client client) {
        this.balance = balance;
        this.client = client;
    }

    public Client getClient() {
        return this.client;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
