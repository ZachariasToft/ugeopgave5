import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name){
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){
        int lampCount = 0;
        for (Room room: rooms){
            lampCount+= room.getLampCount();
        }
        return lampCount;
    }

    public int getTotalWatt(){
        int wattCount = 0;
        for (Room room: rooms){
            wattCount += room.getTotalWatt();
        }
        return wattCount;
    }

    public void printBuilding(){
        System.out.println("BUILDING: " + name);
        System.out.println();

        for (Room room: rooms){
            room.printRoom();
            System.out.println();
        }
    }
}
