package org.erick.factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.erick.abstractfactory.FileTransporterFactory;
import org.erick.strategy.FileTransporter;
import org.erick.strategy.Transporter;
import org.erick.strategy.remote.GoogleDrive;
import org.erick.strategy.remote.SCP;
import org.erick.strategy.remote.SFTP;

public class RemoteFileTransporterFactory implements FileTransporterFactory {

	@Override
	public FileTransporter createTransporter() {
		Transporter selectedTransporter = getUserChoiceTransporter();
		FileTransporter transporter;
        switch (selectedTransporter) {
        	case GOOGLE_DRIVE: {
        		transporter = new GoogleDrive();
        		break;
        	}
        	case SCP: {
        		transporter = new SCP();	
        		break;
        	}
        	case SFTP: {
        		transporter = new SFTP();
        		break;
        	}
        	default: {
        		throw new IllegalArgumentException();
        	}
        }
        return transporter;
	}
	
	
	
	public static Transporter getUserChoiceTransporter() {
		System.out.println("Please choose one of bellow Transporters");
		Transporter.getAllRemoteTransporters().forEach(transmitter -> System.out.println(transmitter.getId() + " - " + transmitter.getDescription()));
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		Transporter choice = null;
        try {
			String input = bufferRead.readLine();
			choice = Transporter.fromId(Integer.valueOf(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
        return choice;
	}
}
