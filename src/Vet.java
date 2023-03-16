import java.util.ArrayList;

public class Vet {

    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public void addClient(Animal newAni) {
        if (clients.indexOf(newAni) > -1) {
            System.out.println(newAni.getName()+ " is already a client of " + name);
        } else {
            System.out.println("Welcome to " + name + "'s office, " + newAni.getName());
            clients.add(newAni);
        }

    }

}
