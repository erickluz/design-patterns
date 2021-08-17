package org.erick.strategy.remote;

import org.erick.strategy.FileTransporter;

public class SCP implements FileTransporter {

	@Override
	public void copy(String sourceFileDirectory, String fileDestination) {
		System.out.println("Sending the file to SCP Server");
		System.out.println("File Sent!");
	}

	@Override
	public void move(String sourceFileDirectory, String fileDestination) {
		System.out.println("Receiving the file from SCP Server");
		System.out.println("File Received!");
	}

}
