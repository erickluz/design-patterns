package org.erick.abstractfactory;

import org.erick.strategy.FileTransporter;
import org.erick.strategy.UtilFileTransporter;

public class MainAbstractFactory {

	public static void main(String [] args) {
		FileTransporter transporter = FileTransporterFactory.configureTransporter();
		transporter.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
		transporter.move(UtilFileTransporter.RX_DESTINATION, UtilFileTransporter.RX_SOURCE);
	}
	
}
