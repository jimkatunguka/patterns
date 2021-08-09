package cs.miu.edu.carmonitoringsystem;

import java.util.HashMap;
import java.util.Map;

public class CarOwnerHandler extends CameraRecordHandler{
    Map<String, CarOwner> carOwners = new HashMap<String, CarOwner>();

    public CarOwnerHandler(CameraRecordHandler nextHandler) {
        super(nextHandler);
        carOwners.put("KL 0001", new CarOwner("John Doe", 250.0));
    }

    @Override
    public void handleCameraRecord(CameraRecord cameraRecord) {
        if (carOwners.containsKey(cameraRecord.getLicencePlate())) {
            System.out.println("Car detected whose owner has unpaid tickets:  " + cameraRecord + " Owner: " + carOwners.get(cameraRecord.getLicencePlate()));
        }
        if (nextHandler != null) {
            nextHandler.handleCameraRecord(cameraRecord);
        }
    }
}
