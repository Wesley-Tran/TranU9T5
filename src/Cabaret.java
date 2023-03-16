import java.util.ArrayList;

public class Cabaret {

    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer newPerson) {
        if (!performers.contains(newPerson)) {
            performers.add(newPerson);
            return true;
        }
        return false;
    }
    public boolean removePerformer(Performer person) {
        if (performers.indexOf(person) > -1) {
            performers.remove(person);
            return true;
        }
        return false;
    }

    public double averagePerformerAge() {
        int sum = 0;
        for (Performer i : performers) {
            sum += i.getAge();
        }
        return ((double) sum)/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int overAge) {
        ArrayList<Performer> returnList = new ArrayList<>();
        for (Performer i : performers) {
            if (i.getAge() >= overAge) {
                returnList.add(i);
            }
        }
        return returnList;
    }

    public void groupRehearsal() {
        for (Performer i : performers) {
        System.out.println("REHEARSAL CALL! " + i.getName());
            if (i instanceof Comedian) {
                ((Comedian) i).rehearse(false);
            } else {
                i.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer i : performers) {
            System.out.println("Welcome to the cabaret! Next at up..." + i.getName());
            if (i instanceof Dancer) {
                ((Dancer) i).pirouette(2);
            }
            i.perform();
        }
    }


}
