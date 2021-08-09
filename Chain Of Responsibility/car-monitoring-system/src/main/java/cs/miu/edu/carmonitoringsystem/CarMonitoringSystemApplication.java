package cs.miu.edu.carmonitoringsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarMonitoringSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarMonitoringSystemApplication.class, args);
		RecordReceiver recordReceiver = new RecordReceiver();
		Camera camera = new Camera(recordReceiver);

		// create chain of handlers
		CarOwnerHandler carOwnerHandler = new CarOwnerHandler(null);
		StolenCarHandler stolenCarHandler = new StolenCarHandler(carOwnerHandler);
		SpeedingCarHandler speedingCarHandler = new SpeedingCarHandler(stolenCarHandler);
		RegistrationCarHandler registrationCarHandler = new RegistrationCarHandler(speedingCarHandler);

		recordReceiver.setFirstHandler(registrationCarHandler);

		camera.createRecord();
	}

}
