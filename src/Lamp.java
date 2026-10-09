public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt){
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    @Override
    public String toString() {
        return "Lamp: " + watt + "W";
    }

    //Gettere:


    public int getWatt() {
        return watt;
    }
}
