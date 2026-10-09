import java.util.ArrayList;

public class Main{

    void main(String[] args) {

        //1:

        /*Lamp lamp1 = new Lamp(60);
        Lamp lamp2 = new Lamp(40);
        Lamp lamp3 = new Lamp(100);
        Window window1 = new Window(120,90);
        Window window2 = new Window(120,90);

        Lamp lamp4 = new Lamp(40);
        Lamp lamp5 = new Lamp(40);
        Window window3 = new Window(60,60);

        Room meetingLocal = new Room("meeting local");
        meetingLocal.addLamp(lamp1);
        meetingLocal.addLamp(lamp2);
        meetingLocal.addLamp(lamp3);
        meetingLocal.addWindow(window1);
        meetingLocal.addWindow(window2);

        Room kitchen = new Room("kitchen");
        kitchen.addLamp(lamp4);
        kitchen.addLamp(lamp5);
        kitchen.addWindow(window3);

        Building building = new Building("Office");
        building.addRoom(meetingLocal);
        building.addRoom(kitchen);
        building.printBuilding();

        System.out.println("Total lamps: " + building.getTotalLampCount());
        System.out.println("Total watt: " + building.getTotalWatt());*/

        //5 lamps in total
        //280 watt in total

        //2:

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Lion",50));
        animals.add(new Rabbit("Rabbit",100));
        animals.add(new Wolf("Wolf",80));
        animals.add(new Lion("Simba",50));

        System.out.println("ANIMALS: ");
        System.out.println();

        for (Animal animal: animals){
            System.out.println(animal);
        }
        System.out.println();

        playContest(animals.get(0), animals.get(1));
        playContest(animals.get(2), animals.get(3));
    }

    private static void playContest(Animal animal1, Animal animal2) {
        System.out.println(animal1.getName() + " VS " + animal2.getName());
        System.out.println();

        Contest contest = new Contest(animal1, animal2);

        while(contest.getWinner() == null){
            contest.Round();
        }

        Animal winner = contest.getWinner();

        System.out.println();
        System.out.println("Winner: " + winner);
        System.out.println("Rounds: " + contest.getRounds());
        System.out.println();
    }

    //3:





}


