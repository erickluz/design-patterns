package org.erick.factory;

import org.erick.strategy.GoogleDrive;
import org.erick.strategy.SCP;
import org.erick.strategy.SFTP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.erick.strategy.FileTransporter;
import org.erick.strategy.Transporter;

public class RemoteFileTransporterFactory {

	public static FileTransporter createTransporter() {
		Transporter selectedTransporter = getUserChoiceTransmitter();
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
	
	
	
	public static Transporter getUserChoiceTransmitter() {
		System.out.println("Please choose one of bellow Transmitters");
		Transporter.getAllValues().forEach(transmitter -> System.out.println(transmitter.getId() + " - " + transmitter.getDescription()));
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
