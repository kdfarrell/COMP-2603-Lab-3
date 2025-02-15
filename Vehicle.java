public class Vehicle{
    
    private static int plateNumberCounter = 1;
    
    private int tankCapacity;
    private String fuelType;
    private String plateID = "";
    
    // Constructor
    public Vehicle(int length, int breadth, int width){
        tankCapacity = length * breadth * width;
        if(tankCapacity%2 == 0)
            fuelType = "gasoline";
        else
            fuelType = "diesel";
        setPlateID();
    }
    
    // Accessors
    public int getTankCapacity(){
        return tankCapacity;
    }
    
    public String getFuelType(){
        return fuelType;
    }
    
    public String getPlateID () {
        return plateID;
    }
    
    // Mutator
    private void setPlateID() {
        if (plateNumberCounter < 10) {
            String s = getPlateID();
            this.plateID = "TAB0" + plateNumberCounter;
            plateNumberCounter++;
        }
        else {
            this.plateID = "TAB" + plateNumberCounter;
            plateNumberCounter++;
        }
    }
    
    public String toString(){
        return "VEHICLE TANK CAPACITY: "+ getTankCapacity() +
               " FUEL TYPE: "+ getFuelType() +
               " PLATE ID: " + getPlateID();
    }    
}