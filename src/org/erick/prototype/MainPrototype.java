package org.erick.prototype;

import org.erick.abstractfactory.FileTransporterFactory;
import org.erick.strategy.FileTransporter;
import org.erick.strategy.UtilFileTransporter;

public class MainPrototype {

	public static void main(String[] args) {
		FileTransporter fileTransporter = FileTransporterFactory.configureTransporter();
		fileTransporter.copy(UtilFileTransporter.RX_SOURCE, UtilFileTransporter.RX_DESTINATION);
		FileTransporter fileTransporterClone = fileTransporter.clone();
		fileTransporterClone.copy(UtilFileTransporter.TX_SOURCE, UtilFileTransporter.TX_DESTINATION);
		System.out.println("We create a new reference? : " + !(fileTransporter.equals(fileTransporterClone)));
	}

}
