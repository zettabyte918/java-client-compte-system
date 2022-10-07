import client.Client;
import compte.Compte;

public class bank {
    private static Compte[] comptes = new Compte[10];
    private static Client[] clients = new Client[10];
    public static void main(String[] args) {

        
        // create two clients
        clients[0] = new Client("Houssem", "12345678");
        clients[1] = new Client("Omar", "987654321");

        // create an account for each client
        comptes[0] = new Compte(1000, clients[0]);
        comptes[1] = new Compte(459, clients[1]);

        // show client data
        System.out.println("name: "+comptes[0].getClient().getName()+" cin: "+comptes[0].getClient().getCin()+" balance: "+comptes[0].getBalance());
        System.out.println("name: "+comptes[1].getClient().getName()+" cin: "+comptes[1].getClient().getCin()+" balance: "+comptes[1].getBalance());
    }
}
