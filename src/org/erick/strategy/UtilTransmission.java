package org.erick.strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtilTransmission {
	public static final String TX_SOURCE = "D:\\dev\\artefacts\\project1\\target\\project1.ear";
	public static final String TX_DESTINATION = "/etc/jboss/deployment/";
	public static final String RX_SOURCE = "/etc/apache/server.log";
	public static final String RX_DESTINATION = "D:\\dev\\logs\\";
	
	
	public static Transmitter getUserChoiceTransmitter() {
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
