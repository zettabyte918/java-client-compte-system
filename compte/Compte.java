package compte;

import client.Client;

public class Compte {
    private int balance;
    private Client client;

    public static void main(String[] args) {

        // create two clients
        Client c1 = new Client("Houssem", "12345678");
        Client c2 = new Client("Omar", "987654321");

        // create an account for each client
        Compte compte1 = new Compte(1000, c1);
        Compte compte2 = new Compte(459, c2);

        // show client data
        System.out.println("name: "+compte1.client.getName()+" cin: "+compte1.client.getCin()+" balance: "+compte1.getBalance());
        System.out.println("name: "+compte2.client.getName()+" cin: "+compte2.client.getCin()+" balance: "+compte2.getBalance());
    }

    public Compte(int balance, Client client) {
        this.balance = balance;
        this.client = client;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
