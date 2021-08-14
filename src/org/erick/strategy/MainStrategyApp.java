package org.erick.strategy;

public class MainStrategyApp {
	
	public static void main(String [] args) {
        Transmitter transmitterChosen = UtilTransmission.getUserChoiceTransmitter();
        Transmission transmitter;
        switch (transmitterChosen) {
        	case GOOGLE_DRIVE: {
        		transmitter = new GoogleDrive();
        		transmitter.sendFile(UtilTransmission.TX_SOURCE, UtilTransmission.TX_DESTINATION);
        		transmitter.receiveFile(UtilTransmission.RX_DESTINATION, UtilTransmission.RX_SOURCE);
        		break;
        	}
        	case SCP: {
        		transmitter = new SCP();
        		transmitter.sendFile(UtilTransmission.TX_SOURCE, UtilTransmission.TX_DESTINATION);
        		transmitter.receiveFile(UtilTransmission.RX_DESTINATION, UtilTransmission.RX_SOURCE);	
        		break;
        	}
        	case SFTP: {
        		transmitter = new SFTP();
        		transmitter.sendFile(UtilTransmission.TX_SOURCE, UtilTransmission.TX_DESTINATION);
        		transmitter.receiveFile(UtilTransmission.RX_DESTINATION, UtilTransmission.RX_SOURCE);
        		break;
        	}
        	default: System.out.println("Invalid choice");
        }
	}

}
