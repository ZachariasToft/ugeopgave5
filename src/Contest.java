public class Contest {
    private Animal animal1;
    private Animal animal2;
    private static int rounds;

    public Contest(Animal animal1, Animal animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.rounds = 0;
    }

    public void Round(){
        if (!animal1.isActive() || !animal2.isActive()){
            return;
        }
        rounds++;

        System.out.println("Round" + rounds);

        int damage = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - damage);

        if (animal2.isActive()){
            return;
        }

        damage = animal2.attack();
        animal1.setEnergy(animal1.getEnergy() - damage);

        System.out.println(animal2.getName() + " attacks " + animal1.getName() + " for " + damage + " damage");
        System.out.println(animal1.getName() + " has " + animal1.getEnergy() + " energy left");
    }

    public Animal getWinner(){
        if (animal1.isActive() && !animal2.isActive()){
            return animal1;
        }
        if (animal2.isActive() && !animal1.isActive()){
            return animal2;
        }
        return null;
    }

    public int getRounds() {
        return rounds;
    }
}
