public class Vehicle{
    
    private static int plateNumberCounter = 1;
    
    private int tankCapacity;
    private String fuelType;
    private String plateID;
    private int vehicleClassification;
    
    // Constructor
    public Vehicle(int length, int breadth, int width){
        tankCapacity = length * breadth * width;
        if(tankCapacity%2 == 0)
            fuelType = "gasoline";
        else
            fuelType = "diesel";
        setPlateID();
        setVehicleClassification(3);
    }
    
    // Overloaded Constructor
    public Vehicle(int length, int breadth, int width, int vehicleClassification){
        this(length, breadth, width);
        setVehicleClassification(vehicleClassification);
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
    
    public int getVehicleClassification() {
        return vehicleClassification;
    }
    
    public String getVehicleClassification(int vehicleClassification) {
        switch (vehicleClassification) {
            case 1 : return "Motorcycle";
            case 3 : return "Light Motor Vehicle";
            case 4 : return "Heavy Motor Vehicle";
        }
        return null;
    }

    
    // Mutator
    private void setPlateID() {
        if (plateNumberCounter < 10) {
            this.plateID = "TAB0" + plateNumberCounter;
        }
        else {
            this.plateID = "TAB" + plateNumberCounter;
        }
        plateNumberCounter++;
    }
    
    private void setVehicleClassification(int value) {
        if (value == 1 || value == 4) {
            this.vehicleClassification = value;
        }
        else {
            this.vehicleClassification = 3;
        }
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            String otherVehiclePlateID = v.getPlateID();
            boolean result = this.plateID.equals(otherVehiclePlateID);
            return result;
        }
        return false;
    }
    
    
    
    
    public String toString(){
        return "VEHICLE TANK CAPACITY: "+ getTankCapacity() +
               " FUEL TYPE: "+ getFuelType() +
               " PLATE ID: " + getPlateID() +
               " VEHICLE CLASSIFICATION: " + getVehicleClassification() +
               " : " + getVehicleClassification(this.vehicleClassification);
    }    
}