package questions.parkingLot;

public class ParkingSpot {
    private VehicleType type;
    private boolean isOccupied;

    public ParkingSpot(VehicleType type, boolean isOccupied) {
        this.type = type;
        this.isOccupied = false;
    }

    public void parkVehicle() {
        this.isOccupied = true;
    }

    public void leaveVehicle() {
        this.isOccupied = false;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }



}
