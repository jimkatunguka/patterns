package cs.miu.edu.carmonitoringsystem;

import java.util.ArrayList;
import java.util.List;

public class RegistrationCarHandler extends CameraRecordHandler{
    List<String> notRegisteredCars = new ArrayList<>();

    public RegistrationCarHandler(CameraRecordHandler nextHandler) {
        super(nextHandler);
        notRegisteredCars.add("AS 2003");
        notRegisteredCars.add("KM 0098");
        notRegisteredCars.add("VG 8799");
    }

    @Override
    public void handleCameraRecord(CameraRecord cameraRecord) {
        if (notRegisteredCars.contains(cameraRecord.getLicencePlate())) {
            System.out.println("Car not registered:  "+ cameraRecord);
        }

        if (nextHandler != null) {
            nextHandler.handleCameraRecord(cameraRecord);
        }
    }
}
