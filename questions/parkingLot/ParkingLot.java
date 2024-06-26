package questions.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpotList;
    private int levels;

    // the total parking spots will be parkingSpotList * Levels

    public ParkingLot(List<ParkingSpot> parkingSpotList, int levels) {
        this.parkingSpotList = parkingSpotList;
        this.levels = levels;
    }

    public ParkingLot() {
        parkingSpotList = new ArrayList<>();
    }

    // check if I get three empty parking slots
    // then park van

    public boolean parkVan(Van van) {
        boolean parked = false;
        int cons = 0;
        for (int i = 0; i < levels * parkingSpotList.size(); i++) {
            if (!parkingSpotList.get(i).isOccupied()) {
                cons++;
            }
            if (cons == 3) {
                // all the three spots must be assigned to van
                for (int j = i; j > i - 3; j--) {
                    parkingSpotList.get(j).parkVehicle();
                }
                parked = true;
            }
        }

        return parked;
    }


}
