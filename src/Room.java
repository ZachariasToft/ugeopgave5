import java.util.ArrayList;

public class Room{
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name){
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    public void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }

    public int getTotalWatt(){
        int wattCount = 0;
        for (Lamp lamp: lamps){
            wattCount += lamp.getWatt();
        }

        return wattCount;
    }

    public int getTotalWindowArea(){
        int windowArea = 0;
        for (Window window: windows){
            windowArea += window.getAreaCm2();
        }
        return windowArea;
    }

    public void printRoom(){
        System.out.println("Room: " + name);
        System.out.println();
        System.out.println("Lamps: ");
        for (Lamp lamp: lamps){
            System.out.println("   " + lamp);
        }
        System.out.println("Windows:");
        for (Window window: windows){
            System.out.println("   " + window);
        }

    }




}
