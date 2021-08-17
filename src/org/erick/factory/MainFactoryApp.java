package org.erick.factory;

import org.erick.strategy.FileTransporter;
import org.erick.strategy.UtilFileTransporter;

public class MainFactoryApp {
	
	public static void main(String [] args) {
		FileTransporter transmission = RemoteFileTransporterFactory.createTransporter();
		transmission.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
		transmission.move(UtilFileTransporter.RX_DESTINATION, UtilFileTransporter.RX_SOURCE);
	}
	
}
