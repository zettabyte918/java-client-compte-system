package client;

public class Client {
    private String name;
    private String cin;

    public Client(String name, String cin) {
        this.name = name;
        this.cin = cin;
    }

    public String getName() {
        return this.name;
    }

    public String getCin() {
        return this.cin;
    }


}
