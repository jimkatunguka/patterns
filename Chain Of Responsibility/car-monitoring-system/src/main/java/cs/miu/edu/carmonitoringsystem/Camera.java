package cs.miu.edu.carmonitoringsystem;

public class Camera {
    RecordReceiver recordReceiver;

    public Camera(RecordReceiver recordReceiver) {
        this.recordReceiver = recordReceiver;
    }

    public void  createRecord(){
        recordReceiver.receiveRecord(new CameraRecord("KM 0098", 69, 3));
        recordReceiver.receiveRecord(new CameraRecord("AS 2003", 55, 3));
        recordReceiver.receiveRecord(new CameraRecord("SS 3333", 78, 2));
        recordReceiver.receiveRecord(new CameraRecord("LX 1243", 92, 1));
        recordReceiver.receiveRecord(new CameraRecord("KP 9978", 69, 7));
        recordReceiver.receiveRecord(new CameraRecord("GG 1112", 56, 3));
        recordReceiver.receiveRecord(new CameraRecord("FX 1333", 71, 1));
    }
}
