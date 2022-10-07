import client.Client;
import compte.Compte;

public class bank {
    public static void main(String[] args) {
        // create two clients
        Client c1 = new Client("Houssem", "12345678");
        Client c2 = new Client("Omar", "987654321");

        // create an account for each client
        Compte compte1 = new Compte(1000, c1);
        Compte compte2 = new Compte(459, c2);

        // show client data
        System.out.println("name: "+compte1.getClient().getName()+" cin: "+compte1.getClient().getCin()+" balance: "+compte1.getBalance());
        System.out.println("name: "+compte2.getClient().getName()+" cin: "+compte2.getClient().getCin()+" balance: "+compte2.getBalance());
    }
}
