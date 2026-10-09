public class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public boolean isActive(){
        return energy > 0;
    }

    public int attack() {
        return 0;
    }

    @Override
    public String toString() {
        return name + "(energy: " + energy + ")";
    }

    //gettere/settere;
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
