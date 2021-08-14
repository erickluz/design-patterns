package org.erick.factory;

import org.erick.strategy.GoogleDrive;
import org.erick.strategy.SCP;
import org.erick.strategy.SFTP;
import org.erick.strategy.Transmission;
import org.erick.strategy.Transmitter;

public class TransmissionFactory {

	public static Transmission createTransmission(Transmitter selectedTransmitter) {
		Transmission transmission;
        switch (selectedTransmitter) {
        	case GOOGLE_DRIVE: {
        		transmission = new GoogleDrive();
        		break;
        	}
        	case SCP: {
        		transmission = new SCP();	
        		break;
        	}
        	case SFTP: {
        		transmission = new SFTP();
        		break;
        	}
        	default: {
        		throw new IllegalArgumentException();
        	}
        }
        return transmission;
	}
}
