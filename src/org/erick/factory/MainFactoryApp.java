package org.erick.factory;

import org.erick.strategy.Transmission;
import org.erick.strategy.Transmitter;
import org.erick.strategy.UtilTransmission;

public class MainFactoryApp {
	
	public static void main(String [] args) {
		Transmitter transmitter = UtilTransmission.getUserChoiceTransmitter();
		Transmission transmission = TransmissionFactory.createTransmission(transmitter);
		transmission.sendFile(UtilTransmission.TX_SOURCE, UtilTransmission.TX_DESTINATION);
		transmission.receiveFile(UtilTransmission.RX_DESTINATION, UtilTransmission.RX_SOURCE);
	}
	
}
