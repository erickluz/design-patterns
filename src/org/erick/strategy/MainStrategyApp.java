package org.erick.strategy;

import org.erick.factory.RemoteFileTransporterFactory;

public class MainStrategyApp {
	
	public static void main(String [] args) {
        Transporter transporterChosen = RemoteFileTransporterFactory.getUserChoiceTransmitter();
        FileTransporter transporter;
        switch (transporterChosen) {
        	case GOOGLE_DRIVE: {
        		transporter = new GoogleDrive();
        		transporter.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
        		transporter.move(UtilFileTransporter.RX_DESTINATION, UtilFileTransporter.RX_SOURCE);
        		break;
        	}
        	case SCP: {
        		transporter = new SCP();
        		transporter.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
        		transporter.move(UtilFileTransporter.RX_DESTINATION, UtilFileTransporter.RX_SOURCE);	
        		break;
        	}
        	case SFTP: {
        		transporter = new SFTP();
        		transporter.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
        		transporter.move(UtilFileTransporter.RX_DESTINATION, UtilFileTransporter.RX_SOURCE);
        		break;
        	}
        	default: System.out.println("Invalid choice");
        }
	}

}
