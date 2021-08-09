package cs.miu.edu.carmonitoringsystem;

public class RecordReceiver {
    private CameraRecordHandler firstHandler;

    public void receiveRecord(CameraRecord cameraRecord) {
        firstHandler.handleCameraRecord(cameraRecord);
    }

    public void setFirstHandler(CameraRecordHandler firstHandler) {
        this.firstHandler = firstHandler;
    }
}
