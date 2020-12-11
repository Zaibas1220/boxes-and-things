import java.util.ArrayList;

public class Box implements ToBeStored{

    private double capacity;
    private ArrayList<ToBeStored> store;

    public Box (double capacity){
        this.capacity = capacity;
        this.store = new ArrayList<>();
    }
    
    public void add (ToBeStored toBeStored){
        if (weight() + toBeStored.weight() < this.capacity){
            store.add(toBeStored);
        }
    }

    @Override
    public double weight(){
        double weight = 0;
        for (ToBeStored toBeStored : store){
            weight += toBeStored.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + store.size() + " things, total weight " + weight() + "kg";
    }
}
