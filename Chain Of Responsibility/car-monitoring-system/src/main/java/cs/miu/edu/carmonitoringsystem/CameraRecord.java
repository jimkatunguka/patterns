package cs.miu.edu.carmonitoringsystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CameraRecord {
    private String licencePlate;
    private int speed;
    private int cameraId;

    RecordReceiver recordReceiver;

    public CameraRecord(String licencePlate, int speed, int cameraId) {
        this.licencePlate = licencePlate;
        this.speed = speed;
        this.cameraId = cameraId;
    }
}
