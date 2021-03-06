package org.erick.factory;

import org.erick.strategy.FileTransporter;
import org.erick.strategy.UtilFileTransporter;

public class MainFactoryApp {
	
	public static void main(String [] args) {
		RemoteFileTransporterFactory remoteFileTransporter = new RemoteFileTransporterFactory();
		FileTransporter transporter = remoteFileTransporter.createTransporter();
		transporter.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
		transporter.move(UtilFileTransporter.RX_DESTINATION, UtilFileTransporter.RX_SOURCE);
	}
	
}
