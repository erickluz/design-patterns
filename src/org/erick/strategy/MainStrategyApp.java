package org.erick.strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainStrategyApp {
	
	private static final String TX_SOURCE = "D:\\dev\\artefacts\\project1\\target\\project1.ear";
	private static final String TX_DESTINATION = "/etc/jboss/deployment/";
	private static final String RX_SOURCE = "/etc/apache/server.log";
	private static final String RX_DESTINATION = "D:\\dev\\logs\\";
	
	public static void main(String [] args) {
        Transmitter transmitterChosen = getUserChoice();
        Transmission transmitter;
        switch (transmitterChosen) {
        	case GOOGLE_DRIVE: {
        		transmitter = new GoogleDrive();
        		transmitter.sendFile(TX_SOURCE, TX_DESTINATION);
        		transmitter.receiveFile(RX_DESTINATION, RX_SOURCE);
        		break;
        	}
        	case SCP: {
        		transmitter = new SCP();
        		transmitter.sendFile(TX_SOURCE, TX_DESTINATION);
        		transmitter.receiveFile(RX_DESTINATION, RX_SOURCE);	
        		break;
        	}
        	case SFTP: {
        		transmitter = new SFTP();
        		transmitter.sendFile(TX_SOURCE, TX_DESTINATION);
        		transmitter.receiveFile(RX_DESTINATION, RX_SOURCE);
        		break;
        	}
        	default: System.out.println("Invalid choice");
        }
	}
	
	private static Transmitter getUserChoice() {
		System.out.println("Please choose one of bellow Transmitters");
		Transmitter.getAllValues().forEach(transmitter -> System.out.println(transmitter.getId() + " - " + transmitter.getDescription()));
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		Transmitter choice = null;
        try {
			String input = bufferRead.readLine();
			choice = Transmitter.fromId(Integer.valueOf(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
        return choice;
	}

}
